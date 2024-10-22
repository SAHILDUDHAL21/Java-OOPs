/* 
 * Q2) Design a screen to handle the Mouse Events such as MOUSE_MOVED
and MOUSE_CLICKED and display the position of the Mouse_Click in a TextField
 */
import java.awt.*;
import java.awt.event.*;
class Slip_08_Q2_awt extends Frame implements MouseListener,MouseMotionListener
{
	TextField t,t1;
	Label l,l1;
	int x,y;
	Panel p;
	Slip_08_Q2_awt()
	{
			super("Sip_08_Q2");
			setLayout(new FlowLayout());
			p=new Panel();
			p.setLayout(new GridLayout(2,2,5,5));
			t=new TextField(20);
			l= new Label("Co-ordinates of mouse clicking");
			l1= new Label("Co-ordinates of mouse movement");
			t1=new TextField(20);
			p.add(l); p.add(t); p.add(l1); p.add(t1); add(p);
			addMouseListener(this);
			addMouseMotionListener(this);
			setSize(500,500);
			setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent me) 
	{
		x=me.getX();
		y=me.getY();
		t.setText("X="+x+" Y="+y);		
	}
	@Override
	public void mouseEntered(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent me) {
		// TODO Auto-generated method sub chutya giri ahe
		
	}
	@Override
	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub 
		
	}
	@Override
	public void mouseReleased(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent me) 
	{
		x=me.getX();
		y=me.getY();
		t1.setText("X="+ x +" Y="+y);
		
	}
}
public class Slip_08_Q2
{

	public static void main(String[] args) 
	{
		new Slip_08_Q2_awt();
	}

}
