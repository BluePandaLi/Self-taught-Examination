import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JTextArea;

public class Chapter8_2 extends Applet implements Runnable{
	
	Thread myThread = null;
	JTextArea t;
	int k;

	public void start() {
		super.start();
		
		t = new JTextArea(20, 20);
		add(t);
		
		if (myThread == null) {
			
			myThread = new Thread(this);
			myThread.start();
		}
	}
	
	public void run() {
		
		while (myThread != null) {
			
			try {
				
				Thread.sleep(1000);
				k++;
				repaint();
				
			} catch (Exception e) {
				
				System.out.println(e.toString());
			}
		}
		
	}
	
	public void stop() {
		super.stop();

		if (myThread != null) {
			
			myThread.stop();
			myThread = null;
			
			}
		}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		double i = Math.random();
		
		if (i < 0.5) {
			
			g.setColor(Color.yellow);
		}
		else {
			
			g.setColor(Color.blue);
		}
		
		g.fillOval(20, 20, (int)(100 * i),(int)(100*i));
		t.setText("I'm working now, i had sleep " + k +" times");

	}
}
