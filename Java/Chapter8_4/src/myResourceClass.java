
public class myResourceClass {
	
	int IntegerResource;

	public myResourceClass() {

		IntegerResource = 0;
	
	}

	public int getInfo() {
		
		return IntegerResource;
	}
	
	synchronized public void sumNumber(int sumNumber) {
		
		IntegerResource += 50;
	}
	
	public void putInfo(int info) {
		
		IntegerResource = info;
	}
}
