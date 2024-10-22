/*
 * Write a program that creates a user interface to perform integer divisions. The user enters two
numbers in the text fields, Number1 and Number2. The division of Number1 and Number2 is
displayed in the Result field when the Divide button is clicked. If Number1 or Number2 were
not an integer, the program would throw a NumberFormatException. If Number2 were Zero,
the program would throw an Arithmetic Exception Display the exception in a message
dialog box.
 */



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip_30_Q2 extends JFrame implements ActionListener
{
    JButton btn1;
    JTextField t1, t2;
    JLabel l1, l2, resultLabel;

    Slip_30_Q2()
    {
        l1 = new JLabel("Enter First number:");
        t1 = new JTextField(10);
        l2 = new JLabel("Enter Second number:");
        t2 = new JTextField(10);
        btn1 = new JButton("Divide");
        resultLabel = new JLabel("Result: ");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(btn1);
        add(resultLabel);

        setLayout(new FlowLayout());
        btn1.addActionListener(this);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            int v1 = Integer.parseInt(t1.getText());
            int v2 = Integer.parseInt(t2.getText());
            int ans = v1 / v2;
            resultLabel.setText("Result: " + ans);
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Enter valid integers!", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (ArithmeticException e)
        {
            JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args)
    {
        new Slip_30_Q2();
    }
}