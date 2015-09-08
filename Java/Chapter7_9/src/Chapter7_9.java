import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.AudioClip;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.prism.paint.Stop;


public class Chapter7_9 extends Applet implements ActionListener, Runnable {

	java.applet.AudioClip clip = null;
	JButton playButton, stopButton, loopButton;
	JTextField text;
	Thread loadThread;
	
	public void init() {
		super.init();
		
		loadThread = new Thread(this);
		loadThread.setPriority(Thread.MIN_PRIORITY);
		

		playButton = new JButton("开始播放");
		stopButton = new JButton("停止播放");
		loopButton = new JButton("开始循环");
		
		playButton.addActionListener(this);
		stopButton.addActionListener(this);
		loopButton.addActionListener(this);
		
		add(text = new JTextField(10));
		add(playButton);
		add(stopButton);
		add(loopButton);
	}
	
	public void start() {
		super.start();
		loadThread.start();
	}
	
	public void stop() {
		super.stop();
		
		loadThread = null;
		clip.stop();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == playButton) {
			
			clip.play();
		}
		else if (e.getSource() == loopButton) {
			
			clip.loop();
		}
		else {
			 
			clip.stop();
		}
	}

	public void run() {
		
		text.setText("请稍后...");
		clip = getAudioClip(getCodeBase(), "2.wav");
		
		if (clip != null) {
			
			playButton.setBackground(Color.green);
			playButton.setOpaque(true);
			playButton.setBorderPainted(false);
			stopButton.setBackground(Color.red);
			
			stopButton.setOpaque(true);
			stopButton.setBorderPainted(false);
			
			
			
			text.setText("可以播放了...");
		}
		else {
			
			text.setText("似乎不能加载...");
		}
		
	}
}
