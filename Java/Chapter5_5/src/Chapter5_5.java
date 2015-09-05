import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Chapter5_5 {

	public Chapter5_5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frameObj = new JFrame("我是一个Frame");
		frameObj.setSize(250, 200);
		frameObj.getContentPane().setBackground(Color.lightGray);
		frameObj.setLayout(new BorderLayout());
		
		JLabel label1 = new JLabel("东");
		JLabel label2 = new JLabel("西");
		JLabel label3 = new JLabel("南", JLabel.CENTER);
		JLabel label4 = new JLabel("北", JLabel.CENTER);
		JLabel label5 = new JLabel("中", JLabel.CENTER);
		
		frameObj.add(label1, "East");
		frameObj.add(label2, "West");
		frameObj.add(label3, "South");
		frameObj.add(label4, "North");
		frameObj.add(label5, "Center");


		
		frameObj.setVisible(true);
	}

}
