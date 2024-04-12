package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmQuizCompetition;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCompetition = new JFrame();
		frmQuizCompetition.getContentPane().setBackground(new Color(255, 250, 205));
		frmQuizCompetition.getContentPane().setForeground(new Color(240, 230, 140));
		frmQuizCompetition.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/images/student.png")));
		frmQuizCompetition.setTitle("QUIZ COMETITION");
		
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width= (int)screenSize.width;
		int height= (int)screenSize.height;
		frmQuizCompetition.setSize(width ,height);
		frmQuizCompetition.setLocationRelativeTo(null);
		frmQuizCompetition.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/images/quiz.jpj.jpg")));
		lblNewLabel.setBounds(10, 10, 410, 727);
		frmQuizCompetition.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO ");
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD, 59));
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBounds(452, 39, 502, 68);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("QUIZ COMPETITION.!!");
		lblNewLabel_2.setFont(new Font("Snap ITC", Font.BOLD, 60));
		lblNewLabel_2.setForeground(new Color(255, 165, 0));
		lblNewLabel_2.setBounds(556, 143, 878, 69);
		frmQuizCompetition.getContentPane().add(lblNewLabel_2);
		
		JButton btnLogin = new JButton("Student");
		btnLogin.setIcon(new ImageIcon(Login.class.getResource("/images/index student.png")));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EntryPage.main(null);
			}
		});
		btnLogin.setForeground(new Color(255, 165, 0));
		btnLogin.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		btnLogin.setBackground(new Color(255, 250, 205));
		btnLogin.setBounds(837, 718, 184, 52);
		frmQuizCompetition.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you really want to exit application","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					System.exit(0);
			}
				}
		});
		btnExit.setForeground(new Color(255, 165, 0));
		btnExit.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
		btnExit.setBackground(new Color(255, 250, 205));
		btnExit.setBounds(1176, 718, 149, 52);
		frmQuizCompetition.getContentPane().add(btnExit);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setIcon(new ImageIcon(Login.class.getResource("/images/index admin.png")));
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Admin.main(null);
			}
		});
		btnAdmin.setForeground(new Color(255, 165, 0));
		btnAdmin.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		btnAdmin.setBackground(new Color(255, 250, 205));
		btnAdmin.setBounds(452, 718, 197, 52);
		frmQuizCompetition.getContentPane().add(btnAdmin);
		
		
	}
}
