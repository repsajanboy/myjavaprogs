import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class jane extends Frame implements ActionListener
{
 Button b1,b2,b3,b4,b5,b6;
 Label l1;
 TextField t1,t2;
 int num1,num2;
 public static void main(String args[])
{
 jane h = new  jane();
 h.addWindowListener(new WindowAdapter()
{
 public void windowClosing(WindowEvent m)
{ System.exit(0);}});}

 jane()
{
  setTitle("JANE");
  setVisible(true);
  setSize(500,550);
  setLayout(null);
  
  b1 = new Button("*");
  b1.setBounds(100,400,80,40);
  b1.addActionListener(this);
  add(b1);
  
  b2 = new Button("/");
  b2.setBounds(200,400,80,40);
  b2.addActionListener(this);
  add(b2);
  b3 = new Button("+");
  b3.setBounds(300,400,80,40);
  b3.addActionListener(this);
  add(b3);
  b4 = new Button("-");
  b4.setBounds(100,450,80,40);
  b4.addActionListener(this);
  add(b4);
  b5 = new Button("%");
  b5.setBounds(200,450,80,40);
  b5.addActionListener(this);
  add(b5);
  b6 = new Button("Clr");
  b6.setBounds(300,450,80,40);
  b6.addActionListener(this);
  add(b6);
  
  t1=new TextField("");
  t1.setBounds(50,50,300,40);
  add(t1);
  t2=new TextField("");
  t2.setBounds(50,100,300,40);
  add(t2);
  
  l1=new Label("");
  l1.setBounds(50,200,300,150);
  Font a=new Font("Lucida Console",Font.ITALIC,8);
  l1.setFont(a);
  add(l1); 
  } 
  public void actionPerformed(ActionEvent jane)
  {
  if(jane.getSource()==b1)
  {
  num1= Integer.parseInt(t1.getText());
  num2= Integer.parseInt(t2.getText());
  int prod = num1*num2;
  Font m = new Font("Lucida Console",Font.BOLD,35);
  l1.setText(""+prod);
  l1.setFont(m);
  
  b1.setVisible(true);
  b1.setEnabled(true);
  b2.setEnabled(false);
  b3.setEnabled(false);
  b4.setEnabled(false);
  b5.setEnabled(false);
  }
  if(jane.getSource()==b2)
  {
  num1= Integer.parseInt(t1.getText());
  num2= Integer.parseInt(t2.getText());
  int qout = num1/num2;
  Font s = new Font("Lucida Console",Font.BOLD,35);
  l1.setText(""+qout);
  l1.setFont(s);
  //b1.setVisible(false);
b1.setEnabled(false);
  b2.setVisible(true);
  b2.setEnabled(true);
  b3.setEnabled(false);
  b4.setEnabled(false);
  b5.setEnabled(false);
  }
  if(jane.getSource()==b3)
  {
  num1= Integer.parseInt(t1.getText());
  num2= Integer.parseInt(t2.getText());
  int sum = num1+num2;
  Font r = new Font("Lucida Console",Font.BOLD,35);
  l1.setText(""+sum);
  l1.setFont(r);
  b1.setEnabled(false);
  b2.setEnabled(false);
  b3.setVisible(true);
  b3.setEnabled(true);
  b4.setEnabled(false);
  b5.setEnabled(false);
  }
  if(jane.getSource()==b4)
  {
  num1= Integer.parseInt(t1.getText());
  num2= Integer.parseInt(t2.getText());
  int diff = num1-num2;
  Font u = new Font("Lucida Console",Font.BOLD,35);
  l1.setText(""+diff);
  l1.setFont(u);
  b1.setEnabled(false);
  b2.setEnabled(false);
  b3.setEnabled(false);
  b4.setVisible(true);
  b4.setEnabled(true);
  b5.setEnabled(false);

  }
  if(jane.getSource()==b5)
  {
  num1= Integer.parseInt(t1.getText());
  num2= Integer.parseInt(t2.getText());
  int pd = num1%num2;
  Font z = new Font("Lucida Console",Font.BOLD,35);
  l1.setText(""+pd);
  l1.setFont(z);
  b1.setEnabled(false);
  b2.setEnabled(false);
  b3.setEnabled(false);
  b4.setEnabled(false);
  b5.setVisible(true);
  b5.setEnabled(true);
}
if(jane.getSource()==b6)
  {
  Font a = new Font("Lucida Console",Font.BOLD,24);
  t2.setText("");
  t1.setText("");
  l1.setText("");
  b1.setEnabled(true);
  b2.setEnabled(true);
  b3.setEnabled(true);
  b4.setEnabled(true);
  b5.setEnabled(true);
 
  }
  }
  }