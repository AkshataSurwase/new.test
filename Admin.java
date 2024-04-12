package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;



import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Admin {

	private JFrame frmQuizCompetition;
	private JTextField txtLoginName;
	private JPasswordField txtPassword;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
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
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCompetition = new JFrame();
		frmQuizCompetition.getContentPane().setBackground(new Color(255, 250, 205));
		frmQuizCompetition.setIconImage(Toolkit.getDefaultToolkit().getImage(Admin.class.getResource("/images/student.png")));
		frmQuizCompetition.setTitle("QUIZ COMPETITION");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width= (int)screenSize.width;
		int height= (int)screenSize.height;
		frmQuizCompetition.setSize(width ,height);
		frmQuizCompetition.setLocationRelativeTo(null);
		frmQuizCompetition.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Admin.class.getResource("/images/quiz.jpj.jpg")));
		lblNewLabel.setBounds(10, 21, 421, 752);
		frmQuizCompetition.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login Name");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1.setBounds(582, 236, 194, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(582, 362, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String loginName = txtLoginName.getText();
				String password = txtPassword.getText();
				
				System.out.println(loginName + password);
				if(loginName.equals("Akshata")&& password.equals("Surwase")) {
					//System.out.println("You are valid user!!!");
					
					Edit.main(null);
					
				}else {
					JOptionPane.showMessageDialog(null, "Invalid user");
				}
					}
		});
		btnLogin.setForeground(new Color(255, 140, 0));
		btnLogin.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnLogin.setBackground(new Color(255, 250, 205));
		btnLogin.setBounds(928, 544, 172, 53);
		frmQuizCompetition.getContentPane().add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmQuizCompetition.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(255, 140, 0));
		btnBack.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnBack.setBackground(new Color(255, 250, 205));
		btnBack.setBounds(604, 544, 172, 53);
		frmQuizCompetition.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(255, 140, 0));
		btnExit.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnExit.setBackground(new Color(255, 250, 205));
		btnExit.setBounds(1270, 544, 172, 53);
		frmQuizCompetition.getContentPane().add(btnExit);
		
		txtLoginName = new JTextField();
		txtLoginName.setForeground(new Color(255, 165, 0));
		txtLoginName.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		txtLoginName.setColumns(10);
		txtLoginName.setBounds(832, 236, 610, 60);
		frmQuizCompetition.getContentPane().add(txtLoginName);
		
		txtPassword = new JPasswordField();
		txtPassword.setForeground(new Color(255, 165, 0));
		txtPassword.setFont(new Font("Sylfaen", Font.BOLD, 20));
		txtPassword.setBounds(832, 362, 610, 53);
		frmQuizCompetition.getContentPane().add(txtPassword);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("show");
		chckbxNewCheckBox.setBackground(new Color(255, 250, 240));
		chckbxNewCheckBox.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected())
				{
				txtPassword.setEchoChar((char)0);
			}
			else 
				txtPassword.setEchoChar('*');
			}});
		
		chckbxNewCheckBox.setBounds(842, 452, 88, 27);
		frmQuizCompetition.getContentPane().add(chckbxNewCheckBox);
		
		//frmQuizCompetition.setBounds(100, 100, 450, 300);
		frmQuizCompetition.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
