import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Monterey8 extends Frame implements ActionListener {
	public static void main(String args[]){
		
		Monterey8 calcu = new Monterey8();
		 calcu.addWindowListener(new WindowAdapter(){
		        public void windowClosing(WindowEvent m){ 
		            System.exit(0);
		        }
		    }
		 );
	}
	private JFrame frame;
	private JTextField num1, num2, operation;
	private JLabel ResultLabel;
	private JButton plus, minus, divide, multiply, one, two, three,
					four, five, six, seven, eight, nine, zero, dot,
					equals, clear, mem1, mem2, percent;
	
	Monterey8(){
		
		num1 = new JTextField (10);
		operation = new JTextField(10);
		num2 = new JTextField(10);
		
		JPanel centerPanel = new JPanel(new GridLayout(5,4,3,3));
		plus = new JButton("+");
		plus.addActionListener(this);
		centerPanel.add(plus);
		minus = new JButton("-");
		minus.addActionListener(this);
		centerPanel.add(minus);
		multiply = new JButton("*");
		multiply.addActionListener(this);
		centerPanel.add(multiply);
		divide = new JButton("/");
		divide.addActionListener(this);
		centerPanel.add(divide);
		seven = new JButton("7");
		seven.addActionListener(this);
		centerPanel.add(seven);
		eight = new JButton("8");
		eight.addActionListener(this);
		centerPanel.add(eight);
		nine = new JButton("9");
		nine.addActionListener(this);
		centerPanel.add(nine);
		equals = new JButton("=");
		equals.addActionListener(this);
		centerPanel.add(equals);
		four = new JButton("4");
		four.addActionListener(this);
		centerPanel.add(four);
		five = new JButton("5");
		five.addActionListener(this);
		centerPanel.add(five);
		six = new JButton("6");
		six.addActionListener(this);
		centerPanel.add(six);
		clear = new JButton("c");
		clear.addActionListener(this);
		centerPanel.add(clear);
		one = new JButton("1");
		one.addActionListener(this);
		centerPanel.add(one);
		two = new JButton("2");
		two.addActionListener(this);
		centerPanel.add(two);
		three = new JButton("3");
		three.addActionListener(this);
		centerPanel.add(three);
		mem1 = new JButton("m+");
		mem1.addActionListener(this);
		centerPanel.add(mem1);
		dot = new JButton(".");
		dot.addActionListener(this);
		centerPanel.add(dot);
		zero = new JButton("0");
		zero.addActionListener(this);
		centerPanel.add(zero);
		percent = new JButton("%");
		percent.addActionListener(this);
		centerPanel.add(percent);
		mem2 = new JButton("m-");
		mem2.addActionListener(this);
		centerPanel.add(mem2);
		
		JPanel north = new JPanel (new GridLayout(1,2));
		north.add(num1);
		north.add(operation);
		north.add(num2);
		
		frame = new JFrame("Calculator");
		frame.setSize(350, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(north, BorderLayout.NORTH);
		frame.add(centerPanel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		if(Monterey8.getSource==plus) {
			double n1 = Double.parseDouble(num1.getText());
			double n2 = Double.parseDouble(num2.getText());
			double sum = n1 + n2;
		}
		if(Monterey8.getSource==minus) {
			double n1 = Double.parseDouble(num1.getText());
			double n2 = Double.parseDouble(num2.getText());
			double difference = n1 - n2;
		}
		if(Monterey8.getSource==minus) {
			double n1 = Double.parseDouble(num1.getText());
			double n2 = Double.parseDouble(num2.getText());
			double difference = n1 - n2;
		}
		if(Monterey8.getSource==seven) {
			num1.setText("7");
		}
	}

}
