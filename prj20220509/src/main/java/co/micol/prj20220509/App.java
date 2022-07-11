package co.micol.prj20220509;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class App {
	private static JTextField textField;
	private static JTextField textField_1;
	public static void main(String[] args) {
		MainWindow m = new MainWindow();
		m.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(228, 101, 116, 21);
		m.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(228, 144, 116, 21);
		m.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(124, 104, 79, 15);
		m.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(124, 147, 57, 15);
		m.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(":zzzz");
			}
		});
		btnNewButton.setBounds(179, 223, 97, 23);
		m.getContentPane().add(btnNewButton);
	}

}
