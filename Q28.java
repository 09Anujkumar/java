import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class anujk6 extends Applet implements MouseListener
{
	Button b;
	
	public void init() 
	{
		b=new Button("this is my button");
		b.setFont(new Font("Arial",Font.BOLD,30));
		add(b);
		b.addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent e)
	{
		b.setBackground(Color.YELLOW);
	}

	public void mouseEntered(MouseEvent e)
	 {
		setBackground(Color.RED);
	}
	
	public void mouseExited(MouseEvent e)
	 {
		setBackground(Color.BLUE);
	}

	public void mousePressed(MouseEvent e)
	 {
b.setLabel("pressed");
}

	public void mouseReleased(MouseEvent e){
b.setLabel("released");	 
}}
/*<applet code="anujk6.java" width="500" height="500"></applet>*/
