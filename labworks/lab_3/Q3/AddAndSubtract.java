import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.NumberFormatException;
 
class AddAndSubtract extends Frame  implements ActionListener{

    TextField forInput1, forInput2, forResult;
    Label inputLabel1,inputLabel2,outputLabel;
    Button add,subtract;
    AddAndSubtract(){
    
        super("checkodd or even");
        forInput1 = new TextField();
        forInput2 = new TextField();
        forResult= new TextField();
        add = new Button("+");
        subtract = new Button("-");
        inputLabel1 = new Label("Enter the number1:");
        inputLabel2 = new Label("Enter the number2:");        
        outputLabel = new Label("Result:");
    
    }
    
    void placeComponenet(){
    
        inputLabel1.setBounds(10,20,200,50);
        add(inputLabel1);
        
        forInput1.setBounds(10,80,200,50);
        add(forInput1);

        inputLabel2.setBounds(10,130,200,50);
        add(inputLabel2);

        forInput2.setBounds(10,190,200,50);
        add(forInput2); 

        add.addActionListener(this);
        add.setBounds(10,240, 50,50);
        add(add);

        subtract.addActionListener(this);
        subtract.setBounds(70,240, 50,50);
        add(subtract);

        outputLabel.setBounds(10,300,100,50);
        add(outputLabel);

        forResult.setBounds(10,360,200,100);
        add(forResult);
        
       

    }

    void display(){

        placeComponenet();
        setSize(500,600);
        setLayout(null);
        setVisible(true);
    
    }

    public void actionPerformed(ActionEvent e){

        String input1 = forInput1.getText();
        String input2 = forInput2.getText();
        String result = "Invalid input";
        double answer =0.0;

    try{
        
      double number1 = Double.parseDouble(input1);
      double number2 = Double.parseDouble(input2);
        if(e.getSource() == add){
           answer= number1+number2;
        }
      
        if(e.getSource() == subtract ){
            answer = number1- number2;
        }
        result = Double.toString(answer);
      
    } 
    catch (NumberFormatException error) {
        forResult.setText("Give valid Input");
      } 
      forResult.setText(result);
    }
    


    public static void main(String[] args){

        AddAndSubtract c1 = new  AddAndSubtract();
        c1.display();
    
    }
}
