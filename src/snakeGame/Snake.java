package snakeGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.sql.Time;
import java.util.ArrayList;

import javax.swing.*;


public class Snake extends JLabel {
	
	public Box mHead = new Box();
	public Timer mTimer = null;
	public ArrayList<Box> List = new ArrayList<Box>();
	
	
	public Snake() {
		// TODO Auto-generated constructor stub
		add(mHead);
		addKeyListener(new KeyboardControl());
		setFocusable(true);
		mTimer = new Timer(100, new TimerControl());
		mTimer.start();
		
		List.add(mHead);
		for(int i = 1; i < 10; i++) {
			AddQueue();
		}
		
	}
	
	public void AddQueue() {
		Box box = List.get(List.size()-1).CreateBox();
		List.add(box);
		add(box);
	}
	
	
	public void MoveAll() {
		for(int i = List.size()-1; i>0 ; i--) {
			Box last = List.get(i-1);
			Box next = List.get(i);
			
			List.get(i).Move();
			next.mMove = last.mMove;
		}
		mHead.Move();
	}
	
	public boolean Crash() { 
		int frame = 10;
		int weight = getWidth();
		int height = getHeight();
		
		if(mHead.getX()<= 10) {
			return true;
		}
		return false;
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
				if(mHead.mMove != Direction.RIGHT) {
					mHead.mMove = Direction.LEFT;
				}
			}
			if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				if(mHead.mMove != Direction.LEFT) {
					mHead.mMove = Direction.RIGHT;
				}
			}
			if(e.getKeyCode() == KeyEvent.VK_UP) {
				if(mHead.mMove != Direction.DOWN) {
					mHead.mMove = Direction.UP;
				}
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				if(mHead.mMove != Direction.UP) {
					mHead.mMove = Direction.DOWN;
				}
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class TimerControl implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(Crash()) {
				mTimer.stop();
			}
			MoveAll(); 
		}
		
	}
	
}
