import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;

public class Chapter8_3 extends Applet implements Runnable {

	Thread redBall, blueBall;
	Graphics redPan, bluePan;
	
	int blueSeta = 0, redSeta = 0;
	
	public void init() {
		super.init();
		
		setSize(250, 200);
		
		redBall = new Thread(this);
		blueBall = new Thread(this);
		
		redPan = getGraphics();
		bluePan = getGraphics();
		
		redPan.setColor(Color.red);
		bluePan.setColor(Color.blue);
		
		setBackground(Color.gray);
	}
	
	public void start() {
		super.start();
		
		redBall.start();
		blueBall.start();
	}
	
		
	public void stop() {
		super.stop();
		
		redBall.stop();
		redBall = null;

		blueBall.stop();
		blueBall = null;
	}
	
	public void run() {
		
		
		while (true) {
			

		
		int x, y;
		
		if (Thread.currentThread() == redBall) {

			x = (int)(80 * Math.cos(Math.PI / 180.0 * redSeta));
			y = (int)(80 * Math.sin(Math.PI/180 * redSeta));
			
			redPan.setColor(Color.gray);
			redPan.fillOval(100 + x, 100 + y, 10, 10);
			
			redSeta += 3;
			
			if (redSeta > 360) {
				
				redSeta = 0;
			}
			
			x = (int)(80 * Math.cos(Math.PI / 180 * redSeta));
			y = (int)(80 * Math.sin(Math.PI / 180 * redSeta));
			
			redPan.setColor(Color.red);
			redPan.fillOval(100 + x, 100 + y, 10, 10);
			
			try {
				
				Thread.sleep(20);
				
			} catch (Exception e) {
				
				System.out.println(e.toString());
			}
			
		}
		else if (Thread.currentThread() == blueBall) {

			x = (int)(80 * Math.cos(Math.PI / 180.0 * blueSeta));
			y = (int)(80 * Math.sin(Math.PI/180 * blueSeta));
			
			bluePan.setColor(Color.gray);
			bluePan.fillOval(150 + x, 100 + y, 10, 10);
			
			blueSeta -= 3;
			
			if (blueSeta < -360) {
				
				blueSeta = 0;
			}
			
			x = (int)(80 * Math.cos(Math.PI / 180 * blueSeta));
			y = (int)(80 * Math.sin(Math.PI / 180 * blueSeta));
			
			bluePan.setColor(Color.blue);
			bluePan.fillOval(150 + x, 100 + y, 10, 10);
			
			try {
				
				Thread.sleep(40);
				
			} catch (Exception e) {
				
				System.out.println(e.toString());
			}
		}
		
	}
	}

	
}
