import java.awt.*;    
import java.awt.event.*;    

import javax.swing.*;    

public class CardLayoutJava extends JFrame implements ActionListener{    
	CardLayout card;    
	JButton b1,b2,b3,b4;    
	Container c;    
	CardLayoutJava(){    

		c=getContentPane();    
		card=new CardLayout(40,30);   
		c.setLayout(card);
		c.setBackground(Color.green);  

		b1=new JButton("Suman");    
		b2=new JButton("Adhikari");    
		b3=new JButton("Click for last one "); 
		b4=new JButton("This is  the last");    
		b1.addActionListener(this);    
		b2.addActionListener(this);    
		b3.addActionListener(this);
		b4.addActionListener(this);    

		c.add("b1",b1);
		c.add("b2",b2);
		c.add("b3",b3);
		c.add("b4",b4);    

	}    
	public void actionPerformed(ActionEvent e) {    
		card.next(c);    
	}    

	public static void main(String[] args) {    
		CardLayoutJava cardLayoutJava=new CardLayoutJava();    
		cardLayoutJava.setSize(300,300);    
		cardLayoutJava.setVisible(true);       
	}    
}
