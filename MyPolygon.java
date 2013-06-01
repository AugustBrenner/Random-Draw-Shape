// August Ryan Brenner
// abrenn10@my.smccd.edu
// CIS 255HJ
// MyPolygon.java
// Draws an Oval
// Assignment 6
// April 16th, 2012 

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MyPolygon extends MyBoundedShape {
	private Random randomNumbers = new Random();
	int numberOfCoordinates = (randomNumbers.nextInt( 9 ) + 1);
	
	public MyPolygon() // no argument constructor
	{
	}
	
	// constructor with input values
	public MyPolygon( int x1, int y1, int x2, int y2,
		Color color, boolean filled )
	{
		super(x1, y1, x2, y2, color, filled);
	} // end MyLine constructor
	
	public int[] getXCoordinates(int upperLeftX, int width)
	{
		int xCoordinates[] = new int[numberOfCoordinates];
		
		for(int i = 0; i < numberOfCoordinates; i++)
		{
			xCoordinates[i] = randomNumbers.nextInt( width ) + upperLeftX + 1 ;
		}
		
		
		return xCoordinates;
	}
	public int[] getYCoordinates(int upperLeftY, int height)
	{
		int yCoordinates[] = new int[numberOfCoordinates];
		
		for(int i = 0; i < numberOfCoordinates; i++)
		{
			yCoordinates[i] = randomNumbers.nextInt( height ) + upperLeftY + 1;
		}
		
		
		return yCoordinates;
	}
	
	
	// Draw the line in the specified color
	public void draw( Graphics g )
	{

		g.setColor( getColor() );
		if (getFill() == true)
		{
			g.fillPolygon( getXCoordinates(getUpperLeftX(), getWidth()),
				getXCoordinates(getUpperLeftY(), getHeight()), 
				numberOfCoordinates );
		}else
		{
			g.drawPolygon( getXCoordinates(getUpperLeftX(), getWidth()),
				getXCoordinates(getUpperLeftY(), getHeight()), 
				numberOfCoordinates );
		}
	} // end method draw

}
