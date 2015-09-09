
public class Chapter8_4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		myResourceClass mrc = new myResourceClass();
		Thread[] aThreadArray = new Thread[20];
		
		System.out.println("the value is: " + mrc.getInfo() + " at begining.");
		System.out.println("The correct result value is : " + 20 * 1000 *50);
		System.out.println();
		
		for (int i = 0; i < aThreadArray.length; i++) {
			
			aThreadArray[i] = new Thread(new myMultiableClass(mrc));
			aThreadArray[i].start();
	
		}
			
		while (true) {
			
			boolean isEnd = true;
			
			for (int i = 0; i < aThreadArray.length; i++) {
				
				if (aThreadArray[i].isAlive()) {
					
					isEnd = false;
					break;
				}
			}
			
			if (isEnd) {
				
				System.out.println("The final value is " + mrc.getInfo());
				break;
			}
			else {
				
				Thread.sleep(10);
				continue;
				
			}
		}
	}

}
