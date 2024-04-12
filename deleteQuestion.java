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
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class deleteQuestion {

	private JFrame frmQuizCompetition;
	private JTextField txtID;
	private JTextField txtQuestion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deleteQuestion window = new deleteQuestion();
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
	public deleteQuestion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCompetition = new JFrame();
		frmQuizCompetition.getContentPane().setBackground(new Color(255, 250, 205));
		frmQuizCompetition.setIconImage(Toolkit.getDefaultToolkit().getImage(deleteQuestion.class.getResource("/images/student.png")));
		frmQuizCompetition.setTitle("QUIZ COMPETITION");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width= (int)screenSize.width;
		int height= (int)screenSize.height;
		frmQuizCompetition.setSize(width ,height);
		frmQuizCompetition.setLocationRelativeTo(null);
		frmQuizCompetition.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(deleteQuestion.class.getResource("/images/quiz.jpj.jpg")));
		lblNewLabel_2.setBounds(1098, 10, 414, 751);
		frmQuizCompetition.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(deleteQuestion.class.getResource("/images/delete Question.png")));
		lblNewLabel.setBounds(31, 10, 65, 82);
		frmQuizCompetition.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DELETE QUESTION-");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setBounds(120, 10, 981, 65);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 140, 0));
		separator_1.setBounds(10, 82, 1124, 33);
		frmQuizCompetition.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Que ID");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 35));
		lblNewLabel_1_1.setBounds(287, 188, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1);
		
		txtID = new JTextField();
		txtID.setHorizontalAlignment(SwingConstants.CENTER);
		txtID.setForeground(new Color(255, 165, 0));
		txtID.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		txtID.setColumns(10);
		txtID.setBackground(Color.WHITE);
		txtID.setBounds(485, 181, 151, 60);
		frmQuizCompetition.getContentPane().add(txtID);
		
		JLabel lblNewLabel_1_2 = new JLabel("Question");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Bradley Hand ITC", Font.BOLD, 35));
		lblNewLabel_1_2.setBounds(56, 318, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_2);
		
		txtQuestion = new JTextField();
		txtQuestion.setForeground(new Color(210, 105, 30));
		txtQuestion.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
		txtQuestion.setColumns(10);
		txtQuestion.setBounds(254, 311, 610, 60);
		frmQuizCompetition.getContentPane().add(txtQuestion);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
int id= Integer.parseInt(txtID.getText());
				
				ConnectionProvider db = new ConnectionProvider();
				ResultSet result = null;
				result = db.getRow(id);
				
				try {
					while(result.next()) {
						txtQuestion.setText(result.getString(2));
						
						txtID.setEditable(false);
						
					}
				}
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
			}
		});
		btnSearch.setIcon(new ImageIcon(deleteQuestion.class.getResource("/images/search.png")));
		btnSearch.setForeground(new Color(255, 140, 0));
		btnSearch.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnSearch.setBackground(new Color(255, 250, 205));
		btnSearch.setBounds(656, 188, 172, 53);
		frmQuizCompetition.getContentPane().add(btnSearch);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				frmQuizCompetition.setVisible(false);
			}
		});
		btnExit.setForeground(new Color(255, 140, 0));
		btnExit.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnExit.setBackground(new Color(255, 250, 205));
		btnExit.setBounds(997, 764, 172, 53);
		frmQuizCompetition.getContentPane().add(btnExit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				long id = Long.parseLong(txtID.getText());
				String name = txtQuestion.getText();
	
				ConnectionProvider db = new ConnectionProvider();
				int status= db.insertDelete(id, name);
				
				if(status==1) {
					JOptionPane.showMessageDialog(null, "Data Deleted");
				}else {
					JOptionPane.showMessageDialog(null, "Problem in add delete");
				}												
			}
		});
		btnDelete.setForeground(new Color(255, 140, 0));
		btnDelete.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnDelete.setBackground(new Color(255, 250, 205));
		btnDelete.setBounds(287, 468, 172, 53);
		frmQuizCompetition.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtID.setText(null);
				txtQuestion.setText(null);
				
			}
		});
		btnClear.setForeground(new Color(255, 140, 0));
		btnClear.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnClear.setBackground(new Color(255, 250, 205));
		btnClear.setBounds(593, 468, 172, 53);
		frmQuizCompetition.getContentPane().add(btnClear);
		
		
		//frmQuizCompetition.setBounds(100, 100, 450, 300);
		frmQuizCompetition.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
