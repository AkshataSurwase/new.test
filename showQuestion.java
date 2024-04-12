package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import Project.ConnectionProvider;

import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class showQuestion {

	private JFrame frmQuizCompetition;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showQuestion window = new showQuestion();
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
	public showQuestion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCompetition = new JFrame();
		frmQuizCompetition.getContentPane().setBackground(new Color(255, 250, 205));
		frmQuizCompetition.setIconImage(Toolkit.getDefaultToolkit().getImage(showQuestion.class.getResource("/images/student.png")));
		frmQuizCompetition.setTitle("QUIZ COMPETITION");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width= (int)screenSize.width;
		int height= (int)screenSize.height;
		frmQuizCompetition.setSize(width ,height);
		frmQuizCompetition.setLocationRelativeTo(null);
		frmQuizCompetition.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(showQuestion.class.getResource("/images/all questions.png")));
		lblNewLabel.setBounds(10, 10, 65, 82);
		frmQuizCompetition.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SHOW ALL QUESTIONS-");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 40));
		lblNewLabel_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setBounds(85, 10, 981, 65);
		frmQuizCompetition.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 140, 0));
		separator_1.setBounds(20, 87, 1124, 33);
		frmQuizCompetition.getContentPane().add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Sitka Small", Font.BOLD, 16));
		scrollPane.setForeground(new Color(255, 127, 80));
		scrollPane.setBounds(30, 130, 1439, 572);
		frmQuizCompetition.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(new Color(240, 230, 140));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "question", "option1", "option2", "option3", "option4", "answer"
			}
		));
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConnectionProvider db = new ConnectionProvider();
				java.sql.ResultSet result = db.getTable();
				
				DefaultTableModel model = new DefaultTableModel();
				String[] columnNames = {"id", "question","option1","option2","option3","option4","answer"};
				model.setColumnIdentifiers(columnNames);
				
				try {
				while(result.next()) {
					model.addRow(new Object[] {
							result.getLong(1),
							result.getString(2),
							result.getString(3),
							result.getString(4),
							result.getString(5),
							result.getString(6),
							result.getString(7),
							
				});
				 
				
			}
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
		table.setModel(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
				
				
			}
		});
		btnPrint.setForeground(new Color(255, 140, 0));
		btnPrint.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnPrint.setBackground(new Color(255, 250, 205));
		btnPrint.setBounds(562, 751, 172, 53);
		frmQuizCompetition.getContentPane().add(btnPrint);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmQuizCompetition.setVisible(false);
			}
		});
		btnExit.setForeground(new Color(255, 140, 0));
		btnExit.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnExit.setBackground(new Color(255, 250, 205));
		btnExit.setBounds(777, 751, 172, 53);
		frmQuizCompetition.getContentPane().add(btnExit);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				End.main(null);
			}
		});
		btnNext.setForeground(new Color(255, 140, 0));
		btnNext.setFont(new Font("Segoe Print", Font.BOLD, 30));
		btnNext.setBackground(new Color(255, 250, 205));
		btnNext.setBounds(1327, 751, 172, 53);
		frmQuizCompetition.getContentPane().add(btnNext);
		
		
		//frmQuizCompetition.setBounds(100, 100, 450, 300);
		frmQuizCompetition.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
