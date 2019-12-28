import org.junit.Test;
import static org.fest.assertions.api.Assertions.assertThat;
public class MarsRoverTest {

    @Test
    public void should_land_the_rover_on_land() {
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5, Rover.EAST);
        String position =rover.getPosition();
        assertThat(position).isEqualTo("55E");
    }

    @Test
    public void should_move_east() {
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5, Rover.EAST);
        rover.move();
        String position =rover.getPosition();
        assertThat(position).isEqualTo("65E");
    }
    @Test
    public void should_move_west() {
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5, Rover.WEST);
        rover.move();
        String position =rover.getPosition();
        assertThat(position).isEqualTo("45W");
    }
    @Test
    public void should_move_south() {
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5, Rover.SOUTH);
        rover.move();
        String position =rover.getPosition();
        assertThat(position).isEqualTo("54S");
    }
    @Test
    public void should_move_north() {
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5, Rover.NORTH);
        rover.move();
        String position =rover.getPosition();
        assertThat(position).isEqualTo("56N");
    }
    @Test
    public void should_turn_left() {
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5, Rover.EAST);
        rover.turnLeft();
        String position =rover.getPosition();
        assertThat(position).isEqualTo("55N");
    }
    @Test
    public void should_turn_right() {
        Area area = new Area(10,10);
        Rover rover = new Rover();
        rover.land(area,5,5, Rover.EAST);
        rover.turnRight();
        String position =rover.getPosition();
        assertThat(position).isEqualTo("55S");
    }

    @Test
    public void should_execute_batch_commands() {
        Rover rover = new Rover();
        RoverController roverController = new RoverController(rover);
        String mission = "10,10,5,5,E,M,L,M,R";
        String position = roverController.execute(mission);
        assertThat(position).isEqualTo("66E");
    }
}
