
public class myMultiableClass implements Runnable {
	
	myResourceClass UseInteger;
	
	public myMultiableClass(myResourceClass resource) {
		
		UseInteger = resource;
	}

	public void run() {
		
		int i, LocalInteger;
		
		for (int j = 0; j < 1000; j++) {
			

			UseInteger.sumNumber(50);
			
			try {
				
				Thread.sleep(10);
				
			} catch (Exception e) {
				
				System.out.println(e.toString());
			}
		}
	}
}
