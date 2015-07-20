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
