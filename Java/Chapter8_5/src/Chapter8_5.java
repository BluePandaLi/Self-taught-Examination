import java.applet.Applet;
import java.awt.HeadlessException;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Chapter8_5 extends Applet {
	
	static SalesLady salesLady = new SalesLady(14, 0, 0);

	public void start() {
		super.start();
		
		int moneies[] = {10, 10, 5,10, 5,10,5,5,10,5,10,5,5,5,5};
		Thread[] aThreads = new Thread[moneies.length];
		System.out.println("现在开始购票:");
		
		for (int i = 0; i < moneies.length; i++) {
			
			aThreads[i] = new Thread(new CustomerClass(i+1, moneies[i]));
			aThreads[i].start();
		}
		
		while (true) {
			
			boolean isFinish = true;
			
			for (int i = 0; i < moneies.length; i++) {
				
				if (aThreads[i].isAlive()) {
					
					isFinish = false;
					continue;
				}
			}
			
			if (isFinish) {
				
				System.out.println("finish.");
				break;
			}
			else {
				
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}

}
