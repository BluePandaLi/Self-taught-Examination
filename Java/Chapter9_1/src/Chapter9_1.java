import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import com.sun.org.omg.SendingContext.CodeBase;

public class Chapter9_1 {

	public static void main(String[] args) {
		
		File inputFile = new File("file1.text");
		File outputFile = new File("file2.text");
		
		int ch;
		
		try {
			
			FileReader in = new FileReader(inputFile);
			FileWriter out = new FileWriter(outputFile);			
			System.out.print("文件复制程序开始工作。");
			
			while ((ch = in.read()) != -1) {
				out.write(ch);
			}
			
			in.close();
			out.close();
			
			System.out.print("文件复制程序工作结束.");
			
		} catch (FileNotFoundException e) {
			
			System.out.println("文件没有找到!: " + e);
			
		} catch (IOException e) {
			
			System.out.println("File read Error: " + e);
		}
		
	}

}
