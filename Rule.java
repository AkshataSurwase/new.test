package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rule {

	private JFrame frmQuizCompetition;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rule window = new Rule();
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
	public Rule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCompetition = new JFrame();
		frmQuizCompetition.getContentPane().setBackground(new Color(255, 250, 205));
		frmQuizCompetition.setIconImage(Toolkit.getDefaultToolkit().getImage(Rule.class.getResource("/images/student.png")));
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
		lblNewLabel.setIcon(new ImageIcon(Rule.class.getResource("/images/quiz.jpj.jpg")));
		lblNewLabel.setBounds(10, 10, 421, 763);
		frmQuizCompetition.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("READ IT AND MIND IT !!!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1.setFont(new Font("Snap ITC", Font.BOLD, 40));
		lblNewLabel_1.setBounds(476, 21, 1004, 65);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("1. Anyone suspected by an official of cheating will be disqualified.");
		lblNewLabel_1_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(454, 116, 1401, 74);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("2. You must not use any mobile device during a quiz competition.");
		lblNewLabel_1_1_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(454, 210, 1391, 74);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("3. Quiz consist of total 20 questions.");
		lblNewLabel_1_1_1_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblNewLabel_1_1_1_1.setBounds(454, 294, 1391, 74);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("4. The first submitted Quiz only be granted.");
		lblNewLabel_1_1_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblNewLabel_1_1_2.setBounds(454, 385, 1391, 74);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("5. Make payment n upload screenshot to start the test.");
		lblNewLabel_1_1_2_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblNewLabel_1_1_2_1.setBounds(454, 482, 1391, 74);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("6. Y'll get total 20 min to submit the test,after time test will submitted automatically.");
		lblNewLabel_1_1_2_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblNewLabel_1_1_2_2.setBounds(441, 562, 1391, 74);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1_2_2);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Payment.main(null);
			}
		});
		btnNext.setForeground(new Color(255, 140, 0));
		btnNext.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnNext.setBackground(new Color(255, 250, 205));
		btnNext.setBounds(1227, 724, 172, 53);
		frmQuizCompetition.getContentPane().add(btnNext);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmQuizCompetition.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(255, 140, 0));
		btnBack.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnBack.setBackground(new Color(255, 250, 205));
		btnBack.setBounds(920, 724, 172, 53);
		frmQuizCompetition.getContentPane().add(btnBack);
	}
}
