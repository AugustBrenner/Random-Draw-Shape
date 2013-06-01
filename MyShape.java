// August Ryan Brenner
// abrenn10@my.smccd.edu
// CIS 255HJ
// MyShape.java
// Contains Shape methods
// Assignment 6
// April 16th, 2012 

import java.awt.Color;
import java.awt.Graphics;


public abstract class MyShape
{
	private int x1; // x-coordinate of first endpoint
	private int y1; // y-coordinate of first endpoint
	private int x2; // x-coordinate of second endpoint
	private int y2; // y-coordinate of second endpoint
	private Color myColor; // color of this shape
	
	public MyShape() // no argument constructor
	{
		setX1(0); // set x-coordinate of
		setY1(0); // set y-coordinate of
		setX2(0); // set x-coordinate of
		setY2(0); // set y-coordinate of
	
		setColor(Color.black); // set the color
	}
	
	// constructor with input values
	public MyShape( int x1, int y1, int x2, int y2,
		Color color)
	{

		setX1(x1); // set x-coordinate of
		setY1(y1); // set y-coordinate of
		setX2(x2); // set x-coordinate of
		setY2(y2); // set y-coordinate of
	
		//setColor(color); // set the color
		

	} // end MyLine constructor
	
	public void setX1(int x1)
	{
		
		if( x1 >= 0 )
		{
			this.x1 = x1; // set x-coordinate of
		}else
		{
			this.x1 = 0;
		}
	}
	
	public void setY1(int y1)
	{
		
		if( y1 >= 0 )
		{
			this.y1 = y1; // set x-coordinate of
		}else
		{
			this.y1 = 0;
		}
	}
	
	public void setX2(int x2)
	{
		
		if( x2 >= 0 )
		{
			this.x2 = x2; // set x-coordinate of
		}else
		{
			this.x2 = 0;
		}
	}
	
	public void setY2(int y2)
	{
		
		if( y2 >= 0 )
		{
			this.y2 = y2; // set x-coordinate of
		}else
		{
			this.y2 = 0;
		}
	}
	
	public void setColor(Color color)
	{
		
		myColor = color; // set the color
	}
	
	public int getX1()
	{
		return x1;
	}
	
	public int getY1()
	{
		return y1;
	}
	
	public int getX2()
	{
		return x2;
	}
	
	public int getY2()
	{
		return y2;
	}
	
	public Color getColor()
	{
		return myColor;
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
	
	public int getWidth()
	{
		int width = Math.abs(getX1() - getX2());
		
		return width;	
	}
	
	public int getHeight()
	{
		int height = Math.abs(getY1() - getY2());
		
		return height;	
	}
	// Draw the line in the specified color
	
	
	public abstract void draw( Graphics g );
	
}
