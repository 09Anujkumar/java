import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Q31 extends Applet implements ActionListener
{
Label l;
TextField t;
Button b;

public void init()
{
	setLayout(new GridLayout(3,3));
	l=new Label();
	t=new TextField();
	b=new Button("Find");
	add(t);
	add(b);
	add(l);
	b.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
	int a=Integer.parseInt(t.getText());
	int f=1;
	for(int i=a;i>1;i--){
		f*=i;
	}
	l.setText("Factorial is "+f);
}
}
/* <APPLET code="Q31.java" width="500" height="500"> </applet>*/