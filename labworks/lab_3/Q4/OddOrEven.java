import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.NumberFormatException;
// import java.IOException;

class OddOrEven extends Frame implements ActionListener{

    TextField forInput, forOutput;
    Label inputLabel,outputLabel;
    Button check;
    OddOrEven(){
    
        super("checkodd or even");
        forInput = new TextField();
        forOutput = new TextField();
        check = new Button("check");
        inputLabel = new Label("Enter the number:");
        outputLabel = new Label("Result:");
    
    }
    
    void placeComponenet(){
    
        inputLabel.setBounds(10,20,200,50);
        add(inputLabel);

        forInput.setBounds(10,80,200,100);
        add(forInput);
        
        outputLabel.setBounds(10,190,100,50);
        add(outputLabel);

        forOutput.setBounds(10,250,200,100);
        add(forOutput);
        
        check.addActionListener(this);
        check.setBounds(10,360, 50,50);
        add(check);
    }

    void display(){

        placeComponenet();
        setSize(500,600);
        setLayout(null);
        setVisible(true);
    
    }

    public void actionPerformed(ActionEvent e){

        String input = forInput.getText();
        String result = "Give number as input";

    try{
        
      double number = Double.parseDouble(input);
        if(number%2 == 0){
           result = "Given number is even";
        }
      
        else{
            result ="Given number is odd";
        }
      
    } 
    catch (NumberFormatException error) {
        forOutput.setText("Give valid Input");
      } 
      forOutput.setText(result);
    }
    


    public static void main(String[] args){

        OddOrEven c1 = new  OddOrEven();
        c1.display();

    
    }
}
