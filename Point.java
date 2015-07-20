package assignment3;

import java.awt.Graphics;

//instance variables x, y of type int
public class Point {
private 
		int x;
		int y;
//Constructor to initialize this.x and this.y using parameters x and y (and prevent negative values).
public Point(int x_val, int y_val)
{
	this.x = x_val;
	this.y = y_val;
}
//instance method goHalfWay():
public void goHalfWay(Point q) {
    x = (x + q.x)/2;
    y = (y + q.y)/2;
}

//draw method:
public void draw(Graphics g) {
    g.fillOval(x,y,1,1);
}
}




import java.awt.Graphics;
public class Point {
	private static int maxX = 400, maxY = 400, minX = 0, minY = 0;
	protected double x,y;
	
	public Point() {
			
			double random_x = Math.random()*400;
			double random_y = Math.random()*400;
			Point(random_x,random_y);
	}
		// call the constructor below using random valued arguments between minX, maxX, minY, maxY. 
// (Use Math.random() to make the random values.)

	
	public Point(double x, double y) {
		if ((x >= minX && x <= maxX) &&(y >= minY && y <= maxY))
		{this.x = Math.round(x);
		this.y=Math.round(y);
		}
		else
			System.out.println("Error: values out of bounds.");
		// set x and y to nearest LEGAL values 
	}
		
	public double getX() {
		
	return x;
		// return x
}
	
	public double getY() {
		return y;
	
// return y
}

public double getMaxX() {
	
		return maxX;
		// return maxX
}
	
	public double getMaxY() {
// return maxY
		return maxY;
}

public double getMinX() {
		// return minX
		return minX;
}
	
	public double getMinY() {
// return minY
		return minY;
}

public int getQuadrant() {
// return 1, 2, 3, or 4 depending on which quadrant the Point is in. Return 0 if it’s on an axis.
	if (x >0 && y>0)
		return 1;
	if (x <0 && y>0)
		return 2;
	if (x < 0 && y<0)
		return 3;
	if (x >0 && y<0)
		return 4;
		
}

	
	public void setX(double x) {
// set x to nearest LEGAL value	(between minX and maxY)
		if (x < minX|| x> maxX)
			System.out.println("Error: arguement out of bounds.");
		else
			this.x = Math.round(x);
	}
	
	public void setY(double y) {
// set y to nearest LEGAL value  (between minY and maxY)
		if (x < minX|| x> maxX)
			System.out.println("Error: arguement out of bounds.");
		else
			this.x = Math.round(x);
}	
	
	static public void setMaxX(int maxX)  {
	// set the class member maxX to parameter maxX.  Or to minX if parameter < minX.
		if (maxX <= minX)
			maxX = minX;
		else
			maxX = maxX;
	}
	
	static public void setMaxY(int maxY) {
		// similar to setMaxX
	}
	
	static public void setMinX(int minX)  {
	// set the class member minX to parameter minX.  Or to maxX if parameter > maxX.
	}
	
	static public void setMinY(int minY) {
		// similar to setMinX	
}

	
	public int roundX() {//return x rounded to an int}
	
	public int roundY() {//return y rounded to an int}
	
	public String toString() {
// return a String of the form (40,75)   (where the first number is x and the second number is y).
}
	
	public void draw(Graphics g) {
		// draw a circle with diameter 4 centered at location x,y
	}
	
	public Point move(double vx, double vy) {
		// set x to the sum of x and vx. Similary for y. Return the updated object. 
	}

	public boolean equals(Object o) {
		// First check if o isn’t null or of a different class as this (use getClass()).
		// Then create a temp of type Point and assign o to it (via a cast).
		// Now check that temp and this have the same values for x and y.
	}

	public Point makeCopy() {
		// return a new Point object with the same x and y as this. 
	}

	
	
	public double getDistance(Point p) {
		return the distance from this to p.
	}
	
}

