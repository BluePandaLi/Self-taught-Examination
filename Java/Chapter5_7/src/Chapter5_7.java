import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.HeadlessException;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Chapter5_7 extends Applet implements ActionListener {
	
	CardLayout mycard; MyPanel myPanel[]; JPanel p;
	
	private void addButton(JPanel pan , String btnName, ActionListener listener) {
		
		JButton aButton = new JButton(btnName);
		aButton.setActionCommand(btnName);
		aButton.addActionListener(listener);
		
		pan.add(aButton);
	}
	
	public Chapter5_7() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

	public void init() {
	
		setLayout(new BorderLayout());

		mycard = new CardLayout();
		this.setSize(400, 150);

		p = new JPanel();
		p.setLayout(mycard);
		
		myPanel = new MyPanel[10];
		
		for (int i = 0; i < myPanel.length; i++) {
			
			myPanel[i] = new MyPanel(i + 1);
			p.add("A" + i, myPanel[i]);
		}
		
		JPanel p2 = new JPanel();
		addButton(p2, "第一个", this);
		addButton(p2, "最后一个", this);
		addButton(p2, "前一个", this);
		addButton(p2, "后一个", this);
		
		add(p, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
	
		if (e.getActionCommand().equals("第一个")) {
			
			mycard.first(p);
		} 
		else if (e.getActionCommand().equals("最后一个")){
			
			mycard.last(p);
		}
		else if (e.getActionCommand().equals("前一个")) {
			
			mycard.previous(p);
		}
		else {

			mycard.next(p);
		}
	}
}
