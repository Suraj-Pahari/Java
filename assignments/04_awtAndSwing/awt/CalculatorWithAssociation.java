import java.awt.Button;
import java.awt.TextField;
import java.awt.*;

class CalculatorWithAssociation{

    public static void main(String[] args){
        
        Frame frame = new Frame("Simple calculator");
        Label labelForNum1 = new Label("Num1");
        labelForNum1.setBounds(30,100,80,30);
        
        TextField inputForNum1 = new TextField();
        inputForNum1.setBounds(30,120,80,30);

        Label labelForNum2 = new Label("Num2");
        labelForNum2.setBounds(30,100,80,30);
             
        Label labelForAnswer = new Label("Result:");
        labelForAnswer.setBounds(30,250,80,30);
       

        TextField inputForNum2 = new TextField();
        inputForNum2.setBounds(30,160,80,30);
        

        Button add, subtract ,divide ,multiply;

        add = new Button("Add");
        add.setBounds(30,190,80,30);


        subtract = new Button("Subtract");
        subtract.setBounds(130,190,80,30);
        


        divide = new Button("Divide");
        divide.setBounds(230,190,80,30);
        

        multiply= new Button("Multiply");
        multiply.setBounds(330,190,80,30);
    
        
        frame.setSize(900,900);
        frame.add(labelForNum1);
        frame.add(inputForNum1);
        frame.add(labelForNum2);
        frame.add(inputForNum2);
        frame.add(add);
        frame.add(subtract);
        frame.add(divide);
        frame.add(multiply);

        frame.add(labelForAnswer);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}