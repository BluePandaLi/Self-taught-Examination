import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Chapter9_5 {

	public static void main(String[] args) {
		
		try {
			
			RandomAccessFile file = new RandomAccessFile("Example9_5.java", "rw");
			long fileCurPos = 0;
			long fileLength = file.length();
			
			while (fileCurPos < fileLength) {
				
				String s = file.readLine();
				System.out.println(s);
				fileCurPos = file.getFilePointer();
			}
			
			file.close();
			
		} catch (FileNotFoundException el) {
			
			System.out.println("文件找不到！" + el);

		} catch (IOException e) {

			System.out.println("文件读写错!" + e);
		}

	}

}
