import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class House extends Applet{
		public void paint (Graphics g)
		{
			//house
			g.setColor(new Color(75, 0, 75));
			g.fillRect(300, 300, 300, 300);
			g.setColor(Color.red);
			g.fillPolygon(new int[]{300,450,600},new int[]{300,175,300},3);
			g.setColor(Color.yellow);
			g.fillRect(350, 375, 25, 25);
			g.fillRect(525, 375, 25, 25);
			
			//sky
			g.setColor(Color.black);
			g.fillRect(425, 550, 50, 50);
			g.fillRect(0,0,1700,175);
			
			//moon
			g.setColor(Color.gray);
			g.fillArc(25, 25, 75, 100, 85, 200);
			/*g.yellow
			g.fillPolygon(new int[]{300,450,600},new int[]{300,175,300},3);*/
			
			
			//flowers
			g.setColor(Color.pink);
			g.fillArc(50, 600, 25, 25, 90, 80);
			g.setColor(Color.cyan);
			g.fillArc(50, 600, 25, 25, 180, 80);
			g.setColor(Color.pink);
			g.fillArc(50, 600, 25, 25, 270, 80);
			g.setColor(Color.cyan);
			g.fillArc(50, 600, 25, 25, 0, 80);
			g.setColor(Color.green);
			g.drawLine(62, 612, 62, 650);
			
			
			g.setColor(Color.pink);
			g.fillArc(100, 600, 25, 25, 90, 80);
			g.setColor(Color.cyan);
			g.fillArc(100, 600, 25, 25, 180, 80);
			g.setColor(Color.pink);
			g.fillArc(100, 600, 25, 25, 270, 80);
			g.setColor(Color.cyan);
			g.fillArc(100, 600, 25, 25, 0, 80);
			g.setColor(Color.green);
			g.drawLine(112, 612, 112, 650);
			
			
			g.setColor(Color.pink);
			g.fillArc(150, 600, 25, 25, 90, 80);
			g.setColor(Color.cyan);
			g.fillArc(150, 600, 25, 25, 180, 80);
			g.setColor(Color.pink);
			g.fillArc(150, 600, 25, 25, 270, 80);
			g.setColor(Color.cyan);
			g.fillArc(150, 600, 25, 25, 0, 80);
			g.setColor(Color.green);
			g.drawLine(162, 612, 162, 650);
			
			
			g.setColor(Color.pink);
			g.fillArc(200, 600, 25, 25, 90, 80);
			g.setColor(Color.cyan);
			g.fillArc(200, 600, 25, 25, 180, 80);
			g.setColor(Color.pink);
			g.fillArc(200, 600, 25, 25, 270, 80);
			g.setColor(Color.cyan);
			g.fillArc(200, 600, 25, 25, 0, 80);
			g.setColor(Color.green);
			g.drawLine(212, 612, 212, 650);
			
			
			g.setColor(Color.pink);
			g.fillArc(250, 600, 25, 25, 90, 80);
			g.setColor(Color.cyan);
			g.fillArc(250, 600, 25, 25, 180, 80);
			g.setColor(Color.pink);
			g.fillArc(250, 600, 25, 25, 270, 80);
			g.setColor(Color.cyan);
			g.fillArc(250, 600, 25, 25, 0, 80);
			g.setColor(Color.green);
			g.drawLine(262, 612, 262, 650);
			
			g.setColor(Color.pink);
			g.fillArc(300, 600, 25, 25, 90, 80);
			g.setColor(Color.cyan);
			g.fillArc(300, 600, 25, 25, 180, 80);
			g.setColor(Color.pink);
			g.fillArc(300, 600, 25, 25, 270, 80);
			g.setColor(Color.cyan);
			g.fillArc(300, 600, 25, 25, 0, 80);
			g.setColor(Color.green);
			g.drawLine(312, 612, 312, 650);

			g.setColor(Color.pink);
			g.fillArc(350, 600, 25, 25, 90, 80);
			g.setColor(Color.cyan);
			g.fillArc(350, 600, 25, 25, 180, 80);
			g.setColor(Color.pink);
			g.fillArc(350, 600, 25, 25, 270, 80);
			g.setColor(Color.cyan);
			g.fillArc(350, 600, 25, 25, 0, 80);
			g.setColor(Color.green);
			g.drawLine(362, 612, 362, 650);
			

		}
}
