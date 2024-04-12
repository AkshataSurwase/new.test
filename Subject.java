package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Subject {

	private JFrame frmQuizCometition;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Subject window = new Subject();
					window.frmQuizCometition.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Subject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCometition = new JFrame();
		frmQuizCometition.getContentPane().setBackground(new Color(255, 250, 205));
		frmQuizCometition.setIconImage(Toolkit.getDefaultToolkit().getImage(Subject.class.getResource("/images/student.png")));
		frmQuizCometition.setTitle("QUIZ COMPETITION");
		
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width= (int)screenSize.width;
		int height= (int)screenSize.height;
		frmQuizCometition.setSize(width ,height);
		frmQuizCometition.setLocationRelativeTo(null);
		
		
		//frmQuizCometition.setBounds(100, 100, 450, 300);
		frmQuizCometition.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuizCometition.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Subject.class.getResource("/images/quiz.jpj.jpg")));
		lblNewLabel.setBounds(10, 10, 406, 782);
		frmQuizCometition.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Challenge  your  Knowledge..!");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel_1.setBounds(442, 43, 981, 65);
		frmQuizCometition.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- Choose one subject to start the quiz.");
		lblNewLabel_2.setForeground(new Color(255, 140, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(558, 138, 655, 46);
		frmQuizCometition.getContentPane().add(lblNewLabel_2);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Rule.main(null);
			}
		});
		btnC.setForeground(new Color(255, 255, 255));
		btnC.setBackground(new Color(218, 165, 32));
		btnC.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
		btnC.setBounds(590, 326, 244, 214);
		frmQuizCometition.getContentPane().add(btnC);
		
		JButton btnC1 = new JButton("C++");
		btnC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rule.main(null);
			}
		});
		btnC1.setForeground(Color.WHITE);
		btnC1.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
		btnC1.setBackground(new Color(218, 165, 32));
		btnC1.setBounds(871, 326, 244, 214);
		frmQuizCometition.getContentPane().add(btnC1);
		
		JButton btnJava = new JButton("JAVA");
		btnJava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rule.main(null);
			}
		});
		btnJava.setForeground(Color.WHITE);
		btnJava.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
		btnJava.setBackground(new Color(218, 165, 32));
		btnJava.setBounds(590, 578, 244, 214);
		frmQuizCometition.getContentPane().add(btnJava);
		
		JButton btnPython = new JButton("PYTHON");
		btnPython.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rule.main(null);
			}
		});
		btnPython.setForeground(Color.WHITE);
		btnPython.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
		btnPython.setBackground(new Color(218, 165, 32));
		btnPython.setBounds(871, 578, 244, 214);
		frmQuizCometition.getContentPane().add(btnPython);
	}
}
