import java.net.InetAddress;
import java.net.UnknownHostException;

public class Chapter10_1 {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress addr = InetAddress.getByName("www.baidu.com");
		
		String domianName = addr.getHostName();
		String ipName = addr.getHostAddress();
		
		System.out.println("domian name : " + domianName);
		System.out.println("ip address name :" +ipName);

	}

}
