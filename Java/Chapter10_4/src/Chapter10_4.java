import java.applet.Applet;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;

public class Chapter10_4 extends Applet implements ActionListener {
	
	JButton startButton;

	ServerSocket serverSocket = null;
	Socket chatSocket = null;
	DataOutputStream dataOutputStream = null;
	DataInputStream dataInputStream = null;
	
	public void init() {
		super.init();
		
		startButton = new JButton("Start");
		startButton.addActionListener(this);
		
		add(startButton);
	}

	public void actionPerformed(ActionEvent e) {
		
		try {

			serverSocket = new ServerSocket(4441);
			
			if (serverSocket != null) {
				
				chatSocket = serverSocket.accept();
			}
			
			if (chatSocket != null) {
				
				dataInputStream = new DataInputStream(chatSocket.getInputStream());
				dataOutputStream = new DataOutputStream(chatSocket.getOutputStream());
				


			}
			
			if (dataInputStream != null) {
				
				while (true) {
					
					String s = dataInputStream.readUTF();
					System.out.println(s);
					
					if (s == null) {
						
						break;
					}
				}
			}
			
			if (dataOutputStream != null) {
				
				dataOutputStream.writeUTF("Hello client, I'm server.");
			}
			
			dataOutputStream.close();
			dataInputStream.close();
			chatSocket.close();
			serverSocket.close();

		} catch (IOException e1) {

			e1.printStackTrace();
		}
		

		


	}

}
