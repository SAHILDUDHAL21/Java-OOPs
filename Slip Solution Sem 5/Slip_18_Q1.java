/*
 * Q1) Write a program to implement Border Layout Manager.
 */
import java.awt.*;
import javax.swing.*;
@SuppressWarnings("serial")
class Slip18 extends JFrame
{
	

	Slip18()
	{
		JButton b1=new JButton("North");
		JButton b2=new JButton("South");
		JButton b3=new JButton("East");
		JButton b4=new JButton("West");
		JButton b5=new JButton("Center");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.SOUTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
	}
}


public class Slip_18_Q1 
{

	public static void main(String[] args) 
	{
		 new Slip18();
	}

}
