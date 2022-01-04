import javax.swing.*;


class CalculatorWithInheritance extends JFrame{
    
    public static void main(String[] args){
        CalculatorWithInheritance  c = new CalculatorWithInheritance();

        JLabel labelForNum1 = new JLabel("Num1");
        labelForNum1.setBounds(30,100,80,30);
        
        JTextField inputForNum1 = new JTextField();
        inputForNum1.setBounds(30,120,80,30);

        JLabel labelForNum2 = new JLabel("Num2");
        labelForNum2.setBounds(30,140,80,30);
             
        JLabel labelForAnswer = new JLabel("Result:");
        labelForAnswer.setBounds(30,250,80,30);
       

        JTextField inputForNum2 = new JTextField();
        inputForNum2.setBounds(30,160,80,30);
        

        JButton add, subtract ,divide ,multiply;

        add = new JButton("Add");
        add.setBounds(30,190,80,30);


        subtract = new JButton("Subtract");
        subtract.setBounds(130,190,80,30);
        


        divide = new JButton("Divide");
        divide.setBounds(230,190,80,30);
        

        multiply= new JButton("Multiply");
        multiply.setBounds(330,190,80,30);
    
        
        c.setSize(900,900);
        c.add(labelForNum1);
        c.add(inputForNum1);
        c.add(labelForNum2);
        c.add(inputForNum2);
        c.add(add);
        c.add(subtract);
        c.add(divide);
        c.add(multiply);

        c.add(labelForAnswer);
        c.setLayout(null);
        c.setVisible(true);
    }
}
