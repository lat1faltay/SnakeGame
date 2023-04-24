package snakeGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class Snake extends JLabel {
	
	public Snake() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D rect = new Rectangle2D.Double(5,5,getWidth()-10, getHeight()-10);
		
		g2.setColor(Color.red);
		g2.setStroke(new BasicStroke(10));
		g2.draw(rect);
		
		
	}
	
	
	
}
