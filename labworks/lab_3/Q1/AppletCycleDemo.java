import java.applet.*;
import java.awt.*;

public class AppletCycleDemo extends Applet{

    public void init(){

        System.out.println("Init() is called..");
    
    }

    public void start(){
    
        System.out.println("Start() is called...(window maximized)");
    
    }
    
    public void paint(Graphics myGraphics)
    {
    
        System.out.println("paint() is called....(window resized)");
        myGraphics.drawRect(10,50,30,50);
        myGraphics.drawString("init->...start->paint->stop->..destory",10,150);
    
    }

    public void stop(){
    
        System.out.println("Stop is called...(window  minimized/closed)");

    }
    public void destory(){
    
        System.out.println("Destory is called...( already exited)");
    
    }

}