import java.io.File;

import javax.swing.filechooser.FileFilter;

public class MyFileFilter extends FileFilter {

	String ext;
	
	public MyFileFilter(String t) {

		ext = t;
	}
	
	public boolean accept(File f) {
		
		if (f.isDirectory()) {
			
			return true;
		}
		
		String fn = f.getName();
		
		int index = fn.lastIndexOf(".");
		
		if (index > 0 && index < fn.length() -1) {
			
			String extension = fn.substring(index + 1).toLowerCase();
			
			if (extension.equals(ext)) {
				
				return true;
			}
		}
		
		return false;
	}
	
	public String getDescription() {
		
		if (ext.equals("java")) {
			return "JAVA Source File (*.java)";
		}
		else if (ext.equals("txt")) {
			
			return "TXT Spurce File (*.txt)";
		}
		
		return "";
	}
}
