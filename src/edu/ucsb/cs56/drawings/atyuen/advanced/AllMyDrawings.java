package edu.ucsb.cs56.drawings.atyuen.advanced;

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
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{

    /** Draw a picture with a three Poke Balls 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	g2.drawString("Valor, Mystic, and Instinct.", 20, 20);

        PokeBall b = new PokeBall(115,130,100);
        Stroke thick = new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        Stroke orig = g2.getStroke();
        g2.setStroke(thick);
	g2.setColor(Color.RED);
        g2.draw(b);
	
	Shape b2 = ShapeTransforms.translatedCopyOf(b,300,0);               
        g2.setColor(Color.BLUE); 
	g2.draw(b2);                         
	
	b2 = ShapeTransforms.scaledCopyOfLL(b2,0.75,0.75);                   
        b2 = ShapeTransforms.translatedCopyOf(b2,-125,150);              
	g2.setColor(Color.YELLOW);
	g2.draw(b2);
	
	}
    
    
    /** Draw a picture with a variety of
	normal Poke Balls and Diamond Balls
     */
    
    public static void drawPicture2(Graphics2D g2) {
	
	Stroke thick = new BasicStroke(2.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        Stroke orig = g2.getStroke();
        g2.setStroke(thick);
	
       	PokeBall m = new PokeBall(100,100,75);
	PokeBall s = new PokeBall(300,250,70); //300,250,70
	DiamondBall d = new DiamondBall(75,250,40);
	DiamondBall dd = new DiamondBall(500,150,100);
	
	g2.setColor(Color.RED);     g2.draw(m);
	
	Shape ss = ShapeTransforms.rotatedCopyOf(s,90);
	g2.setColor(Color.ORANGE);   g2.draw(ss);
	
	g2.setColor(Color.CYAN);    g2.draw(d);
	
	Shape sdd = ShapeTransforms.rotatedCopyOf(dd, Math.PI);
	g2.setColor(Color.MAGENTA);  g2.draw(sdd);
	
	g2.setColor(Color.BLACK);
	g2.drawString("More Poke/Diamond Balls by Alex Yuen!", 300,400);
	
    }
    
    /** Draw a different picture with multiple Diamond Balls
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	g2.drawString("A wild Diamond Ball appeared!", 20, 20);
	
	DiamondBall bdb = new DiamondBall(300,250,200);
	DiamondBall sdb = new DiamondBall(300,375,50);
	
	g2.setColor(Color.BLUE); g2.draw(bdb);
	g2.setColor(Color.RED); //g2.draw(sdb);
	
	Shape s2 = ShapeTransforms.translatedCopyOf(sdb,-110,-190);
	g2.draw(s2);
	s2 = ShapeTransforms.translatedCopyOf(sdb,110,-190);
	g2.draw(s2);
	s2 = ShapeTransforms.translatedCopyOf(sdb,-110, -55);
	g2.draw(s2);
	s2 = ShapeTransforms.translatedCopyOf(sdb,110,-55);
        g2.draw(s2);
    }       
}