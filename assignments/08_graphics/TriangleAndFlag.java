 import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;
class TriangleAndFlag extends Frame
{
 Polygon triangle1,triangle2;

	public TriangleAndFlag()
	{
		super("Triangle and Flags");
		setSize(900, 1000);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
        drawTriangle1(g);
        drawTriangle2(g);
		drawFlag(g);

	}

    public void drawTriangle1(Graphics g)
    {
 		int codX[] = {410,760,510}; 
		int codY[] = {50,200,200}; 

        triangle1 = new Polygon(codX,codY,3);
		g.drawPolygon(triangle1);
		g.setColor(Color.green);  
		g.fillPolygon(triangle1); 
    }
    public void drawTriangle2(Graphics g)
    {
            
        int codX[] = {410,760,510}; 
		int codY[] = {350,500,500}; 
		g.setColor(Color.blue);  

        triangle2 = new Polygon(codX,codY,3);
		g.drawPolygon(triangle2);


    }
    public void drawFlag(Graphics flag){ 
        
        Polygon firstTriangle,secondTriangle,rod,border,star;

        Color flagRed = new Color(221,12,39); 
 
 		int firstTriangleX[] = {210,360,210}; 
		int firstTriangleY[] = {50,200,200};
 
 		firstTriangle = new Polygon(firstTriangleX,firstTriangleY,3);
		flag.drawPolygon(firstTriangle);
		flag.setColor(flagRed);  
		flag.fillPolygon(firstTriangle);

		 
		int secondTriangleX[] = {210,390,210};  
		int secondTriangleY[] = {200,380,380};
		secondTriangle = new Polygon(secondTriangleX,secondTriangleY,3);
		flag.drawPolygon(secondTriangle);
		flag.setColor(flagRed);
		flag.fillPolygon(secondTriangle);

		
		int rodX[] = {207,210,210,207};
		int rodY[] = {47,47,540,538};
		rod = new Polygon(rodX,rodY,4);
		flag.drawPolygon(rod);
		flag.setColor(Color.black);
		flag.fillPolygon(rod);

		
		int borderX[] = {210,210,360,210,390,210,210,396,216,366}; 
		int borderY[] = {47,40,200,200,380,380,383,383,203,203};
		border = new Polygon(borderX,borderY,10);
		flag.drawPolygon(border);
		flag.setColor(Color.blue);
		flag.fillPolygon(border);

 
		flag.setColor(Color.white);
		flag.fillOval(240,140,30,30);  
		flag.setColor(flagRed);
		flag.fillOval(240,131,30,30);

		
		int starX[] = {240,250,255,260,270,265,270,260,255,250,240,245};
		int starY[] = {300,300,290,300,300,310,320,320,330,320,320,310}; 
		star = new Polygon(starX,starY,12);
		flag.drawPolygon(star);
		flag.setColor(Color.white);
		flag.fillPolygon(star);	

}
public static void main(String[] args){
    new TriangleAndFlag();
}
}