import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class MyWindow extends JFrame{
	
	public MyWindow(String title) {
		
		super(title);
		
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		this.setLocation(100, 100);
		
		JScrollBar x = new JScrollBar(JScrollBar.HORIZONTAL, 50, 1, 0, 100);
		JScrollBar y = new JScrollBar(JScrollBar.VERTICAL, 50, 1, 0, 100);
		
		MyListener listener = new MyListener(x, y, 238, 118);
		JPanel scrolledCanvas = new JPanel();
		scrolledCanvas.setLayout(new BorderLayout());
		scrolledCanvas.add(listener, BorderLayout.CENTER);
		scrolledCanvas.add(x, BorderLayout.SOUTH);
		scrolledCanvas.add(y, BorderLayout.EAST);
		
		con.add(scrolledCanvas, BorderLayout.CENTER);

		this.setVisible(true);
		this.pack();
	}
	
	public Dimension getPreferredSize() {

		return new Dimension(500, 300);
	}
}
