import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MyScrollPane extends JScrollPane {

	public MyScrollPane() {
		// TODO Auto-generated constructor stub
		
	}

	public MyScrollPane(Component view) {
		super(view);
		
		setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_ALWAYS);
		setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS);

	}

	public MyScrollPane(int vsbPolicy, int hsbPolicy) {
		super(vsbPolicy, hsbPolicy);
		// TODO Auto-generated constructor stub
	}

	public MyScrollPane(Component view, int vsbPolicy, int hsbPolicy) {
		super(view, vsbPolicy, hsbPolicy);
		// TODO Auto-generated constructor stub
	}

}
