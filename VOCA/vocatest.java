package VOCA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
public class vocatest {

 static int check=0;
   private static JPanel contentPane;
   private static JTextField textField= new JTextField();
   public static int press=0;
   public static int che=0;
   public static  String[] smallest=new String[3];
   public static  String[] smallesth=new String[3];
   private static JTextField answerField=new JTextField();
   public static String answer1;
   static JButton submit=new JButton("submit");
   static JFrame frame=new JFrame();
   static String answere="";
   static String answerh="";
   public static  String [] eng= new String[13000];
   public static String [] han= new String[13000];

   /**
    * Launch the application.
 * @throws IOException 
 * @throws InterruptedException 
    */
   
   public static void wow() throws IOException, InterruptedException {
            
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setBounds(50, 50, 1280, 720);
         contentPane = new JPanel();
         contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
         frame.setContentPane(contentPane);
         contentPane.setLayout(null);
         
         Border thickBorder_black = new LineBorder(Color.BLACK,4);
         Border thickBorder_gray = new LineBorder(Color.GRAY,4);
         
         textField.setBorder(null);
         textField.setBackground(Color.WHITE);
         textField.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 24));
         textField.setBounds(136, 313, 275, 60);
         contentPane.add(textField);
         textField.setColumns(10);
         
         answerField = new JTextField();
         answerField.setBorder(null);
         answerField.setForeground(Color.BLACK);
         answerField.setFont(new Font("한컴 바겐세일 M", Font.PLAIN, 24));
         answerField.setBounds(489, 313, 318, 60);
         contentPane.add(answerField);
         answerField.setColumns(10);
         String [] temp=new String[20];
            String [] temph=new String[20];
            FileInputStream input=new FileInputStream("img/vocabook.txt");    
             InputStreamReader reader=new InputStreamReader(input,"euc-kr");
            @SuppressWarnings("resource")
         BufferedReader read=new BufferedReader(reader);
            
            for(int i=0; i<20; i++)
            {
                 String buf=read.readLine();
                 String [] buf2=new String[20];
                 buf2=buf.split(" ");
                 eng[i]=buf2[0];
                 han[i]=buf2[1]; 
            }
            for(int i=0; i<20; i++)
            {
               System.out.println(eng[i]+" : "+han[i]);

            }
            
         JButton okbutton = new JButton("");
         okbutton.setContentAreaFilled(false);
         okbutton.setBorder(thickBorder_gray);
         okbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
               
               answer1=answerField.getText();
               che++;
                textField.setText(han[che]);
              System.out.println("che : "+che);
              System.out.println(answer1);
                 answer1=answerField.getText();
                press=1;
                 System.out.println("adfdadfad");
                 answere=eng[che-1];
                 answerh=han[che-1];
                 
                 if(answer1.equals(eng[che-1]))
                 {
                    System.out.println("Correct!");
                 }
                 
                 else {
                   System.out.println("Wrong");
                      for(int i=0; i<13000; i++) {
                          if(i==0||i==1||i==2)
                          {
                             smallest[i]=voca.eng[i];
                          }
                          else
                          {
                             int temp=edit.getDistance(answer1,voca.eng[i]);
                             if(edit.getDistance(answer1,smallest[0])>temp)
                             {
                                smallest[0]=voca.eng[i];
                                smallesth[0]=voca.han[i];
                             }
                             else if(edit.getDistance(answer1,smallest[1])>temp)
                             {
                                smallest[1]=voca.eng[i];
                                smallesth[1]=voca.han[i];
                                
                             } 
                             else if(edit.getDistance(answer1,smallest[2])>temp)
                             {
                                smallest[2]=voca.eng[i];
                                smallesth[2]=voca.han[i];
                                
                             }
                          }   
                     }       
                       System.out.println(smallest[0]+"\n"+smallest[1]+"\n"+smallest[2]+"\n");
                       select.select2();
                      
                 } 
                 answerField.setText("");
                
            }
            @Override
            public void mouseEntered(MouseEvent arg0) {
               okbutton.setBorder(thickBorder_black);
            }
            @Override
            public void mouseExited(MouseEvent e) {
               okbutton.setBorder(thickBorder_gray);
            }
         });
         okbutton.setBounds(872, 304, 304, 77);
         contentPane.add(okbutton);
         
         JLabel label = new JLabel("");
         label.setIcon(new ImageIcon("img/WWok.png"));
         label.setBounds(0, 0, 1262, 673);
         contentPane.add(label);
         
      
         
         
     submit.addActionListener(new ActionListener() {
             
        public void actionPerformed(ActionEvent e) {
        }  }
     );
     textField.setText(han[che]);
    
     frame.setVisible(true);
       
      
   }
   
      
         
      
   

   /**
    * Create the frame.
    */
   
}
