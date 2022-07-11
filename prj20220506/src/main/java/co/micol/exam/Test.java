package co.micol.exam;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test extends JFrame{
	public static void main(String[] args) {
		JFrame b1 = new JFrame();
	//	JButton b1 = new JButton();
		JButton b2 = new JButton();
	//	JButton b3 = new JButton();
		b1.setSize(500, 500);
		b1.setLocation(100,100);
		b1.setTitle("제목");
		b1.setVisible(true);
		b1.add(b2);
		b2.setSize(50, 50);
	}
		
}
