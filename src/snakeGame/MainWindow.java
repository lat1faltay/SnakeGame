package snakeGame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainWindow extends JFrame{
	
	private int mWidth = 600;
	private int mHeight = 600;
	
	private static MainWindow mWindow = null;
	
	
	private MainWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		SetDimension(mWidth, mHeight);
		setResizable(false);
		
	}
	
	
	public static MainWindow GetWindow() {
		if(mWindow ==null) {
			mWindow = new MainWindow();
		}
		return new MainWindow();
	}
	
	
	public void SetDimension(int width, int height) {
		Dimension Dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		int posX = 0;
		int posY = 0;
		
		if(mWidth+100 > Dim.width) {
			mWidth = Dim.width-100;
		}
		if(mHeight+100 > Dim.height) {
			mHeight = Dim.height-100;
		}
		
		 posX = (Dim.width - mWidth) / 2;
		 posY = (Dim.height - mHeight) / 2;
		 
		 setBounds(posX, posY, mWidth, mHeight);
	}

}
