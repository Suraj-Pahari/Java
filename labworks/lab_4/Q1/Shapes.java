// 1. Draw a cricle, ellipse, traingle, hexagon, pentagon in different colors.

import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Polygon;
import java.awt.Color;

class Shapes extends Frame{

	Shapes(){
		super("Different shapes");
		setVisible(true);
		setSize(900,1000);
	}
	public void paint( Graphics g){
		g.setColor(Color.RED);
		drawPentagon(g);

		g.setColor(Color.YELLOW);
		drawHexagon(g);
		
		g.setColor(Color.GREEN);
		drawTriangle(g);
		
		g.setColor(Color.BLUE);
		drawEllipse(g);
		
		g.setColor(Color.ORANGE);
		drawCircle(g);
		
	}
	 
	void drawPentagon(Graphics g){
	
		int size= 50;
		int [] xPoints ={100,100+size,100+(2*size),100+(2*size),100};
		int [] yPoints ={200,200-size,200,200+size,200+size};
		
		Polygon p = new Polygon(xPoints,yPoints,5);
		g.fillPolygon(p);

	}

	void drawHexagon(Graphics g){
	
		int size = 50;
		int [] xPoints ={100,100+size,100+(2*size),100+(2*size),100+size,100};
		int [] yPoints ={350,350-size,350,350+size,350+(2*size),350+size};

		Polygon p = new Polygon(xPoints,yPoints,6);
		g.fillPolygon(p);
	
	}

	void drawTriangle(Graphics g){
	
		int [] xPoints={100,100,200};
		int [] yPoints={500,650,650};
		Polygon p = new Polygon(xPoints,yPoints,3);
		g.fillPolygon(p);
	
	}

	void drawCircle(Graphics g){
	
		g.drawArc(100, 700, 100, 100, 0,360);
		g.fillArc(100, 700, 100, 100, 0,360);
	
	}


	void drawEllipse(Graphics g){
	
		g.drawArc(100, 850, 150, 100, 0,360);
		g.fillArc(100, 850, 150, 100, 0,360);
	
	}

	public static void main(String [] args){
	
		Shapes s1 = new Shapes();
	
	}

}
