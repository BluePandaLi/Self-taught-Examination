import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.io.PushbackInputStream;

import javax.swing.JPanel;

public class MyPanel extends JPanel {

	public void print(int r) {

		Graphics g = getGraphics();
		g.clearRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.red);
		g.fillOval(10, 10, r, r);
	}
}

