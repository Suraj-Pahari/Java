
  
import java.awt.Frame;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class GridBagDemo extends Frame {
    GridBagDemo() {

        super("Demostration of gridbag layout");
        setSize(500, 800);
        setVisible(true);

        GridBagConstraints size = new GridBagConstraints();

        setLayout(new GridBagLayout());

        Button east = new Button("East");
        Button west= new Button("West");
        Button north = new Button("North");
        Button south = new Button("South");
    

        size.gridx = 0;
        size.gridy =0;
        add(north, size);
        
        size.gridx = 15;
        size.gridy = 10;
        add(east, size);

        size.gridx =0;
        size.gridy =10;
        add(west, size);

        size.gridx = 0;
        size.gridy =15;
        add(south, size);
 
    }
    public static void main(String[] args ){
        GridBagDemo g1 = new GridBagDemo();
    }
}