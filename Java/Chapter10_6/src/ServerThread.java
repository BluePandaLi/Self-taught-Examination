import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerThread  extends Thread {
	
	Socket socket;
	String s = null;
	
	DataOutputStream outputStream = null;
	DataInputStream  inputSteam = null;

	public ServerThread(Socket t) {

		if (t != null) {
			socket = t;
			
			try {
				inputSteam = new DataInputStream(t.getInputStream());
				outputStream = new DataOutputStream(t.getOutputStream());

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
	
	public void run() {

		super.run();
		
		while (true) {
			
			try {
				
				s = inputSteam.readUTF();
				
				if (s.equals("end")) {
					
					outputStream.writeUTF("close.");
					outputStream.writeUTF(s);
					outputStream.close();
					inputSteam.close();
					socket.close();
					return;
				}
				else {
					
					outputStream.writeUTF("repeat: " + s);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
