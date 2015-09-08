import java.applet.Applet;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;


//图像缓存技术
public class Chapter7_6 extends Applet {
	
	Image myPicture;
	
	public void init() {
		
		myPicture = getImage(getCodeBase(), "myPic.JPG");
		
		Image offsetScreen = createImage(getWidth(), getHeight());
		Graphics offsetGraphics = offsetScreen.getGraphics();
		offsetGraphics.drawImage(myPicture, 0, 0, this);
		
		super.init();
	}
	
//	public void paint(Graphics g) {
//		
//		 g.drawImage(myPicture, 0, 0, getWidth(), getHeight(), this);	
//		
//		super.paint(g);
//	}
	
	public boolean imageUpdate(Image img, int infoflags, int x, int y, int w, int h) {
		
		if (infoflags  == ALLBITS) {
			repaint();
			new BufferDemo(myPicture);	
			return false;
		}
		else {
			
			return true;
		}
	}

}
