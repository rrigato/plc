
import java.awt.Graphics;
public class Point {
	private static int maxX = 400, maxY = 400, minX = 0, minY = 0;
	protected double x,y;
	
	public Point() {
			
			this(Math.random()*maxX,Math.random()*maxY);
	}
		// call the constructor below using random valued arguments between minX, maxX, minY, maxY. 
// (Use Math.random() to make the random values.)

	
	public Point(double x, double y) {
		setX(x);
		setY(y);
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

static public double getMaxX() {
	
		return maxX;
		// return maxX
}
	
static	public double getMaxY() {
// return maxY
		return maxY;
}

static public double getMinX() {
		// return minX
		return minX;
}
	
static	public double getMinY() {
// return minY
		return minY;
}

public int getQuadrant() {
// return 1, 2, 3, or 4 depending on which quadrant the Point is in. Return 0 if it’s on an axis.
	int one =1, two =2, three =3, four =4;
	if (x >0 && y>0)
		return one;
	else if (x <0 && y>0)
		return two;
	else if (x < 0 && y<0)
		return three;
	else 
		return four;
		
}

	
	public void setX(double x) {
// set x to nearest LEGAL value	(between minX and maxY)
		if (x > maxX)
			this.x = maxX;
		else 
			this.x = Math.max(x, minX);
	}
	
	public void setY(double y) {
// set y to nearest LEGAL value  (between minY and maxY)
		if (y > maxY)
			this.y = maxY;
		else 
			this.y = Math.max(y, minY);
}	
	
	static public void setMaxX(int maxX)  {
	// set the class member maxX to parameter maxX.  Or to minX if parameter < minX.
		Point.maxX = Math.max(maxX, minX);
	}
	
	static public void setMaxY(int maxY) {
		Point.maxY = Math.max(maxY,minY);
	}

	
	static public void setMinX(int minX)  {
	// set the class member minX to parameter minX.  Or to maxX if parameter > maxX.
		Point.minX = Math.min(minX,maxX);
	}
	
	static public void setMinY(int minY) {
		// similar to setMinX
		Point.minY = Math.min(minY,maxY);
}

	
	public int roundX() {//return x rounded to an int
		return (int) Math.round(x);
	}
	
	public int roundY() {//return y rounded to an int
		return (int) Math.round(y);
		}
	
	
	public String toString() {
// return a String of the form (40,75)   (where the first number is x and the second number is y).
		return "(" + (int)x + "," + (int)y + ")";
}

	
	public void draw(Graphics g) {
		// draw a circle with diameter 4 centered at location x,y
		double x_temp = x - 1;
		double y_temp = y -1;
		g.drawOval((int)x_temp,(int)y_temp,2,2);
	}
	
	public Point move(double vx, double vy) {
		// set x to the sum of x and vx. Similary for y. Return the updated object. 
		x = vx +x;
		y = vy +y;
		return this;
	}

	public boolean equals(Object o) {
		// First check if o isn’t null or of a different class as this (use getClass()).
		// Then create a temp of type Point and assign o to it (via a cast).
		// Now check that temp and this have the same values for x and y.
		if(o != null &&  o.getClass() == this.getClass())
			{
			Point temp;		
			temp = (Point) o;
			if (temp.x == this.x && temp.y == this.y)
				return true;	
			}
		return false;
		
	}

	public Point makeCopy() {
		// return a new Point object with the same x and y as this. 
		Point newPoint;
		newPoint = new Point(x,y);
		return newPoint;
	}

	
	
	public double getDistance(Point p) {
		//return the distance from this to p.
		return Math.sqrt(((p.x-this.x)*(p.x-this.x)) +((p.y-this.y)*(p.y-this.y)));
	}
	
}
