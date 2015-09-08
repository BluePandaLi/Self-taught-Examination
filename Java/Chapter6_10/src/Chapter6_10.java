import java.applet.Applet;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class Chapter6_10 extends Applet implements KeyListener {
	
	int count = 0;
	JButton	button = new JButton();
	JTextArea text = new JTextArea();


	public void init() {
		super.init();
		
		button.addKeyListener(this);
		add(button);
		add(text);
	}


	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	public void keyPressed(KeyEvent e) {
		
		int t = e.getKeyCode();
		
		if (t >= KeyEvent.VK_A && t <= KeyEvent.VK_Z) {
			
			text.append((char)t + " ");
			count++;
			
			if (count % 10 == 0) {
				
				text.append("\n");
			}
		}
	}


	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
