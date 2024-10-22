import javax.swing.*;

class Slip_16_Q2_artw
{
	JMenu File;
	JMenu Edit;
	JMenu About;
	JMenuItem i1, i2, i3, i4, i5;
	Slip_16_Q2_artw()
	{
		JFrame f= new JFrame("Menu and MenuItem Example");
		JMenuBar mb=new JMenuBar();
		File=new JMenu("File");
		Edit=new JMenu("Edit");
		About=new JMenu("About");
		i1=new JMenuItem("New Ctrl+N");
		i2=new JMenuItem("Open");
		i3=new JMenuItem("Save");
		i4=new JMenuItem("Show About");
		i5=new JMenuItem("Exit");
		File.add(i1); File.add(i2);
		File.add(i3);File.addSeparator();File.add(i4);File.addSeparator();File.add(i5);
		mb.add(File);
		mb.add(Edit);
		mb.add(About);
		f.setJMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
public class Slip_16_Q2 
{
	public static void main(String[] args) 
	{
		new Slip_16_Q2_artw();
	}
}
