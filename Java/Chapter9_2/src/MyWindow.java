import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyWindow extends JFrame implements ActionListener {
	
	JTextArea text;
	BufferedReader in;
	JButton button;
	FileReader file;

	public MyWindow() throws HeadlessException {
		
		super("缓冲式流读取");
		
		Container con = getContentPane();
		con.setSize(100,400);
		con.setLayout(new BorderLayout());
		
		button = new JButton("读取文件");
		button.addActionListener(this);
		
		text = new JTextArea(20, 30);
		text.setBackground(Color.cyan);
		
		JScrollPane jsp = new JScrollPane(text);
		con.add(jsp, BorderLayout.CENTER);
		con.add(button, "South");
		
		this.setVisible(true);
		this.pack();
		
		try {
			
			File f = new File("/Users/BluePandaLi/Documents/Self-taught-Examination/Java/Chapter9_2/src/MyWindow.java");
			file = new FileReader(f);
			in = new BufferedReader(file);
			
		} catch (Exception e) {
			
			text.setText("文件没有找到!");
			button.removeActionListener(this);
		}
	}

	public void actionPerformed(ActionEvent e) {
		
		String s;
		
		if (e.getSource() == button) {
			
			try {
				
				while (((s = in.readLine()) != null)) {
					
					text.append(s + '\n');
				}
				
			} catch (Exception e2) {

			}
		}
		
	}
}
