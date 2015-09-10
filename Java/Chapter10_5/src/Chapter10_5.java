import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chapter10_5 extends Applet implements Runnable, ActionListener {
	
	Socket clientSocket = null;
	DataInputStream inputStream = null;
	DataOutputStream outPutStream  = null;
	
	Thread chatThread = null;

	JTextField text = new JTextField(20);
	JTextArea chatMessage = new JTextArea(20, 30);
	
	public void init() {
		super.init();
		
		setBackground(new Color(120, 153, 137));
		setLayout(new BorderLayout());
		setSize(450, 350);
		
		JPanel senPanel = new JPanel();
		JButton sendButton = new JButton("Start");
		sendButton.addActionListener(this);
				
		senPanel.add(text);
		senPanel.add(sendButton);
		
		add(chatMessage, BorderLayout.CENTER);
		add(senPanel, BorderLayout.SOUTH);
		
		try {

			clientSocket = new Socket(this.getCodeBase().getHost(), 4441);

			if (clientSocket != null) {

				inputStream = new DataInputStream(clientSocket.getInputStream());
				outPutStream = new DataOutputStream(clientSocket.getOutputStream());
			}
			
		} catch (UnknownHostException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		
		if (clientSocket != null && chatThread == null) {
			
			chatThread = new Thread(this);
			chatThread.setPriority(Thread.MIN_PRIORITY);
			chatThread.start();
		}
		
	}

	public void run() {

		String chatStr = null;
		try {		
		while (clientSocket != null) {
			
			if (inputStream == null || outPutStream == null) {
				
				break;
			}
			


				chatStr = inputStream.readUTF();

				if (chatMessage.equals("end")) {
					clientSocket.close();
					inputStream.close();
					outPutStream.close();
					return;
				}
				else {
					
					chatMessage.append(chatStr + "\n");
				}


		}
		
		} catch (IOException e) {

			e.printStackTrace();

		}
	}

	public void actionPerformed(ActionEvent e) {
		
		
		String s = text.getText();
		
		if (s != null && outPutStream != null) {
			
			try {
				outPutStream.writeUTF(s);
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
		
		text.setText("");
		
	}
}
