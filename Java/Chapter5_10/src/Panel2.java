import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Panel2 extends Panel {
	
	JTextArea resultsText;
	JButton actionButton;

	public Panel2() {

		setLayout(new GridLayout(1, 4));
		
		JLabel label = new JLabel("计算结果", JLabel.RIGHT);
		
		resultsText = new JTextArea();
		resultsText.setLineWrap(true);
		JScrollPane textScrollPane = new JScrollPane(resultsText);
		
		actionButton = new JButton("开始计算");
		
		add(label);
		add(textScrollPane);
		add(new Panel());
		add(actionButton);
		
	}

	public Panel2(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

}
