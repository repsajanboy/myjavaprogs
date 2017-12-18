/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jantoks;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class ProjectX extends Frame implements ActionListener
{
Button b1, b2, b3, b4;
Label l1, l2, l3,l4,l5,l6,l7,l8,l9,l10;
TextField t1, t2, t3, t4, t5,t6,t7,t8,t9,t10;
public static void main(String args[])
{
 ProjectX h = new  ProjectX();
 h.addWindowListener(new WindowAdapter()
{
 public void windowClosing(WindowEvent m)
{ System.exit(0);}});}

ProjectX()
{
  setTitle("ProjectX");
  setVisible(true);
  setSize(800,500);
  setLayout(null);

b1 = new Button("0-999");
  b1.setBounds(200,100,100,50);
  Font bb1=new Font("AR DESTINE",Font.ITALIC,8);
  b1.setFont(bb1);
  b1.addActionListener(this);
  add(b1);
b2 = new Button("999-0");
  b2.setBounds(300,100,100,50);
Font bb2=new Font("AR DESTINE",Font.ITALIC,8);
  b2.setFont(bb2);
  b2.addActionListener(this);
  add(b2);
b3 = new Button("Random");
  b3.setBounds(400,100,100,50);
Font bb3=new Font("AR DESTINE",Font.ITALIC,8);
  b3.setFont(bb3);
  b3.addActionListener(this);
  add(b3);
b4 = new Button("Clr");
  b4.setBounds(500,100,100,50);
Font bb4=new Font("AR DESTINE",Font.ITALIC,8);
  b4.setFont(bb4);
  b4.addActionListener(this);
  add(b4);

t1=new TextField("");
  t1.setBounds(200,200,50,40);
  add(t1);
t2=new TextField("");
  t2.setBounds(300,200,50,40);
  add(t2);
t3=new TextField("");
  t3.setBounds(400,200,50,40);
  add(t3);
t4=new TextField("");
  t4.setBounds(500,200,50,40);
  add(t4);
t5=new TextField("");
  t5.setBounds(600,200,50,40);
  add(t5);
t6=new TextField("");
  t6.setBounds(200,300,50,40);
  add(t6);
t7=new TextField("");
  t7.setBounds(300,300,50,40);
  add(t7);
t8=new TextField("");
  t8.setBounds(400,300,50,40);
  add(t8);
t9=new TextField("");
  t9.setBounds(500,300,50,40);
  add(t9);
t10=new TextField("");
  t10.setBounds(600,300,50,40);
  add(t10);
  
l1=new Label("");
  l1.setBounds(50,200,300,150);
  Font a=new Font("Lucida Console",Font.ITALIC,8);
  l1.setFont(a);
  add(l1); 
l2=new Label("");
  l2.setBounds(50,200,300,150);
  Font b=new Font("Lucida Console",Font.ITALIC,8);
  l2.setFont(b);
  add(l2); 
l3=new Label("");
  l3.setBounds(50,200,300,150);
  Font c=new Font("Lucida Console",Font.ITALIC,8);
  l3.setFont(c);
  add(l3); 
l4=new Label("");
  l4.setBounds(50,200,300,150);
  Font d=new Font("Lucida Console",Font.ITALIC,8);
  l4.setFont(d);
  add(l4); 
l5=new Label("");
  l5.setBounds(50,200,300,150);
  Font e=new Font("Lucida Console",Font.ITALIC,8);
  l5.setFont(e);
  add(l5); 
l6=new Label("");
  l6.setBounds(50,200,300,150);
  Font f=new Font("Lucida Console",Font.ITALIC,8);
  l6.setFont(f);
  add(l6); 
l7=new Label("");
  l7.setBounds(50,200,300,150);
  Font g=new Font("Lucida Console",Font.ITALIC,8);
  l7.setFont(g);
  add(l7); 
l8=new Label("");
  l8.setBounds(50,200,300,150);
  Font h=new Font("Lucida Console",Font.ITALIC,8);
  l8.setFont(h);
  add(l8); 
l9=new Label("");
  l9.setBounds(50,200,300,150);
  Font i=new Font("Lucida Console",Font.ITALIC,8);
  l9.setFont(i);
  add(l9); 
l10=new Label("");
  l10.setBounds(50,200,300,150);
  Font j=new Font("Lucida Console",Font.ITALIC,8);
  l10.setFont(j);
  add(l10);
 } 
  public void actionPerformed(ActionEvent ProjectX)
{
if(ProjectX.getSource()==b1)
{
 Font a = new Font("AR DESTINE",Font.BOLD,35);
  l1.setText("");
  l1.setFont(a);
  b1.setVisible(true);
  b1.setEnabled(true);
  b2.setEnabled(true);
  b3.setEnabled(true);
  b4.setEnabled(true);
}
 if(ProjectX.getSource()==b2)
{
Font b = new Font("AR DESTINE",Font.BOLD,35);
  l2.setText("");
  l2.setFont(b);
  b1.setVisible(true);
  b1.setEnabled(true);
  b2.setEnabled(true);
  b3.setEnabled(true);
  b4.setEnabled(true);
}
if(ProjectX.getSource()==b3)
{
Font c = new Font("AR DESTINE",Font.BOLD,35);
  l3.setText("");
  l3.setFont(c);
  b1.setVisible(true);
  b1.setEnabled(true);
  b2.setEnabled(true);
  b3.setEnabled(true);
  b4.setEnabled(true);
}
if(ProjectX.getSource()==b4)
{
Font d = new Font("AR DESTINE",Font.BOLD,35);
  l4.setText("");
  l4.setFont(d);
  b1.setVisible(true);
  b1.setEnabled(true);
  b2.setEnabled(true);
  b3.setEnabled(true);
  b4.setEnabled(true);
}
}
}