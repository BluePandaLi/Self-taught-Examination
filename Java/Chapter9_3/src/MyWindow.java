import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.sun.j3d.internal.BufferWrapper;

public class MyWindow extends JFrame implements ActionListener {

	JTextArea text;
	JButton button;
	
	FileWriter writefile;
	BufferedWriter out;
	
	public MyWindow() {
		
		super("缓冲式样的输出");
		
		Container con = getContentPane();
		text = new JTextArea(20,30);
		text.setBackground(Color.cyan);
		
		button = new JButton("写文件");
		button.addActionListener(this);
		
		con.setLayout(new BorderLayout());
		con.setSize(40,40);
		
		con.add(text, "Center");
		con.add(button, "South");
		
		setVisible(true);
		
		try {
			
			writefile = new FileWriter("line.tex");
			out = new BufferedWriter(writefile);
			
		} catch (Exception e) {

		}
		
	}

	public void actionPerformed(ActionEvent e) {
		
		String s;
		
		if (e.getSource() == button) {
			
			try {
				
				out.write(text.getText(), 0, (text.getText().length()));
				out.flush();
				text.setText(null);
				System.exit(0);
				
			} catch (Exception e2) {

				text.setText("文件出错! \n");
				System.exit(-1);
			}
			
		}
		
		
	}

}
