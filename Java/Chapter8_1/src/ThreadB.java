import java.util.Date;

public class ThreadB extends Thread {
	
	Date timeNow;

	public void run() {
		super.run();
		
		Date datetimeNow = new Date();
		
		for (int i = 0; i < 5; i++) {
			
			timeNow = new Date();
			System.out.println("I'm thread B" + timeNow.toString());
			
			try {
				
				sleep(1000);
				
			} catch (Exception e) {
				
				System.out.println(e.toString());
			}
		}
		
	}
}
