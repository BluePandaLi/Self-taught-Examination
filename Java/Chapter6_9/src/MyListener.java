import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.JScrollBar;

public class MyListener extends JComponent implements AdjustmentListener, MouseListener, MouseMotionListener {

	private int x, y;
	private JScrollBar xScrollBar, yScrollBar;
	
	public MyListener(JScrollBar xs, JScrollBar ys, int x0, int y0) {

		xScrollBar = xs;
		yScrollBar = ys;
		
		x = x0;
		y = y0;
		
		
		xScrollBar.addAdjustmentListener(this);
		yScrollBar.addAdjustmentListener(this);

		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(getBackground());
		Dimension size = getSize();
		g.fillRect(0, 0, size.width, size.height);
		g.setColor(Color.blue);
		g.fillRect(x, y, 50, 50);
	}
	
	private void updateScrollBars(int x1, int y1) {
		
		int d = (int)((float)x/(float)getSize().width * 100.0);
		
		xScrollBar.setValue(d);
		
		d = (int)((float)y / (float)getSize().height * 100.0);
		yScrollBar.setValue(d);
	}
		

	public void adjustmentValueChanged(AdjustmentEvent e) {
		
		if (e.getSource() == xScrollBar) {
			
			x = (int)((float)xScrollBar.getValue()/100.0 * getSize().width);
		}
		else if (e.getSource() == yScrollBar) {
			
			y = (int)((float)yScrollBar.getValue()/100.0 * getSize().height);
		}
		
		repaint();
	}

	public void mouseDragged(MouseEvent e) {
		
		x = e.getX();
		y = e.getY();
		updateScrollBars(x, y);
		repaint();
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		
		x = e.getX();
		y = e.getY();
		updateScrollBars(x, y);
		repaint();
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
