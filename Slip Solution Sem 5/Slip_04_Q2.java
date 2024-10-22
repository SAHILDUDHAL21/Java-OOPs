import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class loginpage extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;
	public loginpage() 
	{
		super("Login Page");
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		//setResizable();
		
		l1=new JLabel("UserName");
		l2=new JLabel("Password");
		t1=new JTextField(20);
		p1 =new JPasswordField(20);
		b1=new JButton("Submit");
		b2=new JButton("Clear");
		
		add(l1); add(t1); add(l2); add(p1); add(b1); add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			if((t1.getText().equals("om")) && (p1.getText().equals("12345678")))
			{
				JOptionPane.showMessageDialog(null,"login sucess..");
				
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Incorerect Password or username");
			}
		}
		if(e.getSource()==b2)
		{
			t1.setText("");
			p1.setText("");
		}
	}
		
}

public class Slip_04_Q2 
{
	public static void main(String[] args) 
	{
		new loginpage();
	}
}
