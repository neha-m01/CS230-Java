package SnakeGame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{

	static final int SCREEN_WIDTH = 1300;
	static final int SCREEN_HEIGHT = 750;
	static final int ELEMENT_SIZE = 50;
	static final int SNAKE_ELEMENTS = (SCREEN_WIDTH*SCREEN_HEIGHT)/(ELEMENT_SIZE*ELEMENT_SIZE);
	static final int DELAY = 175;
	final int x[] = new int[SNAKE_ELEMENTS];
	final int y[] = new int[SNAKE_ELEMENTS];
	int snakeParts = 6;
	int applesEaten;
	int appleX;
	int appleY;
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random random;
	
	GamePanel(){
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startSNAKE();
	}
	public void startSNAKE() {
		newApple();
		running = true;
		timer = new Timer(DELAY,this);
		timer.start();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	public void draw(Graphics g) {
		
		if(running) {
			/*
			for(int i=0;i<SCREEN_HEIGHT/ELEMENT_SIZE;i++) {
				g.drawLine(i*ELEMENT_SIZE, 0, i*ELEMENT_SIZE, SCREEN_HEIGHT);
				g.drawLine(0, i*ELEMENT_SIZE, SCREEN_WIDTH, i*ELEMENT_SIZE);
			}
			*/
			g.setColor(Color.pink);
			g.fillOval(appleX, appleY, ELEMENT_SIZE, ELEMENT_SIZE);
		
			for(int i = 0; i< snakeParts;i++) {
				if(i == 0) {
					g.setColor(Color.green);
					g.fillRect(x[i], y[i], ELEMENT_SIZE, ELEMENT_SIZE);
				}
				else {
					g.setColor(new Color(45,180,0));
					//g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
					g.fillRect(x[i], y[i], ELEMENT_SIZE, ELEMENT_SIZE);
				}			
			}
			g.setColor(Color.red);
			g.setFont( new Font("Ink Free",Font.BOLD, 40));
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
		}
		else {
			GameOver(g);
		}
		
	}
	public void newApple(){
		appleX = random.nextInt((int)(SCREEN_WIDTH/ELEMENT_SIZE))*ELEMENT_SIZE;
		appleY = random.nextInt((int)(SCREEN_HEIGHT/ELEMENT_SIZE))*ELEMENT_SIZE;
	}
	public void move(){
		for(int i = snakeParts;i>0;i--) {
			x[i] = x[i-1];
			y[i] = y[i-1];
		}
		
		switch(direction) {
		case 'U':
			y[0] = y[0] - ELEMENT_SIZE;
			break;
		case 'D':
			y[0] = y[0] + ELEMENT_SIZE;
			break;
		case 'L':
			x[0] = x[0] - ELEMENT_SIZE;
			break;
		case 'R':
			x[0] = x[0] + ELEMENT_SIZE;
			break;
		}
		
	}
	public void checkApple() {
		if((x[0] == appleX) && (y[0] == appleY)) {
			snakeParts++;
			applesEaten++;
			newApple();
		}
	}
	public void checkCollisions() {
		//checks if head collides with body
		for(int i = snakeParts;i>0;i--) {
			if((x[0] == x[i])&& (y[0] == y[i])) {
				running = false;
			}
		}
		//check if head touches left border
		if(x[0] < 0) {
			running = false;
		}
		//check if head touches right border
		if(x[0] > SCREEN_WIDTH) {
			running = false;
		}
		//check if head touches top border
		if(y[0] < 0) {
			running = false;
		}
		//check if head touches bottom border
		if(y[0] > SCREEN_HEIGHT) {
			running = false;
		}
		
		if(!running) {
			timer.stop();
		}
	}
	public void GameOver(Graphics g) {
		//Score
		g.setColor(Color.red);
		g.setFont( new Font("Ink Free",Font.BOLD, 40));
		FontMetrics metrics1 = getFontMetrics(g.getFont());
		g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
		//SNAKE Over text
		g.setColor(Color.red);
		g.setFont( new Font("Ink Free",Font.BOLD, 75));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("Game Over :(", (SCREEN_WIDTH - metrics2.stringWidth("SNAKE Over"))/2, SCREEN_HEIGHT/2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(running) {
			move();
			checkApple();
			checkCollisions();
		}
		repaint();
	}
	
	public class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if(direction != 'R') {
					direction = 'L';
				}
				break;
			case KeyEvent.VK_RIGHT:
				if(direction != 'L') {
					direction = 'R';
				}
				break;
			case KeyEvent.VK_UP:
				if(direction != 'D') {
					direction = 'U';
				}
				break;
			case KeyEvent.VK_DOWN:
				if(direction != 'U') {
					direction = 'D';
				}
				break;
			}
		}
	}
}