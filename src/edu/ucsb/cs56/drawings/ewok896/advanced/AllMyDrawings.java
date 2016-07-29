package edu.ucsb.cs56.drawings.ewok896.advanced;

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
 * @author Isaiah Egan
 * @version for UCSB CS56, M16
 */

public class AllMyDrawings
{
    /** Draw a picture with a few desks
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Desk d1 = new Desk(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(d1);
	
	// Make a black desk that's half the size,
	// and moved over 150 pixels in x direction
	
	Shape d2 = ShapeTransforms.scaledCopyOfLL(d1,0.5,0.5);
	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);
	g2.setColor(Color.BLACK); g2.draw(d2);
	
	// Here's a desk that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	d2 = ShapeTransforms.scaledCopyOfLL(d2,4,4);
	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(d2);
	
	// Draw two desks with Windows
	
	DeskWithLamp dl1 = new DeskWithLamp(50,350,40,75);
	DeskWithLamp dl2 = new DeskWithLamp(200,350,200,100);
	
	g2.draw(dl1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(dl2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few desks with lamps by Isaiah Egan", 20,20);
    }
    
    
    /** Draw a picture with a few desks and desks with lamps
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some desks with lamps
	
	DeskWithLamp large = new DeskWithLamp(100,50,225,150);
	DeskWithLamp small = new DeskWithLamp(20,50,40,30);
	DeskWithLamp tallSkinny = new DeskWithLamp(20,150,20,40);
	DeskWithLamp shortFat = new DeskWithLamp(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Desk d1 = new Desk(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(d1);
	
	// Make a black desk that's half the size,
	// and moved over 150 pixels in x direction
	Shape d2 = ShapeTransforms.scaledCopyOfLL(d1,0.5,0.5);
	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);
	g2.setColor(Color.BLACK); g2.draw(d2);
	
	// Here's a desk that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	d2 = ShapeTransforms.scaledCopyOfLL(d2,4,4);
	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(d2);
	
	// Draw two desks with Windows
	
	DeskWithLamp dl1 = new DeskWithLamp(50,350,40,75);
	DeskWithLamp dl2 = new DeskWithLamp(200,350,200,100);
	
	g2.draw(dl1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second desk 45 degrees around its center.
	Shape dl3 = ShapeTransforms.rotatedCopyOf(dl2, Math.PI/4.0);
	
	g2.draw(dl3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("'Who needs all these desks?' by Isaiah Egan", 20,20);
    }
    
    /** Draw a different picture with a few desks
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A couple of desks by Isaiah Egan", 20,20);
	
	
	// Draw some coffee cups.
	
	Desk big = new Desk(180,100,225,150);
	Desk small = new Desk(90,220,40,30);
	
	g2.setColor(Color.RED);     g2.draw(big);
	g2.setColor(Color.GREEN);   g2.draw(small);
	
    }       
}
