
public class Chapter8_1 {
	
	static ThreadA tA;
	static ThreadB tB;
	
	public static void main(String[] args) {

		tA = new ThreadA();
		tB = new ThreadB();
		
		tA.start();
		tB.start();
	}

}
