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
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addNewQuestion {

	private JFrame frmQuizCompetition;
	private JTextField txtQuestion;
	private JTextField txto1;
	private JTextField txto3;
	private JTextField txto4;
	private JTextField txtAnswer;
	private JTextField txto2;
	private JTextField txtID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addNewQuestion window = new addNewQuestion();
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
	public addNewQuestion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCompetition = new JFrame();
		frmQuizCompetition.getContentPane().setBackground(new Color(255, 250, 205));
		frmQuizCompetition.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(addNewQuestion.class.getResource("/images/add new question.png")));
		lblNewLabel.setBounds(31, 25, 65, 82);
		frmQuizCompetition.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ADD NEW QUESTION-");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setBounds(120, 25, 981, 65);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 140, 0));
		separator_1.setBounds(10, 97, 1124, 33);
		frmQuizCompetition.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Que ID");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(143, 165, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Question");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(143, 249, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Option A");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_3.setBounds(143, 332, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Option B");
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_4.setBounds(143, 412, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Option C");
		lblNewLabel_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_5.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_5.setBounds(143, 487, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Option D");
		lblNewLabel_1_6.setForeground(Color.BLACK);
		lblNewLabel_1_6.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_6.setBounds(143, 567, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Answer");
		lblNewLabel_1_7.setForeground(Color.BLACK);
		lblNewLabel_1_7.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_7.setBounds(143, 649, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_7);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(new Color(255, 140, 0));
		separator_1_1.setBounds(10, 712, 1124, 33);
		frmQuizCompetition.getContentPane().add(separator_1_1);
		
		txtQuestion = new JTextField();
		txtQuestion.setForeground(new Color(210, 105, 30));
		txtQuestion.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
		txtQuestion.setColumns(10);
		txtQuestion.setBounds(341, 242, 610, 60);
		frmQuizCompetition.getContentPane().add(txtQuestion);
		
		txto1 = new JTextField();
		txto1.setForeground(new Color(255, 165, 0));
		txto1.setFont(new Font("Corbel Light", Font.BOLD, 20));
		txto1.setColumns(10);
		txto1.setBounds(341, 325, 610, 60);
		frmQuizCompetition.getContentPane().add(txto1);
		
		txto3 = new JTextField();
		txto3.setForeground(new Color(255, 165, 0));
		txto3.setFont(new Font("Corbel Light", Font.BOLD, 20));
		txto3.setColumns(10);
		txto3.setBounds(341, 480, 610, 60);
		frmQuizCompetition.getContentPane().add(txto3);
		
		txto4 = new JTextField();
		txto4.setForeground(new Color(255, 165, 0));
		txto4.setFont(new Font("Corbel Light", Font.BOLD, 20));
		txto4.setColumns(10);
		txto4.setBounds(341, 567, 610, 60);
		frmQuizCompetition.getContentPane().add(txto4);
		
		txtAnswer = new JTextField();
		txtAnswer.setForeground(new Color(210, 105, 30));
		txtAnswer.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
		txtAnswer.setColumns(10);
		txtAnswer.setBounds(341, 649, 610, 60);
		frmQuizCompetition.getContentPane().add(txtAnswer);
		
		txto2 = new JTextField();
		txto2.setForeground(new Color(255, 165, 0));
		txto2.setFont(new Font("Corbel Light", Font.BOLD, 20));
		txto2.setColumns(10);
		txto2.setBounds(341, 405, 610, 60);
		frmQuizCompetition.getContentPane().add(txto2);
		
		txtID = new JTextField();
		txtID.setBackground(new Color(255, 255, 255));
		txtID.setHorizontalAlignment(SwingConstants.CENTER);
		txtID.setText("00");
		txtID.setForeground(new Color(255, 165, 0));
		txtID.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		txtID.setColumns(10);
		txtID.setBounds(341, 158, 151, 60);
		frmQuizCompetition.getContentPane().add(txtID);
		
		JButton btnExit = new JButton("Save");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				long id = Long.parseLong(txtID.getText());
				String name = txtQuestion.getText();
				String option1 = txto1.getText();
				String option2 = txto2.getText();
				String option3 = txto3.getText();
				String option4 = txto4.getText();
				String answer = txtAnswer.getText();
				
				
				
				
				ConnectionProvider db = new ConnectionProvider();
				int status= db.insertData(id, name, option1,option2,option3, option4 ,answer);
				
				if(status==1) {
					JOptionPane.showMessageDialog(null, "Data updated");
				}else {
					JOptionPane.showMessageDialog(null, "Problem in add data");
				}					
				
				
				
				
			}
		});
		btnExit.setForeground(new Color(255, 140, 0));
		btnExit.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnExit.setBackground(new Color(255, 250, 205));
		btnExit.setBounds(143, 764, 172, 53);
		frmQuizCompetition.getContentPane().add(btnExit);
		
		JButton btnExit_1 = new JButton("Clear");
		btnExit_1.addActionListener(new ActionListener() {
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
		btnExit_1.setForeground(new Color(255, 140, 0));
		btnExit_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnExit_1.setBackground(new Color(255, 250, 205));
		btnExit_1.setBounds(566, 764, 172, 53);
		frmQuizCompetition.getContentPane().add(btnExit_1);
		
		JButton btnExit_2 = new JButton("Exit");
		btnExit_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmQuizCompetition.setVisible(false);
			}
		});
		btnExit_2.setForeground(new Color(255, 140, 0));
		btnExit_2.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnExit_2.setBackground(new Color(255, 250, 205));
		btnExit_2.setBounds(1017, 764, 172, 53);
		frmQuizCompetition.getContentPane().add(btnExit_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(addNewQuestion.class.getResource("/images/quiz.jpj.jpg")));
		lblNewLabel_2.setBounds(1098, 10, 414, 751);
		frmQuizCompetition.getContentPane().add(lblNewLabel_2);
		frmQuizCompetition.setIconImage(Toolkit.getDefaultToolkit().getImage(addNewQuestion.class.getResource("/images/student.png")));
		frmQuizCompetition.setTitle("QUIZ COMPETITION");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width= (int)screenSize.width;
		int height= (int)screenSize.height;
		frmQuizCompetition.setSize(width ,height);
		frmQuizCompetition.setLocationRelativeTo(null);
		
		
		
		//frmQuizCompetition.setBounds(100, 100, 450, 300);
		frmQuizCompetition.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
