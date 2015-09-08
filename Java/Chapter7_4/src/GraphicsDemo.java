import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class GraphicsDemo extends JFrame {

	public GraphicsDemo() {
		
		this.getContentPane().add(new SharpsPanel());
		setTitle("基本绘图方法演示");
		setSize(300, 300);
		setVisible(true);
	}
}
