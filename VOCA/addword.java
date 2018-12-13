package VOCA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addword extends JFrame {

	private JPanel contentPane;
	private JTextField typetext;
	private JTextField selectvoca;
	   private JTextField textField_1;
	   private JTextField textField_2;
	   private JTextField textField_3;
	   private JButton Button_2;
	   private JButton Button_3;
	   private JButton addbutton;
	   private JButton goback;
	   private JTextField addField;
	   private JButton addnew;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addword frame = new addword();
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
	public addword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Border thickBorder_blue = new LineBorder(Color.CYAN,4);
        Border thickBorder_white = new LineBorder(Color.WHITE,4);
        Border thickBorder_black = new LineBorder(Color.BLACK,4);
      
      selectvoca = new JTextField("Typed Voca");
      selectvoca.setBorder(null);
      selectvoca.setEditable(false);
      selectvoca.setBackground(Color.WHITE);
      selectvoca.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 35));
      selectvoca.setBounds(667, 69, 237, 53);
      contentPane.add(selectvoca);
      selectvoca.setColumns(10);
      
      textField_1 = new JTextField();
      textField_1.setBorder(null);
      textField_1.setEditable(false);
      textField_1.setBackground(Color.WHITE);
      textField_1.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 35));
      textField_1.setColumns(10);
      textField_1.setBounds(667, 200, 237, 53);
      contentPane.add(textField_1);
      
      textField_2 = new JTextField();
      textField_2.setBorder(null);
      textField_2.setEditable(false);
      textField_2.setBackground(Color.WHITE);

      textField_2.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 35));
      textField_2.setColumns(10);
      textField_2.setBounds(667, 342, 237, 53);
      contentPane.add(textField_2);
      
      textField_3 = new JTextField();
      textField_3.setBorder(null);
      textField_3.setEditable(false);
      textField_3.setBackground(Color.WHITE);

      textField_3.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 35));
      textField_3.setColumns(10);
      textField_3.setBounds(667, 475, 237, 53);
      contentPane.add(textField_3);
      
      JButton Button_1 = new JButton("");
      Button_1.setContentAreaFilled(false);
      Button_1.setBorder(thickBorder_white);
      Button_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
           
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
               Button_1.setBorder(thickBorder_blue);
            }
            @Override
            public void mouseExited(MouseEvent e) {
               Button_1.setBorder(thickBorder_white);
            }
         });
      Button_1.setBounds(540, 200, 63, 64);
      contentPane.add(Button_1);
      
      Button_2 = new JButton("");
      Button_2.setContentAreaFilled(false);
      Button_2.setBorder(thickBorder_white);
      Button_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
           
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
               Button_2.setBorder(thickBorder_blue);
            }
            @Override
            public void mouseExited(MouseEvent e) {
               Button_2.setBorder(thickBorder_white);
            }
         });
      Button_2.setBounds(540, 331, 63, 64);
      contentPane.add(Button_2);
      
      Button_3 = new JButton("");
      Button_3.setContentAreaFilled(false);
      Button_3.setBorder(thickBorder_white);
      Button_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
           
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
               Button_3.setBorder(thickBorder_blue);
            }
            @Override
            public void mouseExited(MouseEvent e) {
               Button_3.setBorder(thickBorder_white);
            }
         });
      Button_3.setBounds(540, 472, 63, 64);
      contentPane.add(Button_3);
      
      addbutton = new JButton("");
      addbutton.setContentAreaFilled(false);
      //addbutton.setBorder(thickBorder_black);
      addbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
           
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
               addbutton.setBorder(thickBorder_black);
            }
            @Override
            public void mouseExited(MouseEvent e) {
               addbutton.setBorder(thickBorder_white);
            }
         });
      addbutton.setBounds(399, 328, 69, 68);
      contentPane.add(addbutton);
      
      goback = new JButton("");
      goback.setContentAreaFilled(false);
      goback.setBorder(thickBorder_black);
      goback.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
           
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
               goback.setBorder(thickBorder_white);
            }
            @Override
            public void mouseExited(MouseEvent e) {
               goback.setBorder(thickBorder_black);
            }
         });
      goback.setBounds(403, 331, 63, 64);
      goback.setBounds(1123, 557, 101, 78);
      contentPane.add(goback);
      
      addField = new JTextField();
      addField.setBorder(null);
      addField.setEditable(false);
      addField.setBackground(Color.WHITE);
      addField.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 35));
      addField.setBounds(111, 336, 260, 53);
      contentPane.add(addField);
      addField.setColumns(10);
      
      typetext = new JTextField();
      typetext.setBorder(null);
      typetext.setBackground(Color.WHITE);
      typetext.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 35));
      typetext.setBounds(112, 505, 259, 56);
      contentPane.add(typetext);
      typetext.setColumns(10);
      
      addnew = new JButton("");
      addnew.setContentAreaFilled(false);
      //addbutton.setBorder(thickBorder_black);
      addnew.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
           
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
            	addnew.setBorder(thickBorder_black);
            }
            @Override
            public void mouseExited(MouseEvent e) {
            	addnew.setBorder(thickBorder_white);
            }
         });
      addnew.setBounds(399, 499, 69, 69);
      contentPane.add(addnew);
      
      JLabel newlabel = new JLabel("New label");
      newlabel.setIcon(new ImageIcon("img/WWaddword.png"));
      newlabel.setBounds(0, 0, 1262, 673);
      contentPane.add(newlabel);
   }
}
