/*Find the percentage of marks obtained by a student in 5 subjects. Display a happy face if 
he secures above 50% or a sad face if otherwise. */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CO5Q3 extends Applet implements ActionListener {
    TextField tb1,tb2,tb3,tb4,tb5,tb6;
    Button newbutton;
    public void init(){
		//Color color1 = new Color (244, 224, 172);
        //setBackground (color1);
        tb1 = new TextField(10);
        tb2 = new TextField(10);
        tb3 = new TextField(10);
        tb4 = new TextField(10);
        tb5 = new TextField(10);
        tb6 = new TextField(15);
        newbutton = new Button(" final score ");
        newbutton.setBounds(50,250,90,30);		
        add(tb1);
        add(tb2);
        add(tb3);
        add(tb4);
        add(tb5);
        add(tb6);
        add(newbutton);
        newbutton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        int mark1, mark2,mark3, mark4,mark5,percent;
        mark1= Integer.parseInt(tb1.getText());
        mark2= Integer.parseInt(tb2.getText());
        mark3= Integer.parseInt(tb3.getText());
        mark4= Integer.parseInt(tb4.getText());
        mark5= Integer.parseInt(tb5.getText());
        percent=((mark1+mark2+mark3+mark4+mark5)*100)/500;
        tb6.setText(String.valueOf(percent));
        repaint();
        }
    public void paint(Graphics g){
        int demopercent;
        demopercent = Integer.parseInt(tb6.getText());
        if(demopercent > 50.0) {
            g.drawOval(10,40,200,200);
			g.drawOval(50,100,40,20);
			g.drawOval(130,100,40,20);
            g.drawArc(95,150,50,20,200,150); 
        }
        else {
            g.drawOval(10,40,200,200);
			g.drawOval(50,100,40,20);
			g.drawOval(130,100,40,20);
            g.drawArc(95,150,50,20,15,150); 
        }
    }
}
