import java.applet.Applet;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Chapter10_6 extends Applet {

	public void start() {
		super.start();
		
		ServerSocket server = null;
		ServerThread thread = null;
		Socket client = null;
		try {
		
		while (true) {
			

				server = new ServerSocket(4441);
				client = server.accept();
				
				if (client != null) {
					
					new ServerThread(client).start();
					break;
				}



			
			
			
		}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
