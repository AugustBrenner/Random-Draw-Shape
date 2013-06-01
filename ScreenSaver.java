// August Ryan Brenner
// abrenn10@my.smccd.edu
// CIS 255HJ
// ScreenSaver.java
// Calls Draw Panel to create a JFrame
// Assignment 6
// April 16th, 2012 


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;



public class ScreenSaver
{

	public static void main(String[] args)
	{
		
		DrawPanel panel = new DrawPanel();
		JFrame frame = new JFrame();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;

		frame.add( panel );
		frame.addMouseMotionListener(panel);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize( width, height );
		frame.setBackground (Color.BLACK);
		frame.setUndecorated( true );
		frame.setVisible( true );

	}

}
