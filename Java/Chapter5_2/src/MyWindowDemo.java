import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class MyWindowDemo extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyWindowDemo (String name, JButton button,Color color,  int width, int height) {
		
		super();
		setLayout(new FlowLayout());
		
		setTitle(name);
		setSize(width, height);
				
		add(button);
		getContentPane().setBackground(color);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
	}
}
