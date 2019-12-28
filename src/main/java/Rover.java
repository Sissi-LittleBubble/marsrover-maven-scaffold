public class Rover {
    public static final String EAST = "E";
    public static final String WEST = "W";
    public static final String SOUTH = "S";
    public static final String NORTH = "N";
    private int xPosition;
    private int yPosition;
    private String direction;

    public void land(Area area, int xPosition, int yPosition, String direction) {
        if(!area.containsPointWithX(xPosition)){
            throw new IllegalArgumentException("out of space");
        } else if(!area.containsPointWithY(yPosition)){
            throw new IllegalArgumentException("out of space");
        }
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public String getPosition() {
        return ""+this.xPosition+this.yPosition+this.direction;
    }

    public void move() {
        if(direction.equals(EAST)){
            xPosition += 1;
        }
        else if(direction.equals(WEST)){
            xPosition -= 1;
        }
        else if(direction.equals(SOUTH)){
            yPosition -= 1;
        }
        else if(direction.equals(NORTH)){
            yPosition += 1;
        }
    }

    public void turnLeft() {
        if(this.direction.equals((EAST))){
            this.direction = NORTH;
        }else if(this.direction.equals((NORTH))){
            this.direction = WEST;
        }else if(this.direction.equals((WEST))){
            this.direction = SOUTH;
        }else if(this.direction.equals((SOUTH))){
            this.direction = EAST;
        }
    }

    public void turnRight() {
        if(this.direction.equals((EAST))){
            this.direction = SOUTH;
        }else if(this.direction.equals((SOUTH))){
            this.direction = WEST;
        }else if(this.direction.equals((WEST))){
            this.direction = NORTH;
        }else if(this.direction.equals((NORTH))){
            this.direction = EAST;
        }
    }
}
