import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class FinalProject extends Frame implements ActionListener{
Button b1,b2,b3,b4,b5,b6;
Label l1;
TextField t1,t2;

public static void main(String args[]){
    FinalProject calcu = new FinalProject();
    calcu.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent m){ 
            System.exit(0);
        }
    }
 );
 }

FinalProject(){
    setTitle("Calculator");
    setVisible(true);
    setSize(600,500);
    setLayout(null);
    
  b1 = new Button("ADD");
  b1.setBounds(50,250,100,40);
  b1.addActionListener(this);
  add(b1);
    
  b2 = new Button("SUBTRACT");
  b2.setBounds(150,250,100,40);
  b2.addActionListener(this);
  add(b2);
  
  b3 = new Button("MULTIPLY");
  b3.setBounds(250,250,100,40);
  b3.addActionListener(this);
  add(b3);
  
  b4 = new Button("DIVIDE");
  b4.setBounds(350,250,100,40);
  b4.addActionListener(this);
  add(b4);
  
  b5 = new Button("REMAINDER");
  b5.setBounds(450,250,100,40);
  b5.addActionListener(this);
  add(b5);
  
  b6 = new Button("CLEAR");
  b6.setBounds(450,300,100,40);
  b6.addActionListener(this);
  add(b6);
  
  t1 = new TextField("");
  t1.setBounds(50,150,250,30);
  add(t1);
  
  t2 = new TextField("");
  t2.setBounds(300,150,250,30);
  add(t2);
 

  l1=new Label("");
  l1.setBounds(220,200,300,30);
  Font a = new Font("Lucida Console",Font.ITALIC,20);
  l1.setFont(a);
  add(l1); 
} 

  public void actionPerformed(ActionEvent FinalProject){
  if(FinalProject.getSource()==b1){
    int n1 = Integer.parseInt(t1.getText());
    int n2 = Integer.parseInt(t2.getText());
    int sum = n1+n2;
    
        Font m = new Font("Arial",Font.BOLD,20);
        l1.setText("SUM IS "+sum);
        l1.setFont(m);  
        b1.setEnabled(true);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);

  }
  if(FinalProject.getSource()==b2){
  Font s = new Font("Arial",Font.BOLD,20);
    int n1 = Integer.parseInt(t1.getText());
    int n2 = Integer.parseInt(t2.getText());
    int diff = n1-n2;
    
        l1.setText("DIFFERENCE IS "+diff);
        l1.setFont(s);  
        b1.setEnabled(false);
        b2.setEnabled(true);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
  }
  if(FinalProject.getSource()==b3){
  Font r = new Font("Arial",Font.BOLD,20);
    int n1 = Integer.parseInt(t1.getText());
    int n2 = Integer.parseInt(t2.getText());
    int prod = n1*n2;
    
        l1.setText("PRODUCT IS "+prod);
        l1.setFont(r);  
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(true);
        b4.setEnabled(false);
        b5.setEnabled(false);
  }
  if(FinalProject.getSource()==b4){
  Font u = new Font("Lucida Console",Font.BOLD,20);
    int n1 = Integer.parseInt(t1.getText());
    int n2 = Integer.parseInt(t2.getText());
        b2.setEnabled(false);
        b3.setEnabled(false);
    int quo = n1/n2;
    
        l1.setText("QUOTIENT IS "+quo);
        l1.setFont(u);  
        b1.setEnabled(false);
        b4.setEnabled(true);
        b5.setEnabled(false);
  }
  if(FinalProject.getSource()==b5){
  Font z = new Font("Arial",Font.BOLD,20);
    int n1 = Integer.parseInt(t1.getText());
    int n2 = Integer.parseInt(t2.getText());
    int rem = n1%n2;
    
        l1.setText("REMAINDER IS "+rem);
        l1.setFont(z);  
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(true);
  }
  if(FinalProject.getSource()==b6){
      Font z1 = new Font("Arial",Font.BOLD,20);
        t1.setText("");
        t2.setText("");
        l1.setText("");
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
  }
  }
  }