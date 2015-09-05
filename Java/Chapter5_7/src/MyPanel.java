import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;

import sun.net.www.content.audio.x_aiff;

public class MyPanel extends JPanel {
	
	int x;
	JLabel label;

	public MyPanel() {
		// TODO Auto-generated constructor stub
	}
	
	public MyPanel(int index) {

		x = index;
		getSize();
		label = new JLabel("我是第" + x + "个标签");
		add(label);
	}

	public MyPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public MyPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public MyPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}
	
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return new Dimension(200, 50);
	}

}
