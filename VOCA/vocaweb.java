package VOCA;

import java.awt.Container;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.*;
import javax.swing.*;
public class vocaweb extends JFrame {

    public static void main(String[] args) throws IOException {
    
// �ܾ� �������� �о����
FileInputStream input=new FileInputStream("C:\\Java\\input.txt");
int [] randnum=new int[20];
String [] eng= new String[13000];
String [] han= new String[13000];
InputStreamReader reader=new InputStreamReader(input,"UTF-8");
BufferedReader read=new BufferedReader(reader);
for(int i=0; i<13000; i++)
{
	String buf=read.readLine();
	String [] buf2=new String[13000];
	buf2=buf.split("	");
	eng[i]=buf2[0];
	String [] buf3=new String[13000];
	
	buf3=buf.split(",");
	buf3[0]=buf3[0].substring(buf3[0].indexOf("	")+1);
	han[i]=buf3[0];
}
for(int i=0; i<20; i++)
{
  Random ran=new Random();
  randnum[i]=ran.nextInt(13000)+1;
  for(int j=0; j<i; j++)
  {
	  if(randnum[j]==randnum[i])
		  i=i-1;
  }
}
for(int i=0; i<20; i++) {
System.out.println(eng[randnum[i]]+" : "+han[randnum[i]]);
}
//gui


}
}

