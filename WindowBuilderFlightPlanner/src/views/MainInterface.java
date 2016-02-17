package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class MainInterface extends JFrame {

	private JPanel ctpMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInterface frame = new MainInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainInterface() {
		
		setElements();
		setEvents();
	}
	
	
	private void setElements(){

		setTitle("Flight Planner");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainInterface.class.getResource("/resources/flightToken_128.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnLoad = new JMenu("Load");
		menuBar.add(mnLoad);
		
		JMenuItem mntmLoadNewGraph = new JMenuItem("Load New Graph");
		mnLoad.add(mntmLoadNewGraph);
		
		JMenu mnWalkThrough = new JMenu("Walk Through");
		menuBar.add(mnWalkThrough);
		
		JMenuItem mntmLaunchWalkThrough = new JMenuItem("Launch Walk Through");
		mnWalkThrough.add(mntmLaunchWalkThrough);
		
		
		
	
		ctpMain = new JPanel();
		ctpMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ctpMain);
		GroupLayout gl_ctpMain = new GroupLayout(ctpMain);
		gl_ctpMain.setHorizontalGroup(
			gl_ctpMain.createParallelGroup(Alignment.LEADING)
				.addGap(0, 440, Short.MAX_VALUE)
		);
		gl_ctpMain.setVerticalGroup(
			gl_ctpMain.createParallelGroup(Alignment.LEADING)
				.addGap(0, 290, Short.MAX_VALUE)
		);
		ctpMain.setLayout(gl_ctpMain);
		
		
				
	}
	
	private void setEvents(){
		
	}
}
