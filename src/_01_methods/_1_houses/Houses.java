package _01_methods._1_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	public void run() {
		// Check the recipe to find out what code to put here
		
		rob.setX(5);
		rob.setY(500);
		rob.penDown();
		rob.setSpeed(100);
		
		rob.move(100);
		rob.turn(90);
		rob.move(40);
		rob.turn(90);
		rob.move(100);
		rob.turn(-90);
		rob.setPenColor(0,128,0);
		rob.move(50); //grass
		rob.turn(-90);
		rob.setPenColor(Color.black);
		for (int i = 0; i < 9; i++) {
			drawHouse(100);
		}
		
	}

	public void drawHouse(int height) {
		rob.move(height);
		rob.turn(90);
		rob.move(40);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(0,128,0);
		rob.move(50); //grass
		rob.turn(-90);
		rob.setPenColor(Color.black);
	}
		
		// TODO Auto-generated method stub

}
