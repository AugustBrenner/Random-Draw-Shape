// August Ryan Brenner
// abrenn10@my.smccd.edu
// CIS 255HJ
// MyBoundedShape.java
// Extends shape superclass
// Assignment 6
// April 16th, 2012 

import java.awt.Color;
import java.awt.Graphics;


public class MyBoundedShape extends MyShape
{
	
	private boolean filled; // filled or empty boolean
	
	MyBoundedShape()
	{
		setFill(false); // set the fill boolean
	}
	
	public MyBoundedShape( int x1, int y1, int x2, int y2,
			Color color, boolean filled )
	{
		super(x1, y1, x2, y2, color);
		setFill(filled); // set the fill boolean		
	}

	public void setFill(Boolean filled)
	{
		
		this.filled = filled; // set the fill boolean
	}
	
	public boolean getFill()
	{
		return filled;
	}
	
	
	public int getUpperLeftX()
	{
		int upperLeftX;
		
		if (getX1() <= getX2())
		{
			upperLeftX = getX1();
		}else
		{
			upperLeftX = getX2();
		}
		
		return upperLeftX;	
	}
	
	public int getUpperLeftY()
	{
		int upperLeftY;
	
		if (getY1() <= getY2())
		{
			upperLeftY = getY1();
		}else
		{
			upperLeftY = getY2();
		}
		
		return upperLeftY;	
	}
	
	public int getSideLength()
	{
		int width = Math.abs(getX1() - getX2());
		int height = Math.abs(getY1() - getY2());

		if ( width >= height){
			return height;
		}else{
			return width;
		}

	}

	public int getWidth()
	{
		return getSideLength();	
	}
	
	public int getHeight()
	{
		return getSideLength();
	}

	public void draw(Graphics g)
	{	
	}

}
