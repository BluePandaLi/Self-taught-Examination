import java.applet.Applet;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Chapter7_7 extends Applet implements MouseListener {
	
	final int picNumber = 3;
	int count = 0;
	Image[] card = new Image[3];

	public void init() {
		super.init();
		
		addMouseListener(this);
		
		for (int i = 0; i < card.length; i++) {
			
			card[i] = getImage(getCodeBase(), "pic" + i + ".jpg");
		}

	}
	
	public void paint(Graphics g) {
		
		if (card[count] != null) {
			
			g.drawImage(card[count], 0, 0, this);
		}
		
		super.paint(g);
	}
	

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		
		count = (count + 1) % picNumber;
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
