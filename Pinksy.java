package assignment3;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Pinksi extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Point  p1 = new Point(500,10), 
	            p2 = new Point(50,700), 
	            p3 = new Point(1000,700),
				s = new Point(300, 300);

		

		 // code to return one of p1, p2 or p2 with equal probability
				Point getRandomPoint() {
					double val = Math.random() * 3;
					if (val >=0.0 && val <1.0)
						return p1;
					else if (val >=1.0 && val <2.0)
							return p2;
					else
							return p3;
					}
				//override update()
				public void update(Graphics g) {
				paint(g);
				}
				//overide paint()
				public void paint(Graphics g) {
					g.setColor(Color.pink);
				//call the draw method on s
					s.draw(g);
				//move s half way toward a randomly chosen Point from the set {p1, p2, p3}.
					s.goHalfWay(getRandomPoint());
					
				//call repaint()
					repaint();
				}

}



