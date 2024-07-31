package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.setBounds(12, 72, 56, 52);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("8");
		btnNewButton_1_1.setBounds(80, 72, 56, 52);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("9");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setBounds(145, 72, 56, 52);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("/");
		btnNewButton_1_3.setBounds(210, 72, 56, 52);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("4");
		btnNewButton_1_4.setBounds(12, 134, 56, 52);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_1_1 = new JButton("5");
		btnNewButton_1_1_1.setBounds(80, 134, 56, 52);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("6");
		btnNewButton_1_2_1.setBounds(145, 134, 56, 52);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_3_1 = new JButton("x");
		btnNewButton_1_3_1.setBounds(210, 134, 56, 52);
		contentPane.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_5 = new JButton("1");
		btnNewButton_1_5.setBounds(12, 196, 56, 52);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_1_2 = new JButton("2");
		btnNewButton_1_1_2.setBounds(80, 196, 56, 52);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_2_2 = new JButton("3");
		btnNewButton_1_2_2.setBounds(145, 196, 56, 52);
		contentPane.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_1_3_2 = new JButton("-");
		btnNewButton_1_3_2.setBounds(210, 196, 56, 52);
		contentPane.add(btnNewButton_1_3_2);
		
		JButton btnNewButton_1_6 = new JButton("C");
		btnNewButton_1_6.setBounds(12, 258, 56, 52);
		contentPane.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_1_3 = new JButton("0");
		btnNewButton_1_1_3.setBounds(80, 258, 56, 52);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_2_3 = new JButton("=");
		btnNewButton_1_2_3.setBounds(145, 258, 56, 52);
		contentPane.add(btnNewButton_1_2_3);
		
		JButton btnNewButton_1_3_3 = new JButton("+");
		btnNewButton_1_3_3.setBounds(210, 258, 56, 52);
		contentPane.add(btnNewButton_1_3_3);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("돋움", Font.PLAIN, 24));
		textField.setEditable(false);
		textField.setBounds(12, 10, 254, 52);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
