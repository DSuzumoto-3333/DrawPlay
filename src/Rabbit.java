import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Rabbit {
	//Head size
	private static final int HEAD_DIMENSION = 75;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 15;
	private static final int EYE_WIDTH = 15;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 3;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/8;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/10 * 5;
	private static final int MOUTH_Y = HEAD_DIMENSION/10 * 7;
	//Ears for rabbit
	private static final int LEFT_EAR_X = HEAD_DIMENSION/6;
	private static final int EAR_Y = HEAD_DIMENSION * 2 / 5;
	private static final int EAR_SEPARATION = HEAD_DIMENSION * 6 / 10;
	private static final int EAR_WIDTH = 20;
	private static final int EAR_HEIGHT = 80;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int rabX, int rabY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=rabX;
		int y=rabY;
		// Draw the head
		g2.setColor(Color.white);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.yellow);
		x = rabX + EYE_X; 
		y = rabY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.pink);
		x = rabX + MOUTH_X;
		y = rabY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);	
		//Draw Ears
		g2.setColor(Color.orange);
		x = rabX + LEFT_EAR_X;
		y = rabY - EAR_Y;
		g2.fillArc(x, y, EAR_WIDTH, EAR_HEIGHT, 0, 180);
		x = rabX + EAR_SEPARATION;
		y = rabY - EAR_Y;
		g2.fillArc(x, y, EAR_WIDTH, EAR_HEIGHT, 0, 180);
	}
}
