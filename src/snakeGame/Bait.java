package snakeGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JLabel;

public class Bait extends JLabel{
	Bait(){
		setBounds(100,100,mWidth,mWidth);
	}
	
	
	public int mMove = Direction.LEFT;
	
	
	public int mWidth = 20;
	
	
	@Override
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D rect = new Rectangle2D.Double(1,1,getWidth()-2, getHeight()-2);
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(2));
		g2.draw(rect);
		g2.setColor(Color.red);
		g2.fill(rect);
	}
}
