import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;

public class Chapter7_3 extends Applet {

	int i = 1;
	
	public void init() {
		
		setBackground(Color.yellow);

		super.init();
	}
	
	public void paint(Graphics g) {
		
		i = i + 8;
		if (i > 160) {
			i = 1;
		}
		
		g.setColor(Color.red);
		g.fillRect(i, 10, 20, 20);
		g.drawString("我正在学习 update() 方法。", 100, 100);
		
		super.paint(g);

		try {
			
			Thread.sleep(100);
			
		} catch (Exception e) {

		}
		
		repaint();
	}
	
	public void update(Graphics g) {
		
		g.clearRect(i, 10, 200, 100);
		super.update(g);
	}

}
