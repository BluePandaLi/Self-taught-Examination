import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyWindow extends JFrame implements ActionListener, AdjustmentListener {
	
	JButton button;
	JTextField text;
	boolean barOpened = false; 

	public MyWindow (String titile) {
		
		super(titile);
		
		MyScrollBar scrollBar = new MyScrollBar();

		Container con  = getContentPane();
		con.setLayout(new GridLayout(2, 1));

		this.setSize(200, 100);
		this.setLocation(100, 100);
		
		button = new JButton("开/关滚动条");
		button.addActionListener(this);
		
		scrollBar.addAdjustmentListener(this);
		
		text = new JTextField("滚动条关闭", 20);
		
		con.add(button);
		con.add(text);
		con.add(scrollBar);
		
		setVisible(true);
		pack();
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == button) {
			
			if (barOpened) {
				
				text.setText("滚动条关闭");
			}
			else {
				
				text.setText("滚动条打开");
			}
			
			barOpened = !barOpened;
		}
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		
		if (barOpened) {
			
			MyScrollBar bar = (MyScrollBar)e.getAdjustable();
			
			text.setText("选择的值是:" + bar.getValue());
		}
	}

}
