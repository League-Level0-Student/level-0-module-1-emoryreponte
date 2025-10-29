package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String Jameson = "Has an Atari, NES, SNES, N64, Gamecube, WII, WII-U, Nintendo switch, Nintendo switch 2, Sega genesis, Sega saturn, Sega Dreamcast, All playstations besides playstation 5, all XBOX's, and every nintendo handheld";
		String Robert_Kim = "Helps Emory(ME) code a game godot";
		String empty = "null";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("Give me a name of one of your friends");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if (name.equals("Jameson")) {
			JOptionPane.showMessageDialog(null, Jameson);
		}
		if (name.equals("Robert_Kim")) {
			JOptionPane.showMessageDialog(null, Robert_Kim);
		}
		else {
			JOptionPane.showMessageDialog(null, "I dont know them");
		}
	}
}

