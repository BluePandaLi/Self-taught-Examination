import javax.swing.*;

public class Example5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame jw = new JFrame();
        JPanel p = new JPanel();
//        p.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        //该面板设置成背景透明
        p.setOpaque(false);
        jw.add(p);
        
		jw.setTitle("这是我的第一个窗口");
		jw.setSize(250, 200);
		
		JButton jb = new JButton();
		jb.setBounds(0, 0, 30, 20);
		jb.setText("这是我的第一个按钮");
		
		p.add(jb);
		jw.setVisible(true);
		
	}

}
