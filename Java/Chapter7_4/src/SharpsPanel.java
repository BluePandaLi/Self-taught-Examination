import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class SharpsPanel extends JPanel {

	public SharpsPanel() {
		
		setBackground(Color.yellow);
	}
	
	protected void paintComponent(Graphics g) {
		
		setBackground(Color.yellow);
		g.setXORMode(Color.red);

		g.setColor(Color.green);
		g.fillRect(20, 20, 80, 40);
		
		g.setColor(Color.yellow);
		g.fillRect(60, 20, 80, 40);
		
		g.setColor(Color.green);
		g.fillRect(20, 70, 80, 40);
		g.fillRect(60, 70, 80, 40);
		
		g.setColor(Color.green);
		g.drawLine(80, 100, 180, 200);
		g.drawLine(100, 100, 200, 200);
		g.drawLine(140, 140, 220, 220);
		
		g.setColor(Color.yellow);
		g.drawLine(20, 30, 160, 160);
		g.drawLine(20, 75, 160, 75);
		
		super.paintComponent(g);
	}


}
