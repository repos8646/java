package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class ComponentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtPlus1;
	private JTextField txtPlus2;
	private JTextField txtPlus3;
	private JTextField txtMinus1;
	private JTextField txtMinus2;
	private JTextField txtMinus3;
	private JTextField txtMulti1;
	private JTextField txtMulti2;
	private JTextField txtMulti3;
	private JTextField txtDiv1;
	private JTextField txtDiv2;
	private JTextField txtDiv3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 678);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 76, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(12, 35, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인1 버튼 클릭...");
			}
		});
		btn1.setBounds(12, 59, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(132, 59, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("Yes 클릭!");
				}else {
					System.out.println("No 클릭!");
				}
			}
		});
		btn3.setBounds(268, 59, 97, 23);
		contentPane.add(btn3);
		
		JLabel lblNewLabel_1_1 = new JLabel("텍스트필드 실습");
		lblNewLabel_1_1.setBounds(12, 108, 131, 15);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 136, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(55, 133, 116, 21);
		contentPane.add(txtUid);
		txtUid.setColumns(10);
		
		JLabel lbResultUid = new JLabel("결과 : ");
		lbResultUid.setBounds(278, 136, 87, 15);
		contentPane.add(lbResultUid);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid = txtUid.getText();
				lbResultUid.setText("결과 : " + uid);
			}
		});
		btnUid.setBounds(176, 132, 97, 23);
		contentPane.add(btnUid);
		
	
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(12, 165, 57, 15);
		contentPane.add(lblNewLabel_2_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(55, 162, 116, 21);
		contentPane.add(txtName);
		
		JLabel lbResultName = new JLabel("결과 : ");
		lbResultName.setBounds(278, 165, 87, 15);
		contentPane.add(lbResultName);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				lbResultName.setText("결과 : " + name);
			}
		});
		btnName.setBounds(176, 161, 97, 23);
		contentPane.add(btnName);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("휴대폰");
		lblNewLabel_2_1_1.setBounds(12, 194, 57, 15);
		contentPane.add(lblNewLabel_2_1_1);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(55, 191, 116, 21);
		contentPane.add(txtHp);
		
		JLabel lbResultHp = new JLabel("결과 : ");
		lbResultHp.setBounds(278, 194, 144, 15);
		contentPane.add(lbResultHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hp = txtHp.getText();
				lbResultHp.setText("결과 : " + hp);
			}
		});
		btnHp.setBounds(176, 190, 97, 23);
		contentPane.add(btnHp);
		
		JLabel lblNewLabel_3 = new JLabel("덧셈");
		lblNewLabel_3.setBounds(12, 219, 33, 15);
		contentPane.add(lblNewLabel_3);
		
		txtPlus1 = new JTextField();
		txtPlus1.setBounds(44, 216, 62, 21);
		contentPane.add(txtPlus1);
		txtPlus1.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("+");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(107, 219, 33, 15);
		contentPane.add(lblNewLabel_3_1);
		
		txtPlus2 = new JTextField();
		txtPlus2.setColumns(10);
		txtPlus2.setBounds(139, 216, 62, 21);
		contentPane.add(txtPlus2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("=");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(200, 219, 33, 15);
		contentPane.add(lblNewLabel_3_1_1);
		
		txtPlus3 = new JTextField();
		txtPlus3.setColumns(10);
		txtPlus3.setBounds(232, 216, 62, 21);
		contentPane.add(txtPlus3);
		
		JButton btnPlus = new JButton("확인");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strNum1 = txtPlus1.getText();
				String strNum2 = txtPlus2.getText();
				
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				
				int num3 = num1 + num2;
				String strNum3 = ""+num3;
				
				txtPlus3.setText(""+num3); //strNum3 도 가능
			}
		});
		btnPlus.setBounds(300, 215, 76, 23);
		contentPane.add(btnPlus);
		
		JLabel lblNewLabel_3_2 = new JLabel("뺄셈");
		lblNewLabel_3_2.setBounds(12, 248, 33, 15);
		contentPane.add(lblNewLabel_3_2);
		
		txtMinus1 = new JTextField();
		txtMinus1.setColumns(10);
		txtMinus1.setBounds(44, 245, 62, 21);
		contentPane.add(txtMinus1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("-");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setBounds(107, 248, 33, 15);
		contentPane.add(lblNewLabel_3_1_2);
		
		txtMinus2 = new JTextField();
		txtMinus2.setColumns(10);
		txtMinus2.setBounds(139, 245, 62, 21);
		contentPane.add(txtMinus2);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("=");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setBounds(200, 248, 33, 15);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		txtMinus3 = new JTextField();
		txtMinus3.setColumns(10);
		txtMinus3.setBounds(232, 245, 62, 21);
		contentPane.add(txtMinus3);
		
		JButton btnMinus = new JButton("확인");
		btnMinus.setBounds(300, 244, 76, 23);
		contentPane.add(btnMinus);
		
		JLabel lblNewLabel_3_3 = new JLabel("곱셈");
		lblNewLabel_3_3.setBounds(12, 277, 33, 15);
		contentPane.add(lblNewLabel_3_3);
		
		txtMulti1 = new JTextField();
		txtMulti1.setColumns(10);
		txtMulti1.setBounds(44, 274, 62, 21);
		contentPane.add(txtMulti1);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("x");
		lblNewLabel_3_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_3.setBounds(107, 277, 33, 15);
		contentPane.add(lblNewLabel_3_1_3);
		
		txtMulti2 = new JTextField();
		txtMulti2.setColumns(10);
		txtMulti2.setBounds(139, 274, 62, 21);
		contentPane.add(txtMulti2);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("=");
		lblNewLabel_3_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_2.setBounds(200, 277, 33, 15);
		contentPane.add(lblNewLabel_3_1_1_2);
		
		txtMulti3 = new JTextField();
		txtMulti3.setColumns(10);
		txtMulti3.setBounds(232, 274, 62, 21);
		contentPane.add(txtMulti3);
		
		JButton btnMulti = new JButton("확인");
		btnMulti.setBounds(300, 273, 76, 23);
		contentPane.add(btnMulti);
		
		JLabel lblNewLabel_3_4 = new JLabel("나눗셈");
		lblNewLabel_3_4.setBounds(0, 309, 57, 15);
		contentPane.add(lblNewLabel_3_4);
		
		txtDiv1 = new JTextField();
		txtDiv1.setColumns(10);
		txtDiv1.setBounds(44, 306, 62, 21);
		contentPane.add(txtDiv1);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("/");
		lblNewLabel_3_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_4.setBounds(107, 309, 33, 15);
		contentPane.add(lblNewLabel_3_1_4);
		
		txtDiv2 = new JTextField();
		txtDiv2.setColumns(10);
		txtDiv2.setBounds(139, 306, 62, 21);
		contentPane.add(txtDiv2);
		
		JLabel lblNewLabel_3_1_1_3 = new JLabel("=");
		lblNewLabel_3_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_3.setBounds(200, 309, 33, 15);
		contentPane.add(lblNewLabel_3_1_1_3);
		
		txtDiv3 = new JTextField();
		txtDiv3.setColumns(10);
		txtDiv3.setBounds(232, 306, 62, 21);
		contentPane.add(txtDiv3);
		
		JButton btnDiv = new JButton("확인");
		btnDiv.setBounds(300, 305, 76, 23);
		contentPane.add(btnDiv);
		
		JLabel lblNewLabel_4 = new JLabel("체크박스 실습");
		lblNewLabel_4.setBounds(12, 337, 97, 15);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 358, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(73, 358, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(132, 358, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(193, 358, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(254, 358, 57, 23);
		contentPane.add(chk5);
		
		JLabel lbResultCheck = new JLabel("결과 : ");
		lbResultCheck.setBounds(12, 387, 390, 15);
		contentPane.add(lbResultCheck);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbResultCheck.setText("결과 : " + cities);
			}
		});
		
		btnCheck.setBounds(319, 358, 97, 23);
		contentPane.add(btnCheck);
		
		JLabel label = new JLabel("New label");
		label.setBounds(12, 403, -21, 47);
		contentPane.add(label);
		
		JLabel lblNewLabel_5 = new JLabel("테이블 실습");
		lblNewLabel_5.setBounds(12, 412, 107, 15);
		contentPane.add(lblNewLabel_5);
		
		table = new JTable();
		table.setBounds(22, 437, 380, 123);
		contentPane.add(table);
		
		// 테이블 설정
		String[] columNames = {"아이디", "이름", "나이", "휴대폰"};
				
		DefaultTableModel model = new DefaultTableModel(columNames, 0);
		model.setRowCount(0);
		table.setModel(model);
		
		JButton btnTable = new JButton("출력");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<Person> persons = new ArrayList<>();
				persons.add(new Person("a101", "김유신", 23, "010-1234-1001"));
				persons.add(new Person("a102", "김춘추", 21, "010-1234-1002"));
				persons.add(new Person("a103", "장보고", 33, "010-1234-1003"));
				persons.add(new Person("a104", "강감찬", 43, "010-1234-1004"));
				persons.add(new Person("a105", "이순신", 53, "010-1234-1005"));
				
				for(Person person : persons) {
					Object[] rowData = {person.getId(), person.getName(), person.getAge(), person.getHp()};
					model.addRow(rowData);
				}
			}
		});
		btnTable.setBounds(12, 570, 97, 23);
		contentPane.add(btnTable);

		
	}
}
