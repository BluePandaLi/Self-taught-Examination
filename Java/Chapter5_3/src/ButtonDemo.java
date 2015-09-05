import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class ButtonDemo extends JFrame  implements ActionListener {
	
	public static int width = 250;
	public static int height = 200;

	public ButtonDemo() {

		setSize(width, height);
		setTitle("按钮事件Demo");
		
		Container conPane = getContentPane();
		conPane.setBackground(Color.BLUE);
		conPane.setLayout(new FlowLayout());
		
		JButton redButton = new JButton("Red");
		redButton.addActionListener(this);
		conPane.add(redButton);
		
		JButton greenButton = new JButton("Green");
		greenButton.addActionListener(this);
		conPane.add(greenButton);
	}

	public void actionPerformed(ActionEvent e) {
		
		Container conPan = getContentPane();
		
		if (e.getActionCommand().equals("Red")) {
			
			conPan.setBackground(Color.RED);
		}
		else {
			
			conPan.setBackground(Color.GREEN);
		}
	}

}
