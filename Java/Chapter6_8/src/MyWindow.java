import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import sun.nio.cs.ext.TIS_620;

public class MyWindow extends JFrame implements MouseListener {
	
	JTextArea text;
	MyPanel panel;

	int x, y, r = 10;
	int MouseFlg = 0;
	
	static String mouseStates[] = {"鼠标按下", "鼠标松开", "鼠标进来", "鼠标走开", "鼠标双击"};
	
	public MyWindow(String title) throws HeadlessException {
		super(title);

		Container con = this.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		this.setSize(200, 300);
		this.setLocation(100, 100);
		
		panel = new MyPanel();
		text = new JTextArea();
		text.setLineWrap(true);
		
		con.add(panel);
		con.add(text);
		
		addMouseListener(this);
		this.setVisible(true);
		this.pack();
	}
	
	public void print() {
		
		r = r + 4;
		
		if (r > 80) {
			
			r = 10;
		}
		
		text.append(mouseStates[MouseFlg] + "了" + "位置是" +  x + "," + y + "\r\n");
		panel.print(r);
	}
	
	public void mousePressed(MouseEvent e) {
		
		MouseFlg = 0;
		x = e.getX();
		y = e.getY();
		print();
	}
	
	public void mouseReleased(MouseEvent e) {
		
		MouseFlg = 1;
		x = e.getX();
		y = e.getY();
		print();

	}
	
	public void mouseEntered(MouseEvent e) {
		
		MouseFlg = 2;
		x = e.getX();
		y = e.getY();
		print();
	}
	
	public void mouseExited(MouseEvent e) {
		
		MouseFlg = 3;
		x = e.getX();
		y = e.getY();
		print();

	}

	public void mouseClicked(MouseEvent e) {
		
		if (e.getClickCount() == 2) {
			
			MouseFlg = 4;
			x = e.getX();
			y = e.getY();
			repaint();
		}
	}
	
}
