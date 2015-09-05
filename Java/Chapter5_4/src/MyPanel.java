import java.awt.Button;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class MyPanel extends JPanel {
	
	JButton button1, button2;
	JLabel lable1;

	public MyPanel(String str1 , String str2, String str3) {
		// TODO Auto-generated constructor stub
		
		button1 =  new JButton(str1);
		button2 = new JButton(str2);
		lable1 = new JLabel(str3);
		
		add(button1);
		add(button2);
		
		add(lable1);
		
		setSize(new Dimension(300, 200));
	}

	public MyPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public MyPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public MyPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

}
