import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class micah extends Frame implements ActionListener
{
 Button b1,b2,b3,b4,b5;
 Label l1,l2;
 TextField t1;
 public static void main(String args[])
{
 micah h = new  micah();
 h.addWindowListener(new WindowAdapter()
{
 public void windowClosing(WindowEvent m)
{ System.exit(0);}});}

 micah()
{
  setTitle("micah");
  setVisible(true);
  setSize(300,350);
  setLayout(null);
  
  b1 = new Button("Font = 8");
  b1.setBounds(200,50,60,20);
  b1.addActionListener(this);
  add(b1);
  
  b2 = new Button("Font = 12");
  b2.setBounds(200,100,60,20);
  b2.addActionListener(this);
  add(b2);
  b3 = new Button("Font = 16");
  b3.setBounds(200,150,60,20);
  b3.addActionListener(this);
  add(b3);
  b4 = new Button("Font = 20");
  b4.setBounds(200,200,60,20);
  b4.addActionListener(this);
  add(b4);
  b5 = new Button("Font = 24");
  b5.setBounds(200,250,60,20);
  b5.addActionListener(this);
  add(b5);
  
  t1=new TextField("");
  t1.setBounds(30,50,150,20);
  add(t1);
  l2 = new Label("Munggo!!");
  l2.setBounds(10,140,500,40);
  Font qw=new Font("Lucida Console",Font.BOLD,15);
  l2.setFont(qw);
  l2.setVisible(false);
  add(l2); 

  l1=new Label("");
  l1.setBounds(120,100,120,30);
  Font a=new Font("Lucida Console",Font.ITALIC,8);
  l1.setFont(a);
  add(l1); 
  } 
  public void actionPerformed(ActionEvent micah)
  {
  if(micah.getSource()==b1)
  {
  Font m = new Font("Lucida Console",Font.BOLD,8);
  l1.setText(t1.getText());
  l1.setFont(m);
  b1.setVisible(true);
  }
  if(micah.getSource()==b2)
  {
  Font s = new Font("Lucida Console",Font.BOLD,12);
  l1.setText(t1.getText());
  l1.setFont(s);
  //b1.setVisible(false);
b1.setEnabled(false);
  b2.setVisible(true);
  }
  if(micah.getSource()==b3)
  {
  Font r = new Font("Lucida Console",Font.BOLD,16);
  l1.setText(t1.getText());
  l1.setFont(r);
  b1.setVisible(false);
  b2.setVisible(false);
  b3.setVisible(true);
  }
  if(micah.getSource()==b4)
  {
  Font u = new Font("Lucida Console",Font.BOLD,20);
  l1.setText(t1.getText());
  l1.setFont(u);
  b1.setVisible(false);
  b2.setVisible(false);
  b3.setVisible(false);
  b4.setVisible(true);
  }
  if(micah.getSource()==b5)
  {
  Font z = new Font("Lucida Console",Font.BOLD,24);
  l1.setText(t1.getText());
  l1.setFont(z);
  b1.setVisible(false);
  b2.setVisible(false);
  b3.setVisible(false);
  b4.setVisible(false);
  b5.setVisible(false);
  l2.setVisible(true);
  }
  }
  }
  
