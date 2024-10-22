/*
 * Write a java program that works as a simple calculator. Use a grid layout to arrange buttons for
the digits and for the +, -, *, % operations. Add a text field to display the result.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Slip12 extends JFrame implements ActionListener
{
	int v1,v2,result;
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	JButton add,sub,mul,div,clear,equals;
	char choice;
	JPanel p,p1;
	
	Slip12()
	{
		setLayout(new BorderLayout());
		p =new JPanel();
		t=new JTextField(20);
		p.add(t);
		p1=new JPanel();
		p1.setLayout(new GridLayout(4,5));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250,300);
		
		b1=new JButton(""+1);
		b2=new JButton(""+2);
		b3=new JButton(""+3);
		b4=new JButton(""+4);
		b5=new JButton(""+5);
		b6=new JButton(""+6);
		b7=new JButton(""+7);
		b8=new JButton(""+8);
		b9=new JButton(""+9);
		b0=new JButton(""+0);
		
		equals=new JButton("=");
		add=new JButton("+");
		sub=new JButton("-");
		mul=new JButton("*");
		div=new JButton("/");
		clear=new JButton("C");
		
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		p1.add(div);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(mul);
		p1.add(b3);
		p1.add(b2);
		p1.add(b1);
		p1.add(add);
		p1.add(sub);
		p1.add(b0);
		p1.add(clear);
		p1.add(equals);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);
		equals.addActionListener(this);
		add(p,BorderLayout.NORTH);
		add(p1);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		String str = ae.getActionCommand();
		char ch = str.charAt(0);
		if (Character.isDigit(ch))
			t.setText(t.getText()+str);
		else
		if(str.equals("+"))
		{
			v1=Integer.parseInt(t.getText());
			choice='+';
			t.setText("");
		}
		else if(str.equals("-"))
		{
			v1=Integer.parseInt(t.getText());
			choice='-';
			t.setText("");
		}
		else if(str.equals("*"))
		{
			v1=Integer.parseInt(t.getText());
			choice='*';
			t.setText("");
		}
		else if(str.equals("/"))
		{
			v1=Integer.parseInt(t.getText());
			choice='/';
			t.setText("");
		}
		if(str.equals("="))
		{
			v2=Integer.parseInt(t.getText());
			if(choice=='+')
			result=v1+v2;
			else if(choice=='-')
			result=v1-v2;
			else if(choice=='*')
			result=v1*v2;
			else if(choice=='/')
			result=v1/v2;
			t.setText(""+result);
		}
		if(str.equals("C"))
		{
			t.setText("");
		}
	}
}

public class Slip_12_Q2 
{

	public static void main(String[] args) 
	{
		new Slip12();
	}

}
