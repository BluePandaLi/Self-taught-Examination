import java.applet.Applet;
import java.awt.Button;
import java.awt.Panel;

import javax.swing.JButton;

public class Chapter5_4 extends Applet{

	public Chapter5_4() {
		// TODO Auto-generated constructor stub
	}
	
	 MyPanel panel1;
	 MyPanel panel2;
	 JButton button;
	 
	 public void init() {
		
		 panel1 = new MyPanel("确定", "取消", "标签，我们在面板1中");
		 panel2 = new MyPanel("确定", "取消", "标签，我们在面板2中");
		
		 button = new JButton("我是不在面板中的按钮");
		 
		 add(panel1);
		 add(panel2);
		 
		 add(button);
	}

}
