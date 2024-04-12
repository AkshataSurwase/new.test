package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Payment {

	private JFrame frmQuizCompetition;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment window = new Payment();
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
	public Payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCompetition = new JFrame();
		frmQuizCompetition.getContentPane().setBackground(new Color(255, 250, 205));
		frmQuizCompetition.setIconImage(Toolkit.getDefaultToolkit().getImage(Payment.class.getResource("/images/student.png")));
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
		
		JLabel lblNewLabel_1 = new JLabel("Kharcha-Pani PLZ...!!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setBounds(443, 30, 981, 65);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(">Make payment and upload the receipt here to start the test.");
		lblNewLabel_1_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1_1.setFont(new Font("Sitka Text", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(453, 109, 1401, 74);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Payment.class.getResource("/images/WhatsApp Image 2024-02-10 at 22.49.53.jpeg")));
		lblNewLabel_2.setBounds(440, 193, 458, 525);
		frmQuizCompetition.getContentPane().add(lblNewLabel_2);
		
		JButton btnNext_2 = new JButton("Next");
		btnNext_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Start.main(null);
			}
		});
		btnNext_2.setForeground(new Color(255, 140, 0));
		btnNext_2.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnNext_2.setBackground(new Color(255, 250, 205));
		btnNext_2.setBounds(1221, 764, 172, 53);
		frmQuizCompetition.getContentPane().add(btnNext_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("make 300Rs. payment on");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(958, 225, 466, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("given Scanner using any UPI app.");
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_2_1.setBounds(980, 275, 503, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_2_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmQuizCompetition.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(255, 140, 0));
		btnBack.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnBack.setBackground(new Color(255, 250, 205));
		btnBack.setBounds(885, 764, 172, 53);
		frmQuizCompetition.getContentPane().add(btnBack);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Payment.class.getResource("/images/quiz.jpj.jpg")));
		lblNewLabel.setBounds(12, 10, 421, 763);
		frmQuizCompetition.getContentPane().add(lblNewLabel);
		
		JButton btnUpload_1 = new JButton("Upload");
		btnUpload_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				JFileChooser file1= new JFileChooser();
				file1.setCurrentDirectory(new File("user.dir"));
				FileNameExtensionFilter filter =new FileNameExtensionFilter("All pics", "png", "jpg", "gif");
				file1.addChoosableFileFilter(filter);
				
				int a= file1.showSaveDialog(null);
				if(a==JFileChooser.APPROVE_OPTION) {
					
					textField.setText(file1.getSelectedFile().getAbsolutePath());
				
			}}
				
				
			
		});
		btnUpload_1.setForeground(new Color(255, 140, 0));
		btnUpload_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnUpload_1.setBackground(new Color(255, 250, 205));
		btnUpload_1.setBounds(1181, 530, 172, 53);
		frmQuizCompetition.getContentPane().add(btnUpload_1);
		
		textField = new JTextField();
		textField.setForeground(new Color(210, 105, 30));
		textField.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(908, 435, 610, 60);
		frmQuizCompetition.getContentPane().add(textField);
	}
}
