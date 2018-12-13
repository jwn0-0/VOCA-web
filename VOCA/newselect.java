package VOCA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

public class newselect extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newselect frame = new newselect();
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
	public newselect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Border thickBorder_gray = new LineBorder(Color.gray,4);
        Border thickBorder_white = new LineBorder(Color.WHITE,4);
        Border thickBorder_black = new LineBorder(Color.BLACK,4);
        
		JButton button = new JButton("");
		button.setContentAreaFilled(false);
		button.setBorder(thickBorder_white);
	    button.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent arg0) {
	               

	            }
	            @Override
	            public void mouseEntered(MouseEvent arg0) {
	            	button.setBorder(thickBorder_black);
	            }
	            @Override
	            public void mouseExited(MouseEvent e) {
	            	button.setBorder(thickBorder_gray);
	            }
	         });
		button.setBounds(764, 312, 302, 78);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(273, 324, 315, 53);
		textField.setBorder(null);
	    textField.setBackground(Color.WHITE);
	    textField.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 30));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img/WWnewselect.png"));
		lblNewLabel.setBounds(0, 0, 1262, 673);
		contentPane.add(lblNewLabel);
	}
}
