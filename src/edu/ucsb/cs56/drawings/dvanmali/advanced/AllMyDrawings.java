package edu.ucsb.cs56.drawings.dvanmali.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Dylan Vanmali
 * @version for UCSB CS56, M16 
 */

public class AllMyDrawings
{
    /**
     * Birthday Party!!! One Large Birthday Cake for me and a small one for everyone else haha
     * @param g2 Graphics2D object
     */
    
    public static void drawPicture1(Graphics2D g2) {
	// label the drawing
	g2.drawString("Birthday Cake For Me and Small Cake For Everyone Else by Dylan Vanmali", 20,20);
		
	// Draw some cakes for a birthday party
	BirthdayCake largeBdayCake = new BirthdayCake(100,50,400,300);
	Cake smallCake = new Cake(20,320,40,30);
	
	g2.setColor(Color.BLUE);
	g2.draw(largeBdayCake);
	g2.setColor(Color.RED);
	g2.draw(smallCake);
    }
    
    /** Draws a picture of a Cake Party, some with extra icing
     * @param g2 Graphics2D object
     */
    public static void drawPicture2(Graphics2D g2) {
	// label the drawing
	g2.drawString("A Cake Party...with Extra Icing on Top, by Dylan Vanmali", 20, 20);

	Cake large = new Cake(100,50,225,150);
	Cake small = new Cake(20,50,40,30);
	Cake tallSkinny = new Cake(20,150,20,40);
	Cake shortFat = new Cake(20,250,40,20);

	g2.setColor(Color.BLUE);
	g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA);
	g2.draw(shortFat);

	// We'll draw these with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	g2.setStroke(thick);
	g2.setColor(Color.RED);
	g2.draw(large);

	g2.setColor(Color.GREEN);
	g2.draw(small);

    }	

    /** Draw an Abstract Cake Artwork
     * @param g2 Graphics2D object
     */
    public static void drawPicture3(Graphics2D g2) {
	// label the drawing
	g2.drawString("Abstract Cake Masterpiece by Dylan Vanmali", 20, 20);

	Cake c1 = new Cake(30,30,75,50);
	g2.setColor(Color.YELLOW);
	g2.draw(c1);
	
	// Make a green cake that's half the size
	// and moved over 100 pixels in the x direction
	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	c2 = ShapeTransforms.translatedCopyOf(c2,100,0);
	g2.setColor(Color.BLACK);
	g2.draw(c2);
	
	// Here's a magenta that's 4x as big (2x the original)
	// and moved over 150 more pixels to down
	c2 = ShapeTransforms.scaledCopyOfLL(c2,4,4);
	c2 = ShapeTransforms.translatedCopyOf(c2,0,150);
	g2.setColor(Color.MAGENTA);
	g2.draw(c2);

	// Time For some Birthday Cakes
	BirthdayCake bc1 = new BirthdayCake(50,150,40,75);
	BirthdayCake bc2 = new BirthdayCake(200,50,200,100);
	g2.setColor(new Color(0x00ffcc)); 
	g2.draw(bc1);
	
	// Rotate our Birthday Cake because we can
	Shape bc3 = ShapeTransforms.rotatedCopyOf(bc2, Math.PI/4.0);
	g2.setColor(Color.ORANGE);
	g2.draw(bc3);
	
	g2.setColor(Color.BLACK); 
    }
}