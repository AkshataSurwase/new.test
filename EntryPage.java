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
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import com.toedter.calendar.JCalendar;

import Project.ConnectionProvider;
import com.toedter.calendar.JDateChooser;

public class EntryPage {

	private JFrame frmQuizCompetition;
	private JTextField txtPhone;
	private JTextField txtName;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntryPage window = new EntryPage();
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
	public EntryPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCompetition = new JFrame();
		frmQuizCompetition.getContentPane().setBackground(new Color(255, 250, 205));
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
		lblNewLabel.setIcon(new ImageIcon(EntryPage.class.getResource("/images/quiz.jpj.jpg")));
		lblNewLabel.setBounds(10, 10, 414, 751);
		frmQuizCompetition.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phone No.");
		lblNewLabel_1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		
		lblNewLabel_1.setBounds(434, 66, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(434, 184, 96, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Bradley Hand ITC", Font.BOLD, 30));
		lblNewLabel_1_2.setBounds(434, 326, 160, 53);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1_2);
		
		txtPhone = new JTextField();
		txtPhone.setForeground(new Color(255, 165, 0));
		txtPhone.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		txtPhone.setBounds(621, 66, 610, 60);
		frmQuizCompetition.getContentPane().add(txtPhone);
		txtPhone.setColumns(10);
		
		txtName = new JTextField();
		txtName.setForeground(new Color(255, 165, 0));
		txtName.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		txtName.setColumns(10);
		txtName.setBounds(621, 177, 610, 60);
		frmQuizCompetition.getContentPane().add(txtName);
		
		txtEmail = new JTextField();
		txtEmail.setForeground(new Color(255, 165, 0));
		txtEmail.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		txtEmail.setColumns(10);
		txtEmail.setBounds(621, 319, 610, 60);
		frmQuizCompetition.getContentPane().add(txtEmail);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Subject.main(null);
				
			}
		});
		btnNext.setForeground(new Color(255, 140, 0));
		btnNext.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnNext.setBackground(new Color(255, 250, 205));
		btnNext.setBounds(1326, 624, 172, 53);
		frmQuizCompetition.getContentPane().add(btnNext);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 140, 0));
		separator_1.setBounds(434, 503, 1124, 33);
		frmQuizCompetition.getContentPane().add(separator_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				long phoneNo = Long.parseLong(txtPhone.getText());
				String name = txtName.getText();
				String email = txtEmail.getText();
				String marks ="0";
			
				
				
				
				ConnectionProvider db = new ConnectionProvider();
				int status= db.insertStudentData(phoneNo, name, email,marks);
				
				if(status==1) {
					JOptionPane.showMessageDialog(null, "Data updated");
				}else {
					JOptionPane.showMessageDialog(null, "Problem in add data");
				}									
			}
		});
		btnSave.setForeground(new Color(255, 140, 0));
		btnSave.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnSave.setBackground(new Color(255, 250, 205));
		btnSave.setBounds(850, 427, 172, 53);
		frmQuizCompetition.getContentPane().add(btnSave);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(new Color(255, 140, 0));
		btnBack.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnBack.setBackground(new Color(255, 250, 205));
		btnBack.setBounds(1144, 624, 172, 53);
		frmQuizCompetition.getContentPane().add(btnBack);
	}
}
