import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import apple.laf.JRSUIConstants.ShowArrows;

public class DownNetFile extends JFrame implements ActionListener {
	
	JTextField text = new JTextField(30);
	JButton downloadButton = new JButton("download");
	JTextArea webpageContext = new JTextArea();
	JPanel panel = new JPanel();

	public DownNetFile() throws HeadlessException {
		
		super();
		
		setTitle("load web page demo.");
		setSize(500, 400);
		
		downloadButton.addActionListener(this);
		text.setText("http://www.baidu.com");
		webpageContext.setLineWrap(true);
		
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		panel.add(text);
		panel.add(downloadButton);
		
		con.add(panel, BorderLayout.NORTH);
		
		JScrollPane jsp = new JScrollPane(webpageContext);
		con.add(jsp, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		
		try {
			readByURL();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void readByURL () throws IOException {
		
		String urlStr = text.getText();
		URL url = new URL(urlStr);
		
		URLConnection tc = url.openConnection();
		
		InputStreamReader sReader = new InputStreamReader(tc.getInputStream());
		BufferedReader bReader = new BufferedReader(sReader);
		String inLine;
		
		while ((inLine = bReader.readLine()) != null) {
			
			webpageContext.append(inLine);
		}
		
		bReader.close();
		sReader.close();
		
	}
	
	
	
	



}
