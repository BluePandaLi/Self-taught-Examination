import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Panel;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Panel1 extends Panel {
	
	JTextField text1, text2, text3;

	public Panel1() {
		
		text1 = new JTextField();
		text2 = new JTextField(); 
		text3 = new JTextField();

		setLayout(new GridLayout(1, 6));
		
		add(new JLabel("起始数", JLabel.RIGHT));
		add(text1);
		
		add(new JLabel("终止数", JLabel.RIGHT));
		add(text2);
		
		add(new JLabel("因子", JLabel.RIGHT));
		add(text3);
	}

	public Panel1(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

}
