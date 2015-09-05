import java.applet.Applet;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Chapter5_8 extends Applet implements ActionListener {

	static JTextField text1, text2;
	
	public Chapter5_8() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		text1 = new JTextField(10);
		text2 = new JTextField(10);
		
		add(text1);
		add(text2);
	
		text1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		
		long number  = Long.parseLong(text1.getText());
		
		text2.setText(String.valueOf(Math.round(Math.pow(number, 2))));

	}

}
