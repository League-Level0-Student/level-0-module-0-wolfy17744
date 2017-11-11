import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot rbt = new Robot();
		rbt.setSpeed(10);
		rbt.move(-250);
		rbt.penDown();
		rbt.move(500);
		rbt.setAngle(90);
		rbt.move(10);
		for (int i = 0; i < 180; i++) {
			rbt.move(2);
			rbt.turn(1);
			
		}
		rbt.move(10);
		rbt.setAngle(140);
		rbt.move(250);
	}
}
