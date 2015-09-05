import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

	public MyWindow(int width, int height) throws HeadlessException {
		
		setTitle("滚动面板实例");
		
		Container co = getContentPane();
		co.setPreferredSize(new Dimension(width, height));
		co.setLayout(new BorderLayout());
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(6, 6));
		
		for (int i = 0; i < 6; i++) {
			
			p.add(new JLabel());
			
			for (int j = 0; j < 2; j++) {
				
				p.add(new JButton("按钮" + (2*i + j + 1)));
				p.add(new JButton("标签" + (2 *i + j + 1)));
				p.add(new JLabel());
			}
			
			p.add(new JLabel());
		}
		
		p.setBackground(Color.blue);
		p.setPreferredSize(new Dimension(width + 60, height + 60));
		
		MyScrollPane sp = new MyScrollPane(p);
		sp.setPreferredSize(new Dimension(width - 60, height - 60));
		
		add(sp, BorderLayout.CENTER);
		
		setVisible(true);
		pack();
	}

	public MyWindow(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public MyWindow(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public MyWindow(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

}
