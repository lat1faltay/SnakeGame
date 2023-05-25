package snakeGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class Box extends JLabel {
	
	
	Box(){
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
	
	public void Left() {
		int PosX = getX();
		int PosY = getY();
		PosX -= mWidth;
		setBounds(PosX,PosY,mWidth,mWidth);
	}
	public void Right() {
		int PosX = getX();
		int PosY = getY();
		PosX += mWidth;
		setBounds(PosX,PosY,mWidth,mWidth);
	}
	public void Up() {
		int PosX = getX();
		int PosY = getY();
		PosY -= mWidth;
		setBounds(PosX,PosY,mWidth,mWidth);
	}
	
	public void Down() {
		int PosX = getX();
		int PosY = getY();
		PosY += mWidth;
		setBounds(PosX,PosY,mWidth,mWidth);
	}
	
	public void Move() {
		if(mMove == Direction.LEFT) {
			Left();
		}else if(mMove == Direction.RIGHT) {
			Right();
		}else if(mMove == Direction.UP) {
			Up();
		}else if(mMove == Direction.DOWN) {
			Down();
		}
	}
	
	public Box CreateBox() {
		Box box = new Box();
		int X = getX();
		int Y = getY();
		
		box.setBounds(X,Y,mWidth, mWidth );
		box.mMove = -mMove;
		box.Move();
		box.mMove = mMove;
		
		
		return box;
	}
	
}
