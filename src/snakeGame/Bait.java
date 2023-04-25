package snakeGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JLabel;

public class Bait extends JLabel{
	
	Bait(){
		setPosition(20, 20);
	}
	
	
	public int mMove = Direction.LEFT;
	public int mWidth = 20;
	
	
	@Override
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D ellipse= new Ellipse2D.Double(1,1,mWidth-2,mWidth-2);
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(2));
		g2.draw(ellipse);
		g2.setColor(Color.red);
		g2.fill(ellipse);
	}
	
	public void setPosition(int posX, int posY) {
		setBounds(posX,posY, mWidth, mWidth);
	}
	
}
