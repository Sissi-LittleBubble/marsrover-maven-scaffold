public class Area {
    private final int width;
    private final int heigth;
    public Area(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public boolean containsPointWithX(int xPosition) {
        if((xPosition+1)>width){
            return false;
        }
        return true;
    }

    public boolean containsPointWithY(int yPosition) {
        if((yPosition+1)>heigth){
            return false;
        }
        return true;
    }
}
