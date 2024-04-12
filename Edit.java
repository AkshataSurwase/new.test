package Package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.ImageIcon;

public class Edit {

	public static int open=0;
	
	
	private JFrame frmQuizCompetition;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit window = new Edit();
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
	public Edit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizCompetition = new JFrame();
		frmQuizCompetition.getContentPane().setBackground(new Color(255, 250, 205));
		frmQuizCompetition.setIconImage(Toolkit.getDefaultToolkit().getImage(Edit.class.getResource("/images/student.png")));
		frmQuizCompetition.setTitle("QUIZ COMPETITION");
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension screenSize =kit.getScreenSize();
		int width= (int)screenSize.width;
		int height= (int)screenSize.height;
		frmQuizCompetition.setSize(width ,height);
		frmQuizCompetition.setLocationRelativeTo(null);
		frmQuizCompetition.getContentPane().setLayout(null);
		
		//frmQuizCompetition.setBounds(100, 100, 450, 300);
		frmQuizCompetition.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setName("Navigation Bar");
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(255, 215, 0));
		menuBar.setToolTipText("");
		menuBar.setMargin(new Insets(3, 2, 5, 2));
		menuBar.setFont(new Font("Segoe Print", Font.BOLD, 17));
		menuBar.setForeground(new Color(0, 0, 0));
		frmQuizCompetition.setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Delete Que");
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				deleteQuestion.main(null);						
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Segoe Print", Font.BOLD, 15));
		mntmNewMenuItem_1.setIcon(new ImageIcon(Edit.class.getResource("/images/delete Question.png")));
		menuBar.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("Update Que");
		mntmNewMenuItem_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
						
				updateQuestion.main(null);				
			}
		});
		mntmNewMenuItem_1_1.setIcon(new ImageIcon(Edit.class.getResource("/images/Update Question.png")));
		mntmNewMenuItem_1_1.setFont(new Font("Segoe Print", Font.BOLD, 15));
		menuBar.add(mntmNewMenuItem_1_1);
		
		JMenuItem mntmNewMenuItem_1_2 = new JMenuItem("All Que");
		mntmNewMenuItem_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				showQuestion.main(null);
			}
		});
		mntmNewMenuItem_1_2.setIcon(new ImageIcon(Edit.class.getResource("/images/all questions.png")));
		mntmNewMenuItem_1_2.setFont(new Font("Segoe Print", Font.BOLD, 15));
		menuBar.add(mntmNewMenuItem_1_2);
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Add Que");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				addNewQuestion.main(null);
				
			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe Print", Font.BOLD, 15));
		mntmNewMenuItem.setIcon(new ImageIcon(Edit.class.getResource("/images/add new question.png")));
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1_3 = new JMenuItem("Result");
		mntmNewMenuItem_1_3.setIcon(new ImageIcon(Edit.class.getResource("/images/search.png")));
		mntmNewMenuItem_1_3.setFont(new Font("Segoe Print", Font.BOLD, 15));
		menuBar.add(mntmNewMenuItem_1_3);
		
		JMenuItem mntmNewMenuItem_1_5 = new JMenuItem("EXIT");
		mntmNewMenuItem_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JFrame jf= new JFrame();
				jf.setAlwaysOnTop(true);
				int a=JOptionPane.showConfirmDialog(jf, "Do you really want to Exit?", "Select", JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					System.exit(0);
				}
				
				
				
			}
		});
		mntmNewMenuItem_1_5.setFont(new Font("Segoe Print", Font.BOLD, 15));
		menuBar.add(mntmNewMenuItem_1_5);
		
		JMenuItem mntmNewMenuItem_1_4 = new JMenuItem("Logout");
		mntmNewMenuItem_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JFrame jf= new JFrame();
				jf.setAlwaysOnTop(true);
				int a=JOptionPane.showConfirmDialog(jf, "Do you really want to Logout", "Select", JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					frmQuizCompetition.setVisible(false);
					new Admin().setVisible(true);
					
				}
				
				
				
			}
		});
		mntmNewMenuItem_1_4.setFont(new Font("Segoe Print", Font.BOLD, 15));
		menuBar.add(mntmNewMenuItem_1_4);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
