package day2;

import org.jointheleague.graphical.robot.Robot;

import javafx.scene.paint.Color;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot hi = new Robot();
		// 5. Set your robot's pen to the down position
		
		// 3. Set the robot to go at max speed (10)
		
		// 4. Do the following (steps 6-8) 75 times
		for (int i = 0; i < 75; i++) {
			hi.setSpeed(400);
			hi.turn(360/7);
			hi.move(5*i);
			hi.setRandomPenColor();
			hi.setPenWidth(i);
			hi.penDown();
		}
			// 7. Change the pen color to random
		
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
			
			// 2. Turn the robot 1/7 of 360 degrees to the right
		
			// 8. Set the pen width to i
			
	}
}
