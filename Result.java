package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Result {

	private JFrame frmQuizCompetition;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result window = new Result();
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
	public Result() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCompetition = new JFrame();
		frmQuizCompetition.getContentPane().setBackground(new Color(255, 250, 205));
		frmQuizCompetition.setIconImage(Toolkit.getDefaultToolkit().getImage(Result.class.getResource("/images/student.png")));
		frmQuizCompetition.setTitle("QUIZ COMPETITION");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width= (int)screenSize.width;
		int height= (int)screenSize.height;
		frmQuizCompetition.setSize(width ,height);
		frmQuizCompetition.setLocationRelativeTo(null);
		
		
		//frmQuizCompetition.setBounds(100, 100, 450, 300);
		frmQuizCompetition.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuizCompetition.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Result.class.getResource("/images/quiz.jpj.jpg")));
		lblNewLabel.setBounds(10, 10, 406, 782);
		frmQuizCompetition.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Check your score..!!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setBounds(492, 21, 981, 65);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Phone No.");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(492, 220, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 165, 0));
		textField.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		textField.setColumns(10);
		textField.setBounds(762, 213, 610, 60);
		frmQuizCompetition.getContentPane().add(textField);
		
		JButton btnShow = new JButton("Show");
		btnShow.setForeground(new Color(255, 140, 0));
		btnShow.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnShow.setBackground(new Color(255, 250, 205));
		btnShow.setBounds(975, 348, 172, 53);
		frmQuizCompetition.getContentPane().add(btnShow);
		
		JButton btnExit_1 = new JButton("Next");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				End.main(null);
			}
		});
		btnExit_1.setForeground(new Color(255, 140, 0));
		btnExit_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnExit_1.setBackground(new Color(255, 250, 205));
		btnExit_1.setBounds(1298, 719, 172, 53);
		frmQuizCompetition.getContentPane().add(btnExit_1);
	}
}
