import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;

public class Chapter7_1 extends Applet {

	Font f1 = new Font("Helevetica", Font.PLAIN, 18);
	Font f2 = new Font("Helevetica", Font.BOLD, 10);
	Font f3 = new Font("Helevetica", Font.ITALIC, 12);
	
	Font f4 = new Font("Courier", Font.PLAIN, 12);
	Font f5 = new Font("Times Roman", Font.BOLD|Font.ITALIC, 14);
	Font f6 = new Font("Dialog", Font.ITALIC, 14);
	
	public void paint(Graphics g) {
		
		g.setFont(f1);
		g.drawString("18pt plain helevetica", 5, 20);
		
		g.setFont(f2);
		g.drawString("10pt bold helevetica", 5, 43);
		
		g.setFont(f3);
		g.drawString("12pt italic helevetica", 5, 58);
		
		g.setFont(f4);
		g.drawString("12pt plain courier", 5, 75);
		
		g.setFont(f5);
		g.drawString("14pt bold and italic times roman", 5, 92);
		
		g.setFont(f6);
		g.drawString("14pt italic dialog", 5, 111);
		
		super.paint(g);
	}

}
