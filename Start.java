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
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frmQuizCompetition;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
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
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCompetition = new JFrame();
		frmQuizCompetition.getContentPane().setBackground(new Color(255, 250, 205));
		frmQuizCompetition.setIconImage(Toolkit.getDefaultToolkit().getImage(Start.class.getResource("/images/student.png")));
		frmQuizCompetition.setTitle("QUIZ COMPETITION");
		frmQuizCompetition.setIconImage(Toolkit.getDefaultToolkit().getImage(EntryPage.class.getResource("/images/student.png")));
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
		lblNewLabel.setIcon(new ImageIcon(Start.class.getResource("/images/quiz.jpj.jpg")));
		lblNewLabel.setBounds(10, 10, 421, 763);
		frmQuizCompetition.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R YOU READY TO FRY YOUR BRAIN..?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1.setFont(new Font("Snap ITC", Font.BOLD, 40));
		lblNewLabel_1.setBounds(453, 31, 1004, 65);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("As you click on \"Start\" button ");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(706, 238, 466, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("your test will start.");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_2_1.setBounds(706, 313, 466, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("All the best..!");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1_1.setBounds(453, 403, 981, 65);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question1.main(null);
				
				
			}
		});
		btnStart.setForeground(new Color(255, 140, 0));
		btnStart.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnStart.setBackground(new Color(255, 250, 205));
		btnStart.setBounds(858, 528, 172, 53);
		frmQuizCompetition.getContentPane().add(btnStart);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmQuizCompetition.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(255, 140, 0));
		btnBack.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnBack.setBackground(new Color(255, 250, 205));
		btnBack.setBounds(1301, 737, 172, 53);
		frmQuizCompetition.getContentPane().add(btnBack);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 140, 0));
		separator_1.setBounds(374, 106, 1124, 33);
		frmQuizCompetition.getContentPane().add(separator_1);
	}
}
