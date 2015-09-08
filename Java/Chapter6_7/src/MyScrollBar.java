import java.awt.Dimension;

import javax.swing.JScrollBar;

public class MyScrollBar extends JScrollBar {

	public MyScrollBar() {
		// TODO Auto-generated constructor stub
	}

	public MyScrollBar(int orientation) {
		super(orientation);
		// TODO Auto-generated constructor stub
	}

	public MyScrollBar(int orientation, int value, int extent, int min, int max) {
		super(JScrollBar.HORIZONTAL, value, extent, min, max);
		
	}
	
	public Dimension getPreferredSize() {

		return new Dimension(125, 20);
	}

}
