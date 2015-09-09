import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

public class Chapter9_4 {

	static RandomAccessFile inOut = null;
	static long data[] = {15, 20, 50, -2, -23, 87, 24, 22,50,};
	
	public static void main(String[] args) {
		
		try {
			
			inOut = new RandomAccessFile("longData.dat", "rw");
			
			for (int i = 0; i < data.length; i++) {
				
				inOut.writeLong(i);
			}
			
			for (int i = data.length -1; i >= 0 ; i--) {
				
				inOut.seek(i*8);
				
				System.out.print(" " + inOut.readLong() + ((i == 0)? "\n" : ","));
			}
			
			inOut.close();

		} catch (FileNotFoundException el) {

			System.out.println("文件找不到!" + el);
		} catch (IOException e) {
			
			System.out.println("文件读写错!" + e);
		}

	}

}
