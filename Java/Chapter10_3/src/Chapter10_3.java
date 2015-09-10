import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;


public class Chapter10_3 extends Applet implements ActionListener {
	
	JButton startButton;
	
	public void init() {
		super.init();
		
		startButton = new JButton("开始");
		startButton.addActionListener(this);
		
		add(startButton);
	}

	public void start() {
		super.start();
		
	}

	public void actionPerformed(ActionEvent e) {
		
		startButton.setEnabled(false);
		
		String s = null;
		Socket clientSocket = null;

		DataInputStream in = null;
		DataOutputStream out = null;
		
		try {
			clientSocket = new Socket("localhost", 4441);
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			in = new DataInputStream(clientSocket.getInputStream());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			out = new DataOutputStream(clientSocket.getOutputStream());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			out.writeUTF("Hello");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while (true) {
			
			try {
				s = in.readUTF();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if (s == null) {
				
				break;
			}
			else {
				
				System.out.print(s);
			}
		}
		
		try {
			clientSocket.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		startButton.setEnabled(true);
	}
	
}
