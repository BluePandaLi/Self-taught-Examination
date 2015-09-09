import java.util.Date;


public class ThreadA extends Thread {

	public void run() {

		super.run();

		Date timeNow;
		
		for (int i = 0; i < 5; i++) {
			
			timeNow = new java.util.Date();			
			System.out.println("I'm Thread A:" + timeNow.toString());
			
			try {

				sleep(2000);
			
			} catch (Exception e) {
			
				System.out.println(e.toString());
			}
		}
	}
}
	