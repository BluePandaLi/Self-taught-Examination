import java.awt.Color;
import javax.swing.*;

public class Example5_2 {
	
	public static MyWindowDemo window1;
	public static MyWindowDemo window2;

	public static void main(String[] args) {
		
		JButton button1 = new JButton();
		button1.setText("一个按钮");
		JButton button2 = new JButton();
		button2.setText("另一个按钮");
		
		String name1 = "一个窗口";
		String name2 = "另一个窗口";
		
		window1 = new MyWindowDemo(name1, button1, Color.red, 320, 240);
		window1.setVisible(true);
		
		window2 = new MyWindowDemo(name2, button2, Color.blue, 320, 240);
		window2.setVisible(true);
	}
}



 