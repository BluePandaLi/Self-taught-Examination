import java.applet.Applet;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Chapter5_10 extends Applet implements ActionListener {

	Panel1 panel1;
	Panel2 panel2;
	
	public Chapter5_10() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		
		setLayout(new GridLayout(3,	1));
		setSize(400, 200);
		
		JLabel label = new JLabel("计算从起始数到终止数中是因子倍数的所有数", SwingConstants.CENTER);
		panel1 = new Panel1();
		panel2 = new Panel2();
		
		add(label);
		add(panel1);
		add(panel2);
		
		panel2.actionButton.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		
		panel2.resultsText.setText("");
		
		int num1 = Integer.parseInt(panel1.text1.getText());
		int num2 = Integer.parseInt(panel1.text2.getText());
		int num3 = Integer.parseInt(panel1.text3.getText());
		
		for (int i = num1; i < num2; i++) {
			
			if (i % num3 == 0) {

				panel2.resultsText.append(i + " ");
			}
		}
		
	}

}
