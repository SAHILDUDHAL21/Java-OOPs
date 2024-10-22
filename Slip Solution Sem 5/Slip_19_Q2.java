/*
 * Q2) Write a program which shows the combo box which includes list of T.Y.B.Sc.(Comp. Sci)
subjects. Display the selected subject in a text field.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ComboBoxExample extends JFrame implements ActionListener
{
	JTextField t1;
	JLabel l1;
	JComboBox cb;
	ComboBoxExample()
	{
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);
		l1=new JLabel("Languages");
		t1=new JTextField(50);
		JButton b=new JButton("Show");
		String languages[]={"C","C++","C#","Java","PHP"};
		cb=new JComboBox(languages);
		this.add(cb); this.add(l1); this.add(b);this.add(t1);
		b.addActionListener(this);
	
	}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		String data = "Programming language Selected: " + cb.getSelectedItem();
		t1.setText(data);
	}
}

public class Slip_19_Q2 
{
	public static void main(String[] args) 
	{
		new ComboBoxExample();
	}
}
