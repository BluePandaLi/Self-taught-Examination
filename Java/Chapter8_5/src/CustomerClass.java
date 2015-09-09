
public class CustomerClass implements Runnable {
	
	int num, money;

	public CustomerClass(int n , int m) {
		
		num = n;
		money = m;
	}
	
	public void run() {

		try {
			
			Thread.sleep(10);
			
		} catch (Exception e) {

		}
		
//		System.out.println("I'm No." + num +" customer.");
		System.out.println(Chapter8_5.salesLady.ruleForSale(num, money));
	}
}
