import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;



public class PicPanel extends JPanel implements MouseListener, MouseMotionListener{

	int x = 0, y = 0, dx = 0, dy = 0;
	BufferedImage bimage1,bimage2;
	boolean upState = false;
	
	Image test;
	
	public PicPanel (Image img) {
		
		setBackground(Color.white);
		addMouseListener(this);
		addMouseMotionListener(this);
		test = img;
		
		bimage1 = new BufferedImage(img.getWidth(this), img.getHeight(this), BufferedImage.TYPE_INT_ARGB);
		bimage2 = new BufferedImage(img.getWidth(this), img.getHeight(this), BufferedImage.TYPE_INT_ARGB);
		
		Graphics2D g2d1 = bimage1.createGraphics();
		Graphics2D g2d2 = bimage2.createGraphics();
		
		g2d1.drawImage(img, 0, 0, this);
		g2d2.drawImage(img, 0, 0, this);
		g2d2.drawRect(1, 1, img.getWidth(this) - 3, img.getHeight(this) -3);
	}
	
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		if (upState) {
			
			g2d.drawImage(test, x, y, this);
		}
		else {
			
			g2d.drawImage(test, x, y, this);
		}
		

;
	}
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		
		if (e.getX() >= x && e.getY() < bimage1.getWidth(this) 
			&& e.getY() >= y && e.getY() < bimage1.getHeight(this)) {
			
			upState = false;
			
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			dx = e.getX() - x;
			dy = e.getY() - y;
			
			repaint();
		}
		
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

	public void mouseDragged(MouseEvent e) {
		
		if (!upState) {
			
			x = e.getX() - dx;
			y = e.getY() - dy;
			
			repaint();
		}
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
