// August Ryan Brenner
// abrenn10@my.smccd.edu
// CIS 255HJ
// DrawPanel.java
// Calls Shape Constructors
// Assignment 6
// April 16th, 2012 


import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Dimension;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel implements MouseMotionListener
{
	private Random randomNumbers = new Random();
	private MyShape shape;
	private boolean firstTime = true;
	private  int shapeCount = 0;
	
	// constructor, creates a panel with random shapes
	public DrawPanel()
	{	
		setBackground( Color.BLACK );	
	} // end DrawPanel constructor

	public void mouseMoved (MouseEvent event)
	{
		if (firstTime == true)
		{
         firstTime = false;
		}
		else
		{
         System.exit(0);
		}
	}// end mouseMoved
	
	public void mouseDragged (MouseEvent event)
	{} // end method

	// for each shape array, draw the individual shapes
	public void paintComponent( Graphics g )
	{
		if (shapeCount >= 100)
		{
		super.paintComponent (g);
		shapeCount = 0;
		}

		//initialize filled boolean to true;
		boolean filled = true;
		
		// initialize random cyclic boolean
		boolean cyclic = randomNumbers.nextBoolean();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;

		// generate random coordinates		
		int x1 = randomNumbers.nextInt( width );
		int y1 = randomNumbers.nextInt( height );
		int x2 = randomNumbers.nextInt( width );
		int y2 = randomNumbers.nextInt( height );

		// generate a random color
		Color firstColor = new Color( randomNumbers.nextInt( 256 ),
				randomNumbers.nextInt( 256 ),
				randomNumbers.nextInt( 256 ) );
		Color secondColor = new Color( randomNumbers.nextInt( 256 ),
				randomNumbers.nextInt( 256 ),
				randomNumbers.nextInt( 256 ) );
		
		// generate random shape
		int randomShape = randomNumbers.nextInt( 3 ) + 1;
		
		switch(randomShape)
		{
			case 1:
				// add the line to the list of lines to be displayed
				shape = new MyPolygon( x1, y1, x2, y2, firstColor, filled );
				break;
			case 2:
				shape = new MyRectangle( x1, y1, x2, y2, firstColor, filled );
				break;
			case 3:
				shape = new MyOval( x1, y1, x2, y2, firstColor, filled );
				break;
		}
		
		// draw the shape
		Graphics2D g2d = ( Graphics2D ) g; // cast g to Graphics2D
		g2d.setPaint( new GradientPaint( x1, y1, firstColor, x2, y2,
		secondColor, cyclic ) );
		shape.draw(g2d);
		g2d.dispose();
		shapeCount++;
		
		try
		{
			Thread.sleep(700);
		}
		catch(Exception e)
		{}
		
		repaint();
	
	} // end method paintComponent
	

} // end class DrawPanel

