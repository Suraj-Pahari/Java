import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;    
import javax.swing.JFrame;
import javax.swing.JButton;    
    
public class CardLayoutDemo extends JFrame implements ActionListener{    

CardLayout cards;    
JButton b1,b2,b3,b4,b5,b6,b7;    
Container dayCard;    

    CardLayoutDemo(){    
            
        dayCard=getContentPane();    
        cards=new CardLayout(50,50);   
        dayCard.setLayout(cards);    
        
            
        b1 = new JButton("Sunday");    
        b2 =  new JButton("Monday");    
        b3 = new JButton("Tueday");    
        b4 = new JButton("Wednesday");    
        b5 = new JButton("Thursday");    
        b6 = new JButton("Friday");   
        b7 = new JButton("Saturday");     



        
        b1.addActionListener(this);    
        b2.addActionListener(this);    
        b3.addActionListener(this);    
        b4.addActionListener(this);    
        b5.addActionListener(this);    
        b6.addActionListener(this);
        b7.addActionListener(this);    
                 
        dayCard.add("a",b1);dayCard.add("b",b2);dayCard.add("c",b3);dayCard.add("d",b4);
        dayCard.add("e",b5);dayCard.add("f",b6);dayCard.add("g",b7);    
                            
    }    

    public void actionPerformed(ActionEvent e) {    
    
    cards.next(dayCard);    
    
    }    
    
    public static void main(String[] args) {    
    
        CardLayoutDemo cl=new CardLayoutDemo();    
        cl.setSize(400,400);    
        cl.setVisible(true);    
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);    
    
    }    
}    