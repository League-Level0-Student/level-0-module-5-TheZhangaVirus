package _08_code_4_life;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.applet.AudioClip;
import javax.swing.JOptionPane;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;

public class Code4Life {

	// 1. Ask the user how many hours they spent coding this week.

	String hours = JOptionPane.showInputDialog("how many hours did you code this week?");
	int hour = Integer.parseInt(hours); {
	
	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.

		if(hour <= 2) {
			JOptionPane.showMessageDialog(null, "stop watching youtube and code instead");
		} else if(hour <= 5 && hour >= 3) {
			JOptionPane.showMessageDialog(null, "you are a code ninja");
		} else if(hour >= 5) {
			//playBatmanTheme();
		}
	}		
	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja

	// 4. If it is more than 5, call the method below to play the Batman theme song.

	/*		private static void playBatmanTheme() {
	 *			try {
	 *				AudioClip sound = JApplet.newAudioClip(Code4Life.class.getResource("batman.wav"));
	 *				sound.play();
	 *				Thread.sleep(60002);
	 *			} catch (Exception ex) {
	 *				ex.printStackTrace();
	 *			}
	 *		}
	 */
	
}