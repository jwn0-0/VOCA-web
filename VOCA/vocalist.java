package VOCA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

public class vocalist extends JFrame {

	private JPanel contentPane;
	private JTextField lefttext;
	private JTextField righttext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vocalist frame = new vocalist();
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
	public vocalist() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Border thickBorder_white = new LineBorder(Color.WHITE,4);
		Border thickBorder_pink = new LineBorder(Color.PINK,4);
		
		JButton right = new JButton("");
		right.setBorder(thickBorder_white);
		right.setContentAreaFilled(false);
		right.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				right.setBorder(thickBorder_pink);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				right.setBorder(thickBorder_white);
			}
		});
		right.setBounds(1064, 590, 163, 71);
		contentPane.add(right);
		
		lefttext = new JTextField();
		lefttext.setBorder(null);
		lefttext.setBounds(124, 63, 421, 498);
		contentPane.add(lefttext);
		lefttext.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 30));
		lefttext.setColumns(10);
		
		righttext = new JTextField();
		righttext.setBorder(null);
		righttext.setColumns(10);
		righttext.setBounds(737, 63, 421, 498);
		contentPane.add(righttext);
		righttext.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 30));
		
		JLabel Label = new JLabel("");
		Label.setIcon(new ImageIcon("img/WWvocabtest.png"));
		Label.setBounds(0, -12, 1262, 685);
		contentPane.add(Label);
	}
}
