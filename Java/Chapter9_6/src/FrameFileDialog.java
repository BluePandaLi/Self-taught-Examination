import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;

import javafx.scene.layout.Border;

public class FrameFileDialog extends JFrame implements ActionListener {

	JFileChooser filedialog = null;
	JLabel label = new JLabel(" ", JLabel.CENTER);
	JButton bt1, bt2;
	JTextArea text;
	
	public FrameFileDialog() {
		
		super("带文件对话框的窗口");

		Container con = this.getContentPane();
		con.setSize(40,50);
		
		JPanel p = new JPanel();
		bt1 = new JButton("打开文件");
		bt2 = new JButton("保存文件");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		p.add(bt1);
		p.add(bt2);
		
		text = new JTextArea(20, 30);
		text.setBackground(Color.cyan);
		JScrollPane jsp = new JScrollPane(text);
		
		filedialog = new JFileChooser("/User");
		filedialog.setControlButtonsAreShown(true);
		filedialog.addChoosableFileFilter(new MyFileFilter("txt"));
		filedialog.addChoosableFileFilter(new MyFileFilter("java"));
		
		con.add(jsp, BorderLayout.CENTER);
		con.add(label, BorderLayout.NORTH);
		con.add(p, BorderLayout.SOUTH);
		
		this.setVisible(true);
		this.pack();
	}
		
	public void actionPerformed(ActionEvent e) {
		
		File file = null;
		int result = -1;
		
		if (e.getSource() == bt1) {
			
			filedialog.setDialogTitle("打开文件");
			result = filedialog.showOpenDialog(this);
			text.setText("");
		}
		
		if (result == JFileChooser.APPROVE_OPTION) {
			
			file = filedialog.getSelectedFile();
			text.setText("你选择打开文件的名称是: " + file.getName());
		}
		else if (result == JFileChooser.CANCEL_OPTION) {
			
			label.setText("你没有选择任何文件.");
		}
		
		FileInputStream fileStream = null;
		
		if (file != null) {
			
			try {
				
				fileStream = new FileInputStream(file);
				
			} catch (Exception e2) {
				
				label.setText("文件没有找到");
				return;
			}
			
			int readByte;
			
			try {
				
				while ((readByte = fileStream.read()) != -1) {
					
					text.append(String.valueOf((char)readByte));
				}
				
				fileStream.close();
				
			} catch (Exception e2) {

				label.setText("文件读取出错.");
			}
			
		}
		else if (e.getSource() == bt2) {
			
			filedialog.setDialogTitle("保存文件");
			result = filedialog.showSaveDialog(this);
			file = null;
			String fileName;
			
			if (result == JFileChooser.APPROVE_OPTION) {
				
				file = filedialog.getSelectedFile();
				label.setText("你选择保存文件名称是:" + file.getName());
			}
			else if (result == JFileChooser.CANCEL_OPTION) {
				
				label.setText("你没有选择任何文件");
			}
			
			FileOutputStream fileoutStream = null;
			
			if (file != null) {
				
				try {
					
					fileoutStream = new FileOutputStream(file);
					
				} catch (FileNotFoundException e1) {
					
					label.setText("文件没有发现");
					return;
				}
				
				String context = text.getText();

				try {

					fileoutStream.write(context.getBytes());
					fileoutStream.close();

				} catch (IOException e1) {

					label.setText("写文件出错" + e1);

				}
			}
		}
		
	}
	
}
