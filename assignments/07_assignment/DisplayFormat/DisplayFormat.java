import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JDialog;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;

public class DisplayFormat extends JFrame{
    
    JFrame mainFrame = new JFrame();
    JMenuBar header;
    JMenu file,edit,view,open;
    JMenuItem  newOption,save,close;


    
    JMenuItem window,panel;
    JMenuItem text ,folder;
    JDialog confirmation;
    JPopupMenu popUpMenu;


    DisplayFormat(){
        super("Assingnment 7");
        header = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        view = new JMenu("View");
        open = new JMenu("Open");  
    }


    void addSubMenuTofile(){
        newOption = new JMenu("New");
        save = new JMenuItem("Save");
        close = new JMenuItem("Close");
        
        text = new JMenuItem("File");
        folder = new JMenuItem("Folder");
        
        newOption.add(text);
        newOption.add(folder);
        file.add(newOption);file.add(save);file.add(close);
    }

    void addPopupMenu(){

        popUpMenu = new JPopupMenu();
        
        JMenu file = new JMenu("File");

        JMenu newOption = new JMenu("New");
        JMenuItem text = new JMenuItem("Text");
        JMenuItem folder = new JMenuItem("Folder");
        newOption.add(text);newOption.add(folder);
        
        JMenuItem close = new JMenuItem("Close");

        JMenuItem save = new JMenuItem("Save");
        
        file.add(newOption);file.add(save);file.add(close);
        popUpMenu.add(file);

        JMenuItem edit = new JMenuItem("Edit");
        popUpMenu.add(edit);
        
        JMenu view = new JMenu("View");
        JMenuItem window = new JMenuItem("Window");
        JMenuItem panel = new JMenuItem("Panel");
        view.add(window);view.add(panel);
        popUpMenu.add(view);


        JMenuItem open= new JMenuItem("open");
        open.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
               System.out.println("hell on");
            }
        });
        popUpMenu.add(open);

        mainFrame.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popUpMenu.show(mainFrame , e.getX(), e.getY());  
            }                 
         });  


    }

 

    void addDialogBox(){

        JFrame f= new JFrame();  
        confirmation = new JDialog(f , "Confirm", true);  
        confirmation.setLayout( new FlowLayout() );  
        JButton ok = new JButton ("OK");  
        JButton cancel = new JButton ("Cancel");  

        ok.addActionListener ( new ActionListener() {  
            public void actionPerformed( ActionEvent e ) {  
                confirmation.setVisible(false);  
            }  
        });  
        
        
        cancel.addActionListener ( new ActionListener() {  
            public void actionPerformed( ActionEvent e )  {  
                    confirmation.setVisible(false);  
                } 
            }); 


        confirmation.add(ok);   
        confirmation.add(cancel);   
        confirmation.setSize(150,150);    
        confirmation.setVisible(true);  
   
    }

         
    void addSubMenuToview(){

        window = new JMenuItem("Window");
        panel = new JMenuItem("Panel");
        view.add(window);view.add(panel);
   
    }
    
    void display(){

        open.addMouseListener (new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                addDialogBox();
            }
        });
    
        header.add(file);
        header.add(edit);
        header.add(view);
        header.add(open);
        addSubMenuTofile();
        addSubMenuToview();
        // addDialogBox();
        addPopupMenu();
        mainFrame.setJMenuBar(header);  
        mainFrame.setSize(400,400);  
        mainFrame.setLayout(null);  
        mainFrame.setVisible(true);
        // mainFrame.setDefaultcloseOperation(DISPOSE_ON_CLOSE);
    }

    

    public static void main(String[] args){
        DisplayFormat a = new DisplayFormat();
         a.display();
    }
}
