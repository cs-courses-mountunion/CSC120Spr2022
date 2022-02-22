import java.awt.*;

public class Pyramid {

    private Color color;
    private Integer over, down;
	
	
    public Pyramid(Color c) {
        color = c;
    } // end of constructor

	
    public void setOver(Integer x) {
        over = x;
    } // end of setOver()
	
    public void setDown(Integer y) {
        down = y;
    } // end of setDown()
        

    public void draw(Graphics g) {

        Color pyramidColor;
  

        pyramidColor = color;
        
        
        
        
        // front face
        g.setColor(pyramidColor);
        Polygon frontFace = new Polygon();
        frontFace.addPoint(over, down);
        frontFace.addPoint(over-45, down+50);
        frontFace.addPoint(over+30, down+60);
        g.fillPolygon(frontFace);
        g.setColor(Color.BLACK);
        g.drawPolygon(frontFace);
        
        // side face
        g.setColor(pyramidColor.darker());
        Polygon sideFace = new Polygon();
        sideFace.addPoint(over, down);
        sideFace.addPoint(over+60, down+30);
        sideFace.addPoint(over+30, down+60);
        g.fillPolygon(sideFace);
        g.setColor(Color.BLACK);
        g.drawPolygon(sideFace);
        
        
    } // end of draw()
    

	
} // end of class Fish
