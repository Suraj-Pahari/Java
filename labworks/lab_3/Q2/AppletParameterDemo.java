import java.applet.Applet;
import java.awt.Graphics;

public class AppletParameterDemo extends Applet{
 
    
    public void paint(Graphics graphics)
    {
        String parameter = getParameter("myMessage");
        graphics.drawString(parameter,50,50);
    }
 
}
