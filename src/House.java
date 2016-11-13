import java.awt.Color;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

public class House {
	public class building {

		int wallHeight = 100;
		int roofWidth = 50;
		int grassWidth = 50;
		int x;
		int y;

		public building(int wallHeight, int roofWidth, int grassWidth) {
			this.wallHeight = wallHeight;
			this.roofWidth = roofWidth;
			this.grassWidth = grassWidth;
		}

		public void draw(Robot robot) {
			robot.setRandomPenColor();
			x = robot.getX();
			y = robot.getY();
			robot.move(wallHeight);
			robot.turn(60);
			robot.move(roofWidth);
			robot.turn(60);
			robot.move(roofWidth);
			robot.turn(60);
			robot.move(wallHeight);
			robot.turn(-90);
			robot.setRandomPenColor();
			robot.move(grassWidth);
			robot.turn(-90);
			robot.setRandomPenColor();

		}

		public void drawDoor(Robot robot) {
			int doorX = x + roofWidth;
			int doorY = y;
			int doorHeight = wallHeight / 3;
			int doorWidth = roofWidth / 3;
			robot.penUp();
			int oldX = robot.getX();
			int oldY = robot.getY();
			robot.penUp();
			robot.setRandomPenColor();
			robot.moveTo(doorX, doorY);
			robot.penDown();
			robot.move(doorHeight);
			robot.turn(90);
			robot.move(doorWidth);
			robot.turn(90);
			robot.move(doorHeight);
			robot.turn(180);
			robot.penUp();
			robot.moveTo(oldX, oldY);
			robot.penDown();

		}

	}

	public static void main(String[] args) {
		House house = new House();
		Robot john = new Robot();
		john.moveTo(10, john.getWindow().getHeight() - 40);
		john.penDown();
		john.setSpeed(10);
		for (int i = 0; i < 20; i++) {
			building sam = house.new building(new Random().nextInt(200), 50, 50);

			sam.draw(john);
			sam.drawDoor(john);

		}
	}
}