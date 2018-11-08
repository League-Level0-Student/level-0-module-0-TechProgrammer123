import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot Cozmo = new Robot();
	Cozmo.setSpeed(100);
	Cozmo.penDown();
	Cozmo.turn(160);
	Cozmo.move(180);
	Cozmo.turn(215);
	Cozmo.move(180);
	Cozmo.turn(140);
	Cozmo.move(180);
	Cozmo.turn(200);
	Cozmo.move(180);
}
}
