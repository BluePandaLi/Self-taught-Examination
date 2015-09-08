import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Image;

import javax.swing.JFrame;

public class BufferDemo extends JFrame {

	public BufferDemo(Image img) {
		
		this.getContentPane().add(new PicPanel(img));
		this.setTitle("图像双缓冲技术");
		setSize(300, 300);
		setVisible(true);
	}
}
