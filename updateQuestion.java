package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

import Project.ConnectionProvider;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class updateQuestion {

	private JFrame frmQuizCompetition;
	private JTextField txtID;
	private JTextField txtQuestion;
	private JTextField txto1;
	private JTextField txto2;
	private JTextField txto3;
	private JTextField txto4;
	private JTextField txtAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateQuestion window = new updateQuestion();
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
	public updateQuestion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCompetition = new JFrame();
		frmQuizCompetition.getContentPane().setBackground(new Color(255, 250, 205));
		frmQuizCompetition.setIconImage(Toolkit.getDefaultToolkit().getImage(updateQuestion.class.getResource("/images/student.png")));
		frmQuizCompetition.setTitle("QUIZ COMPETITION");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width= (int)screenSize.width;
		int height= (int)screenSize.height;
		frmQuizCompetition.setSize(width ,height);
		frmQuizCompetition.setLocationRelativeTo(null);
		frmQuizCompetition.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(updateQuestion.class.getResource("/images/quiz.jpj.jpg")));
		lblNewLabel_2.setBounds(1098, 10, 414, 751);
		frmQuizCompetition.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(updateQuestion.class.getResource("/images/Update Question.png")));
		lblNewLabel.setBounds(10, 10, 65, 82);
		frmQuizCompetition.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UPDATE QUESTION-");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setBounds(85, 10, 981, 65);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Question");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(20, 193, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Que ID");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(20, 109, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1);
		
		txtID = new JTextField();
		txtID.setHorizontalAlignment(SwingConstants.CENTER);
		txtID.setForeground(new Color(255, 165, 0));
		txtID.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		txtID.setColumns(10);
		txtID.setBackground(Color.WHITE);
		txtID.setBounds(218, 102, 151, 60);
		frmQuizCompetition.getContentPane().add(txtID);
		
		txtQuestion = new JTextField();
		txtQuestion.setForeground(new Color(210, 105, 30));
		txtQuestion.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
		txtQuestion.setColumns(10);
		txtQuestion.setBounds(218, 186, 610, 60);
		frmQuizCompetition.getContentPane().add(txtQuestion);
		
		JLabel lblNewLabel_1_3 = new JLabel("Option A");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_3.setBounds(20, 276, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_3);
		
		txto1 = new JTextField();
		txto1.setForeground(new Color(255, 165, 0));
		txto1.setFont(new Font("Corbel Light", Font.BOLD, 20));
		txto1.setColumns(10);
		txto1.setBounds(218, 269, 610, 60);
		frmQuizCompetition.getContentPane().add(txto1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Option B");
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_4.setBounds(20, 356, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_4);
		
		txto2 = new JTextField();
		txto2.setForeground(new Color(255, 165, 0));
		txto2.setFont(new Font("Corbel Light", Font.BOLD, 20));
		txto2.setColumns(10);
		txto2.setBounds(218, 349, 610, 60);
		frmQuizCompetition.getContentPane().add(txto2);
		
		JLabel lblNewLabel_1_5 = new JLabel("Option C");
		lblNewLabel_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_5.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_5.setBounds(20, 431, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_5);
		
		txto3 = new JTextField();
		txto3.setForeground(new Color(255, 165, 0));
		txto3.setFont(new Font("Corbel Light", Font.BOLD, 20));
		txto3.setColumns(10);
		txto3.setBounds(218, 424, 610, 60);
		frmQuizCompetition.getContentPane().add(txto3);
		
		JLabel lblNewLabel_1_6 = new JLabel("Option D");
		lblNewLabel_1_6.setForeground(Color.BLACK);
		lblNewLabel_1_6.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_6.setBounds(20, 511, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_6);
		
		txto4 = new JTextField();
		txto4.setForeground(new Color(255, 165, 0));
		txto4.setFont(new Font("Corbel Light", Font.BOLD, 20));
		txto4.setColumns(10);
		txto4.setBounds(218, 511, 610, 60);
		frmQuizCompetition.getContentPane().add(txto4);
		
		JLabel lblNewLabel_1_7 = new JLabel("Answer");
		lblNewLabel_1_7.setForeground(Color.BLACK);
		lblNewLabel_1_7.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_7.setBounds(20, 593, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_7);
		
		txtAnswer = new JTextField();
		txtAnswer.setForeground(new Color(210, 105, 30));
		txtAnswer.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
		txtAnswer.setColumns(10);
		txtAnswer.setBounds(218, 593, 610, 60);
		frmQuizCompetition.getContentPane().add(txtAnswer);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				long id = Long.parseLong(txtID.getText());
				String name = txtQuestion.getText();
				String option1 = txto1.getText();
				String option2 = txto2.getText();
				String option3 = txto3.getText();
				String option4 = txto4.getText();
				String answer = txtAnswer.getText();
				
				
				
				
				ConnectionProvider db = new ConnectionProvider();
				int status= db.insertUpdate(id, name, option1,option2,option3, option4 ,answer);
				
				if(status==1) {
					JOptionPane.showMessageDialog(null, "Data updated");
				}else {
					JOptionPane.showMessageDialog(null, "Problem in add data");
				}								
				
			}
		});
		btnUpdate.setForeground(new Color(255, 140, 0));
		btnUpdate.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnUpdate.setBackground(new Color(255, 250, 205));
		btnUpdate.setBounds(20, 743, 172, 53);
		frmQuizCompetition.getContentPane().add(btnUpdate);
		
		JButton btnReset = new JButton("Clear");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtID.setText(null);
				txtQuestion.setText(null);
				txto1.setText(null);
				txto2.setText(null);
				txto3.setText(null);
				txto4.setText(null);
				txtAnswer.setText(null);
				
			}
		});
		btnReset.setForeground(new Color(255, 140, 0));
		btnReset.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnReset.setBackground(new Color(255, 250, 205));
		btnReset.setBounds(362, 743, 172, 53);
		frmQuizCompetition.getContentPane().add(btnReset);
		
		JButton btnExit_1 = new JButton("Exit");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmQuizCompetition.setVisible(false);
			}
		});
		btnExit_1.setForeground(new Color(255, 140, 0));
		btnExit_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnExit_1.setBackground(new Color(255, 250, 205));
		btnExit_1.setBounds(753, 743, 172, 53);
		frmQuizCompetition.getContentPane().add(btnExit_1);
		
		JButton btnGetData = new JButton("Search");
		btnGetData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id= Integer.parseInt(txtID.getText());
				
				ConnectionProvider db = new ConnectionProvider();
				ResultSet result = null;
				result = db.getRow(id);
				
				try {
					while(result.next()) {
						txtQuestion.setText(result.getString(2));
						txto1.setText(result.getString(3));
						txto2.setText(result.getString(4));
						txto3.setText(result.getString(5));
						txto4.setText(result.getString(6));
						txtID.setEditable(false);
						
					}
				}
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					result.close();
					
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnGetData.setIcon(new ImageIcon(updateQuestion.class.getResource("/images/search.png")));
		btnGetData.setForeground(new Color(255, 140, 0));
		btnGetData.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnGetData.setBackground(new Color(255, 250, 205));
		btnGetData.setBounds(468, 109, 172, 53);
		frmQuizCompetition.getContentPane().add(btnGetData);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 140, 0));
		separator_1.setBounds(10, 85, 1124, 33);
		frmQuizCompetition.getContentPane().add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(new Color(255, 140, 0));
		separator_1_1.setBounds(10, 702, 1124, 33);
		frmQuizCompetition.getContentPane().add(separator_1_1);
		
		
		//frmQuizCompetition.setBounds(100, 100, 450, 300);
		frmQuizCompetition.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
