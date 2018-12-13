package VOCA;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


import javax.swing.JButton;

public class main extends JFrame {

   private JPanel contentPane;
   static int check=0;
   private static JFrame frame2 = new JFrame();



 /**
 * Launch the application.
 * @throws IOException 
 * 
 */
   
   
   public static void main(String[] args) throws IOException {
      
      
            try {
               main frame = new main();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      
      
      
      
   

   /**
    * Create the frame.
    */
   public main() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(50, 50, 1280, 720);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      
      
      Border thickBorder_white = new LineBorder(Color.WHITE,4);
      Border thickBorder_pink = new LineBorder(Color.PINK,4);
      
      JButton Search = new JButton("");
      Search.setBounds(664, 296, 237, 65);
      Search.setContentAreaFilled(false);
      Search.setBorder(thickBorder_white);
      Search.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent arg0) {
         }
         @Override
         public void mouseEntered(MouseEvent arg0) {
            Search.setBorder(thickBorder_pink);
         }
         @Override
         public void mouseExited(MouseEvent e) {
            Search.setBorder(thickBorder_white);
         }
      });
      contentPane.add(Search);
      
      JButton vocab = new JButton("");
      vocab.setContentAreaFilled(false);
      vocab.setBorder(thickBorder_white);
      vocab.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent arg0) {
        try {
         vocatest.wow();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
         }
         @Override
         public void mouseEntered(MouseEvent arg0) {
            vocab.setBorder(thickBorder_pink);
         }
         @Override
         public void mouseExited(MouseEvent e) {
            vocab.setBorder(thickBorder_white);
         }
      });
      vocab.setBounds(664, 409, 237, 65);
      contentPane.add(vocab);
      
      JButton test = new JButton("");
      test.setContentAreaFilled(false);
      test.setBorder(thickBorder_white);
      test.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent arg0) {
            EventQueue.invokeLater(new Runnable() {
              public void run() {
                 try {
                     gui.wow();
                 
                  } catch (Exception e) {
                    e.printStackTrace();
                 }
              }
           });
         }
         @Override
         public void mouseEntered(MouseEvent arg0) {
            test.setBorder(thickBorder_pink);
         }
         @Override
         public void mouseExited(MouseEvent e) {
            test.setBorder(thickBorder_white);
         }
      });
      test.setBounds(664, 535, 237, 65);
      contentPane.add(test);
      
      JLabel Label = new JLabel("New label");
      Label.setIcon(new ImageIcon("img/WWmain.PNG"));
      Label.setBounds(0, 0, 1262, 673);
      contentPane.add(Label);
   }
   public static void rrun() throws IOException, InterruptedException {
      gui a=new gui(); 
   }


   
   
    
   

   /**
    * Initialize the contents of the frame.
    * @throws IOException 
    */
   
}