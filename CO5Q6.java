/*Develop a program that has a Choice component which contains the names of shapes such 
as rectangle, triangle, square and circle. Draw the corresponding shapes for given 
parameters as per user’s choice.*/

import java.awt.*;
import java.applet.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Graphics;

public class CO5Q6 extends Applet implements ItemListener 
{
	Choice newchoice;
	int selected;
	
	public void init()
	{
		/*Label newlabel;
		
		newlabel=new Label("hi choose the one you want to try :");
		add(newlabel);*/
		newchoice = new Choice();
		newchoice.addItem("Default");
		newchoice.addItem("Circle");
		newchoice.addItem("Rectangle");
		newchoice.addItem("Traingle");
		newchoice.addItem("Square");
		newchoice.addItemListener(this);
		add(newchoice);
		
	}
	
	public void paint(Graphics g1)
	{
		
		if(selected==0)
		{
		g1.drawString("You Haven't selected Any",270,80);
		
		}
		if(selected==1)
		{
			g1.drawOval(400, 300, 150, 175);
		}
		if(selected==2)
		{
			g1.drawRect(50, 50, 200, 100);
		}
		if(selected==3)
		{
			int[] x = {150, 50, 250};
            int[] y = {50, 150, 150};
            g1.drawPolygon(x,y,3);
		}
		if(selected ==4)
		{
			g1.drawRect(100,100,100,100);
		}
	}
	
	public void itemStateChanged (ItemEvent n1)
	{
		selected= newchoice.getSelectedIndex();
		repaint();
	}
}
