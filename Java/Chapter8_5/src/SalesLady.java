import com.sun.org.apache.regexp.internal.recompile;

public class SalesLady {
	
	int memontoes, five, ten;

	public SalesLady(int m, int f, int t) {
		
		memontoes = m;
		five = f;
		ten = t;
	}
	
	public synchronized String ruleForSale(int num, int money) {
		
		String s = null;
		
		if (memontoes == 0) {
			
			return "No. " + num  + " Sorry , sold out.";
		}
		
		if (money == 5) {
			
			memontoes --;
			five ++;
			
			s = "No. " + num + " Just enough, thanks.";
		}
		else if (money == 10) {
			
			while (five < 1	) {
				
				try {
					
					System.out.println("No. " + num + " Customer wants to buy use 10 yuan, please wait...");
					wait();
					
				} catch (Exception e) {
					
					System.out.println(e.toString());
				}
			}
			
			memontoes --;
			five --;
			ten ++;
			
			s = "No. " + num + " Here ' s your change and souvenir";
		}
		
		notify();
		
		return s;
	}

}
