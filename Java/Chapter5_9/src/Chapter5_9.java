import java.applet.Applet;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chapter5_9 extends Applet implements ActionListener {
	
	JTextArea textArea;
	JTextField textField;
	JButton  btn1, btn2;

	public Chapter5_9() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		setSize(250, 150);
		
		textArea = new JTextArea("", 5, 10);
		textArea.setBackground(Color.cyan);
		
		textField = new JTextField("", 10);
		textField.setBackground(Color.pink);
		
		btn1 = new JButton("求  和");
		btn2 = new JButton("重新开始");
		
		textField.setEditable(false);
		
		add(textArea);
		add(textField);
		add(btn1);
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btn1) {
			
			String numbersStr = textArea.getText();
			StringTokenizer numberTokenizer = new StringTokenizer(numbersStr);
			long sum = 0;
			int count = numberTokenizer.countTokens();
			
			for (int i = 0; i < count ; i++) {
				
				String numberTempStr = numberTokenizer.nextToken();
				sum += Integer.parseInt(numberTempStr);
			}

			textField.setText(String.valueOf(sum));
			
		}
		else {
			
			textArea.setText("");
			textField.setText("");
		}
		
	}

}
