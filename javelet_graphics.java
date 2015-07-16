
import java.applet.Applet;
import java.awt.*;
public class javlet extends Applet {
	public void init(){
		this.setBackground(Color.blue.darker());
	}
	public void paint(Graphics g){
		g.setColor(Color.GREEN);
		//g.drawLine(100, 50, 400, 100);
		//g.drawLine(100, 50, 200, 300);
		//g.drawLine(200,300,400,100);
		
		
	
		//g.drawPolygon(new int[]{100,100,400},new int[]{50,300,100},3);
		//g.setColor(Color.RED);
		//g.fillPolygon(new int[]{100,100,400},new int[]{50,300,100},3);
		
		g.fillPolygon(new int[]{50,100,250,400,200},new int[]{200,50, 25, 100, 300},5);
		g.setColor(Color.MAGENTA);
		g.drawPolygon(new int[]{50,250,200,100,400},new int[]{200,25, 300, 50, 100},5);
		//new color is (R,G,B)
		g.setColor(new Color(0,100,150));
		g.fillPolygon(new int[]{50,250,200,100,400},new int[]{200,25, 300, 50, 100},5);
		
		//g.fillRect(500, 200, 200, 600);
		g.fillOval(500, 200, 200, 200);
	}
}
