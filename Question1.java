package Package1;

import java.awt.Dimension;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;

import Project.ConnectionProvider;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Question1 {

	private JFrame frmQuizCompetition;
	private JTextField txtQuestion;
	private JTextField txtOptionA;
	private JTextField txtOptionB;
	private JTextField txtOptionC;
	private JTextField txtOptionD;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtqno;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question1 window = new Question1();
					window.frmQuizCompetition.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Question1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCompetition = new JFrame();
		frmQuizCompetition.getContentPane().setBackground(new Color(255, 250, 205));
		frmQuizCompetition.setIconImage(Toolkit.getDefaultToolkit().getImage(Question1.class.getResource("/images/student.png")));
		frmQuizCompetition.setTitle("QUIZ COMPETITION");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width= (int)screenSize.width;
		int height= (int)screenSize.height;
		frmQuizCompetition.setSize(width ,height);
		frmQuizCompetition.setLocationRelativeTo(null);
		frmQuizCompetition.getContentPane().setLayout(null);

		JButton txt18 = new JButton("18");
		txt18.setBackground(new Color(255, 140, 0));
		txt18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =18;
				LoadQuestions(id);
			}
		});
		
txt18.setFont(new Font("Tahoma", Font.BOLD, 18));
txt18.setBounds(1263, 299, 64, 45);
frmQuizCompetition.getContentPane().add(txt18);



				JButton txt1 = new JButton("1");
				txt1.setBackground(new Color(255, 140, 0));
				txt1.setForeground(new Color(0, 0, 0));
				txt1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						int id =1;
						LoadQuestions(id);
					}	

				});

				txt1.setFont(new Font("Tahoma", Font.BOLD, 18));
				txt1.setBounds(1078, 127, 64, 45);
				frmQuizCompetition.getContentPane().add(txt1);
				
				
				
				
				
						
		
		JButton txt16 = new JButton("16");
		txt16.setBackground(new Color(255, 140, 0));
		txt16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =16;
				LoadQuestions(id);
			}

		});
		txt16.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt16.setBounds(1078, 299, 64, 45);
		frmQuizCompetition.getContentPane().add(txt16);

		JButton txt13 = new JButton("13");
		txt13.setBackground(new Color(255, 140, 0));
		txt13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =13;
				LoadQuestions(id);
			}

			
		});
		txt13.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt13.setBounds(1263, 244, 64, 45);
		frmQuizCompetition.getContentPane().add(txt13);

		JButton txt19 = new JButton("19");
		txt19.setBackground(new Color(255, 140, 0));
		txt19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =19;
				LoadQuestions(id);
			}

			
		});
		txt19.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt19.setBounds(1354, 299, 64, 45);
		frmQuizCompetition.getContentPane().add(txt19);

		JButton txt17 = new JButton("17");
		txt17.setBackground(new Color(255, 140, 0));
		txt17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =17;
				LoadQuestions(id);
			}

			
		});
		txt17.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt17.setBounds(1170, 299, 64, 45);
		frmQuizCompetition.getContentPane().add(txt17);

		JButton txt6 = new JButton("6");
		txt6.setBackground(new Color(255, 140, 0));
		txt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =6;
				LoadQuestions(id);
			}

			
		});
		txt6.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt6.setBounds(1078, 189, 64, 45);
		frmQuizCompetition.getContentPane().add(txt6);

		JButton txt2 = new JButton("2");
		txt2.setBackground(new Color(255, 140, 0));
		txt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =2;
				LoadQuestions(id);
			}

			

		});
		txt2.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt2.setBounds(1170, 127, 64, 45);
		frmQuizCompetition.getContentPane().add(txt2);

		JButton txt12 = new JButton("12");
		txt12.setBackground(new Color(255, 140, 0));
		txt12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =12;
				LoadQuestions(id);
			}

			
		});
		txt12.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt12.setBounds(1170, 244, 64, 45);
		frmQuizCompetition.getContentPane().add(txt12);

		JButton txt14 = new JButton("14");
		txt14.setBackground(new Color(255, 140, 0));
		txt14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =14;
				LoadQuestions(id);
			}

		});
		txt14.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt14.setBounds(1354, 244, 64, 45);
		frmQuizCompetition.getContentPane().add(txt14);

		JButton txt9 = new JButton("9");
		txt9.setBackground(new Color(255, 140, 0));
		txt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =9;
				LoadQuestions(id);
			}

			
		});
		txt9.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt9.setBounds(1354, 182, 64, 45);
		frmQuizCompetition.getContentPane().add(txt9);

		JButton txt3 = new JButton("3");
		txt3.setBackground(new Color(255, 140, 0));
		txt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =3;
				LoadQuestions(id);
			}

			

		});
		txt3.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt3.setBounds(1263, 127, 64, 45);
		frmQuizCompetition.getContentPane().add(txt3);

		JButton txt10 = new JButton("10");
		txt10.setBackground(new Color(255, 140, 0));
		txt10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =10;
				LoadQuestions(id);
			}

		});
		txt10.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt10.setBounds(1448, 182, 64, 45);
		frmQuizCompetition.getContentPane().add(txt10);

		JButton txt11 = new JButton("11");
		txt11.setBackground(new Color(255, 140, 0));
		txt11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =11;
				LoadQuestions(id);
			}

		
		});
		txt11.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt11.setBounds(1078, 244, 64, 45);
		frmQuizCompetition.getContentPane().add(txt11);

		JButton txt4 = new JButton("4");
		txt4.setBackground(new Color(255, 140, 0));
		txt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =4;
				LoadQuestions(id);
			}

			
		});
		txt4.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt4.setBounds(1354, 127, 64, 45);
		frmQuizCompetition.getContentPane().add(txt4);

		JButton txt7 = new JButton("7");
		txt7.setBackground(new Color(255, 140, 0));
		txt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =7;
				LoadQuestions(id);
			}

			
		});
		txt7.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt7.setBounds(1170, 189, 64, 45);
		frmQuizCompetition.getContentPane().add(txt7);

		JButton txt15 = new JButton("15");
		txt15.setBackground(new Color(255, 140, 0));
		txt15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =15;
				LoadQuestions(id);
			}

			
		});
		txt15.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt15.setBounds(1448, 244, 64, 45);
		frmQuizCompetition.getContentPane().add(txt15);

		JButton txt8 = new JButton("8");
		txt8.setBackground(new Color(255, 140, 0));
		txt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =8;
				LoadQuestions(id);
			}

			
		});
		txt8.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt8.setBounds(1263, 182, 64, 45);
		frmQuizCompetition.getContentPane().add(txt8);

		JButton txt20 = new JButton("20");
		txt20.setBackground(new Color(255, 140, 0));
		txt20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =20;
				LoadQuestions(id);
			}

			
		});


		txt20.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt20.setBounds(1448, 299, 64, 45);
		frmQuizCompetition.getContentPane().add(txt20);

		JButton txt5 = new JButton("5");
		txt5.setBackground(new Color(255, 140, 0));
		txt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =5;
				LoadQuestions(id);
			}

			
		});
		txt5.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt5.setBounds(1448, 127, 64, 45);
		frmQuizCompetition.getContentPane().add(txt5);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 102));
		panel.setBounds(25, 129, 1042, 611);
		frmQuizCompetition.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Que.");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 10, 77, 51);
		panel.add(lblNewLabel);

		txtQuestion = new JTextField();
		txtQuestion.setFont(new Font("Segoe Print", Font.BOLD, 20));
		txtQuestion.setBounds(129, 10, 903, 85);
		panel.add(txtQuestion);
		txtQuestion.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(75, 147, 852, 69);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("A");
		rdbtnNewRadioButton.setBounds(6, 17, 39, 31);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		buttonGroup.add(rdbtnNewRadioButton);
		panel_1.add(rdbtnNewRadioButton);

		txtOptionA = new JTextField();
		txtOptionA.setBounds(51, 5, 791, 54);
		txtOptionA.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		panel_1.add(txtOptionA);
		txtOptionA.setColumns(10);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(75, 248, 852, 69);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);

		JRadioButton rdbtnB = new JRadioButton("B");
		rdbtnB.setBounds(6, 16, 39, 33);
		rdbtnB.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnB.setForeground(new Color(0, 0, 0));
		buttonGroup.add(rdbtnB);
		panel_1_1.add(rdbtnB);

		txtOptionB = new JTextField();
		txtOptionB.setBounds(51, 5, 791, 54);
		txtOptionB.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		txtOptionB.setColumns(10);
		panel_1_1.add(txtOptionB);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(75, 350, 852, 69);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);

		JRadioButton rdbtnC = new JRadioButton("C");
		rdbtnC.setBounds(6, 16, 39, 33);
		rdbtnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonGroup.add(rdbtnC);
		panel_1_2.add(rdbtnC);

		txtOptionC = new JTextField();
		txtOptionC.setBounds(51, 5, 791, 54);
		txtOptionC.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		txtOptionC.setColumns(10);
		panel_1_2.add(txtOptionC);

		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(75, 455, 852, 69);
		panel.add(panel_1_3);
		panel_1_3.setLayout(null);

		JRadioButton rdbtnD = new JRadioButton("D");
		rdbtnD.setBounds(6, 19, 41, 33);
		rdbtnD.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonGroup.add(rdbtnD);
		panel_1_3.add(rdbtnD);

		txtOptionD = new JTextField();
		txtOptionD.setBounds(53, 5, 789, 54);
		txtOptionD.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		txtOptionD.setColumns(10);
		panel_1_3.add(txtOptionD);

		JButton btnSave = new JButton("Save");
		btnSave.setForeground(new Color(255, 140, 0));
		btnSave.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnSave.setBackground(new Color(255, 250, 205));
		btnSave.setBounds(127, 764, 172, 53);
		frmQuizCompetition.getContentPane().add(btnSave);

		JButton btnNext = new JButton("Next");
		btnNext.setForeground(new Color(255, 140, 0));
		btnNext.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnNext.setBackground(new Color(255, 250, 205));
		btnNext.setBounds(353, 764, 172, 53);
		frmQuizCompetition.getContentPane().add(btnNext);

		JButton btnPrevious_2 = new JButton("Previous");
		btnPrevious_2.setForeground(new Color(255, 140, 0));
		btnPrevious_2.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnPrevious_2.setBackground(new Color(255, 250, 205));
		btnPrevious_2.setBounds(570, 764, 172, 53);
		frmQuizCompetition.getContentPane().add(btnPrevious_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 250, 205));
		panel_2.setBounds(1072, 115, 645, 300);
		frmQuizCompetition.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		txtqno = new JTextField();
		txtqno.setHorizontalAlignment(SwingConstants.CENTER);
		txtqno.setForeground(Color.RED);
		txtqno.setBackground(Color.WHITE);
		txtqno.setBounds(167, 240, 114, 50);
		txtqno.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(txtqno);
		txtqno.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 140, 0));
		separator_1.setBounds(81, 84, 1124, 33);
		frmQuizCompetition.getContentPane().add(separator_1);
		
		JButton btnPrevious_2_1 = new JButton("End Test");
		btnPrevious_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				showQuestion.main(null);
			}
		});
		btnPrevious_2_1.setForeground(new Color(255, 140, 0));
		btnPrevious_2_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnPrevious_2_1.setBackground(new Color(255, 250, 205));
		btnPrevious_2_1.setBounds(1251, 752, 172, 53);
		frmQuizCompetition.getContentPane().add(btnPrevious_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Start Solving...");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setBounds(240, 10, 981, 65);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1);


		/*	try {
			Connection con=ConnectionProvider();
			Statement stmt=con.createStatement();
			ResultSet result1=stmt.executeQuery("Select * from question where id='"+questionId +"'");
			while(result1.next())
			{
				textField.setText(result1.getString(1));
				textField_1.setText(result1.getString(2));
				rdbtnNewRadioButton.setText(result1.getString(3));
				rdbtnNewRadioButton_1.setText(result1.getString(4));
				rdbtnNewRadioButton_2.setText(result1.getString(5));
				rdbtnNewRadioButton_3.setText(result1.getString(6));
		          answer = result1.getString(7);
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	private Connection ConnectionProvider() {
		// TODO Auto-generated method stub
		return null;
		 */
	}
		String answer = "";
		
		public void LoadQuestions(int id) {
			ConnectionProvider jd = new ConnectionProvider();
			//String query = "select * from java_questions where qId = ? ";
			String query = "select * from question where id = "+id;
//			try {
//				jd.pstmt.setInt(1, id);
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			
			try {
				jd.stmt = jd.con.createStatement();
				jd.result = jd.stmt.executeQuery(query);
				
				while(jd.result.next()) {
					txtqno.setText(jd.result.getString(1));
					txtQuestion.setText(jd.result.getString(2));
					txtOptionA.setText(jd.result.getString(3));
					txtOptionB.setText(jd.result.getString(4));
					txtOptionC.setText(jd.result.getString(5));
					txtOptionD.setText(jd.result.getString(6));
					answer = jd.result.getString(7);
					
					break;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			
		
		
		
	}
}
















	