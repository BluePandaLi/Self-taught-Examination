import java.applet.Applet;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;

public class Chapter7_8 extends Applet implements Runnable {

	final int picNumber = 3;
	int count = 0;
	Image[] card = new Image[3];
	
	Thread mythread;

	public void init() {
		super.init();
		
		
		for (int i = 0; i < card.length; i++) {
			
			card[i] = getImage(getCodeBase(), "pic" + i + ".jpg");
		}

	}
	
	public void paint(Graphics g) {
		
		if (card[count] != null) {
			
			g.drawImage(card[count], 0, 0, this);
		}
		
		super.paint(g);
	}
	
	public void start() {
		
		mythread = new Thread(this);
		mythread.start();
	}
	
	public void run() {
		
		while (true) {
			
			repaint();
			
			count = (count + 1) % picNumber;
			
			try {
				
				Thread.sleep(500);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
		
		mythread = null;
	}

}
