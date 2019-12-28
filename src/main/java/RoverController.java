public class RoverController {
    private Rover rover;
    public RoverController(Rover rover) {
        this.rover = rover;
    }

    public String execute(String mission) {
        String[] commands=mission.split(",");
        int areaWidth = Integer.parseInt(commands[0]);
        int areaHeight = Integer.parseInt(commands[1]);
        int x = Integer.parseInt(commands[2]);
        int y = Integer.parseInt(commands[3]);
        String direction = commands[4];

        rover.land(new Area(areaWidth,areaHeight),x,y,direction);
        int size = commands.length;
        for(int i=5;i<size;i++){
            if("M".equals(commands[i])){
                rover.move();
            }else if("L".equals(commands[i])){
                rover.turnLeft();
            }else {
                rover.turnRight();
            }

        }
        return rover.getPosition();
    }
}
