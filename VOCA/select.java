package VOCA;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
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
import javax.swing.JTextField;
import javax.swing.JButton;

public class select extends JFrame {
   public select() {
   }

   private static JPanel contentPane;
   private static JTextField selectvoca;
   private static JTextField textField_1;
   private static JTextField textField_2;
   private static JTextField textField_3;
   private static JButton Button_2;
   private static JButton Button_3;
   private static JButton addbutton;
   private static JButton backbutton;
   private static  JTextField addField;
private static JFrame frame=new JFrame();
   /**
    * Launch the application.
    */
       

   /**
    * Create the frame.
    */
   public static void select2() {
       frame.setVisible(true);
       
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(50, 50, 1280, 720);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      frame.setContentPane(contentPane);
      contentPane.setLayout(null);
      
      Border thickBorder_blue = new LineBorder(Color.CYAN,4);
        Border thickBorder_white = new LineBorder(Color.WHITE,4);
        Border thickBorder_black = new LineBorder(Color.BLACK,4);

      
      selectvoca = new JTextField(gui.answer1);
      selectvoca.setBorder(null);
      selectvoca.setEditable(false);
      selectvoca.setBackground(Color.WHITE);
      selectvoca.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 30));
      selectvoca.setBounds(667, 69, 237, 53);
      contentPane.add(selectvoca);
      selectvoca.setColumns(10);
      
      textField_1 = new JTextField(gui.smallest[0]+" "+gui.smallesth[0]);
      textField_1.setBorder(null);
      textField_1.setEditable(false);
      textField_1.setBackground(Color.WHITE);
      textField_1.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 30));
      textField_1.setColumns(10);
      textField_1.setBounds(667, 200, 300, 53);
      contentPane.add(textField_1);
      
      textField_2 = new JTextField(gui.smallest[1]+" "+gui.smallesth[1]);
      textField_2.setBorder(null);
      textField_2.setEditable(false);
      textField_2.setBackground(Color.WHITE);

      textField_2.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 30));
      textField_2.setColumns(10);
      textField_2.setBounds(667, 342, 300, 53);
      contentPane.add(textField_2);
      
      textField_3 = new JTextField(gui.smallest[2]+" "+gui.smallesth[2]);
      textField_3.setBorder(null);
      textField_3.setEditable(false);
      textField_3.setBackground(Color.WHITE);

      textField_3.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 30));
      textField_3.setColumns(10);
      textField_3.setBounds(667, 475, 300, 53);
      contentPane.add(textField_3);
      
      JButton Button_1 = new JButton("");
      Button_1.setContentAreaFilled(false);
      Button_1.setBorder(thickBorder_white);
      Button_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
               String result = "";
                try {
                   FileWriter bw = new FileWriter("C:\\Java\\vocabook.txt",true);
                     result =gui.smallest[0] + " " +  gui.smallesth[0];
                      System.out.println(result);
                      bw.write(result + "\r\n");
                      bw.flush();
                   
                   bw.close();
                } catch (FileNotFoundException e) {
                   e.printStackTrace();
                } catch (IOException e) {
                   e.printStackTrace();
                }

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
               String result = "";
                try {
                   FileWriter bw = new FileWriter("C:\\Java\\vocabook.txt",true);
                     result =gui.smallest[1] + " " +  gui.smallesth[1];
                      System.out.println(result);
                      bw.write(result + "\r\n");
                      bw.flush();
                   
                   bw.close();
                } catch (FileNotFoundException e) {
                   e.printStackTrace();
                } catch (IOException e) {
                   e.printStackTrace();
                }

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
               String result = "";
                try {
                   FileWriter bw = new FileWriter("C:\\Java\\vocabook.txt",true);
                     result =gui.smallest[2] + " " +  gui.smallesth[2];
                      System.out.println(result);
                      bw.write(result + "\r\n");
                      bw.flush();
                   
                   bw.close();
                } catch (FileNotFoundException e) {
                   e.printStackTrace();
                } catch (IOException e) {
                   e.printStackTrace();
                }

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
         public void mouseClicked(MouseEvent arg0) {
             String result = "";
              try {
                 FileWriter bw = new FileWriter("C:\\Java\\vocabook.txt",true);
                   result =gui.answere + " " +  gui.answerh;
                    System.out.println(result);
                    bw.write(result + "\r\n");
                    bw.flush();
                 
                 bw.close();
              } catch (FileNotFoundException e) {
                 e.printStackTrace();
              } catch (IOException e) {
                 e.printStackTrace();
              }

          }
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
      
      backbutton = new JButton("");
      backbutton.setContentAreaFilled(false);
      backbutton.setBorder(thickBorder_black);
      backbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
               frame.dispose();
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
               backbutton.setBorder(thickBorder_white);
            }
            @Override
            public void mouseExited(MouseEvent e) {
               backbutton.setBorder(thickBorder_black);
            }
         });
      backbutton.setBounds(403, 331, 63, 64);
      backbutton.setBounds(1123, 557, 101, 78);
      contentPane.add(backbutton);
      
      addField = new JTextField(gui.answere + " " +  gui.answerh);
      addField.setBorder(null);
      addField.setEditable(false);
      addField.setBackground(Color.WHITE);
      addField.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 30));
      addField.setBounds(111, 336, 260, 53);
      contentPane.add(addField);
      addField.setColumns(10);
      
      JLabel newlabel = new JLabel("New label");
      newlabel.setIcon(new ImageIcon("img/WWselect2.png"));
      newlabel.setBounds(0, 0, 1262, 673);
      contentPane.add(newlabel);
   }
}