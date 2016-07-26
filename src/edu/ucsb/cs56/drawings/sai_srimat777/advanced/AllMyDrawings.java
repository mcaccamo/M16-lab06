package edu.ucsb.cs56.drawings.sai_srimat777.advanced;

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
 * @author Phill Conrad 
 * @author Sai Srimat
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a with a few empty Ice Cream cones
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Cone c1 = new Cone(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(c1);
	
	// Make a black cone that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
	g2.setColor(Color.BLACK); g2.draw(c2);
	
	// Here's a cone that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	c2 = ShapeTransforms.scaledCopyOfLL(c2,4,4);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
	
	// We'll draw this cone with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(c2); 
	
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Ice Cream for Everyone by Sai Srimat", 20,20);
    }
    
    
    /** Draw a picture with a few empty cones and cones with Ice Cream
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some cones

        Cone c1 = new Cone(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(c1);
	
	// Make a black cone that's half the size, 
	// and moved over 150 pixels in x direction
	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
	g2.setColor(Color.BLACK); g2.draw(c2);
	
	// Here's a cone that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
        c2 = ShapeTransforms.scaledCopyOfLL(c2,4,4);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
	
	// We'll draw this cone with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(c2); 
	
	// Draw two cones with Ice Cream in them
	
	Scoop sc1 = new Scoop(50,350,40,75);
	Scoop sc2 = new Scoop(200,400,50,80);
	
	g2.draw(sc1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second ice cream cone 45 degrees.
	Shape sc3 = ShapeTransforms.rotatedCopyOf(sc2, Math.PI/4.0);
	
	g2.draw(sc3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Ice Cream Cones with and without Ice Cream by Sai Srimat", 20,20);
    }
    
    /** Draw a different picture with some ice cream filled cones.
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label my drawing
	
	g2.drawString("Ice Cream Cones with 1 Scoop by Sai Srimat", 20,20);
	
	
	// Draw some Ice Cream Cones with 1 scoop
	
        Scoop scoop1 = new Scoop(400,300,100,150);
	Scoop scoop2 = new Scoop(100,100,30,40);
	
	g2.setColor(Color.RED);     g2.draw(scoop1);
	g2.setColor(Color.GREEN);   g2.draw(scoop2);
	
    }       
}
