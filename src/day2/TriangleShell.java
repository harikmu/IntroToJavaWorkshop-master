package day2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot mo = new Robot();
	
	void go() {
		 // 3. delete this line (used only for testing)
		// 7. Do the following (up to step 10) 60 times
		int length = 50;
for (int i = 0; i < 60; i++) {
	

		// 6. Make the robot go as fast as possible
mo.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50

		

			// 9. Change the color of the pen to a random color
mo.setPenColor(Color.yellow);
			// 8. Increase the length variable by 10
length = length + 10;
			// 5. call your drawTriangle() method using your length variable
drawTriangle(length);
			// 10. Turn the robot 6 degrees to the right
mo.turn(6);
	}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
	mo.penDown();
	for (int i = 0; i < 3; i++) {
		mo.move(length);
		mo.turn(360/3);
	}
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
