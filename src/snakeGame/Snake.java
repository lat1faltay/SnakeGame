package snakeGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class Snake extends JLabel {
	
	public Box mHead = new Box();
	public Snake() {
		// TODO Auto-generated constructor stub
		add(mHead);
		addKeyListener(new KeyboardControl());
		setFocusable(true);
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
	
	class KeyboardControl implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				int PosX = mHead.getX();
				int PosY = mHead.getY();
				PosX -= mHead.mWidth;
				mHead.setBounds(PosX,PosY,mHead.mWidth, mHead.mWidth);
			}
			if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				
			}
			if(e.getKeyCode() == KeyEvent.VK_UP) {
				
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	
}
