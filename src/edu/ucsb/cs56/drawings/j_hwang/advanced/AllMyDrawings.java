package edu.ucsb.cs56.drawings.j_hwang.advanced;

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
 * @author Austin Hwang 
 * @version for UCSB CS56, M16 
 */

public class AllMyDrawings
{
    /**
     */

    public static void drawPicture1(Graphics2D g2){
	// Make a blue Bed at (50,50) w/ w=150; h=100
	Bed b1 = new Bed(50,50,150,100);
	g2.setColor(Color.BLUE);
	g2.draw(b1);

	// Make a yellow house that is 1/3 the size,
	// and moved over 250 units to the right
	Shape b12 = ShapeTransforms.scaledCopyOfLL(b1,0.33,0.33);
	b12 = ShapeTransforms.translatedCopyOf(b12,250,0);
	g2.setColor(Color.YELLOW);
	g2.draw(b12);

	// Transform this ^ house by x4
	// and move 50 units right and 150 units down
	b12 = ShapeTransforms.scaledCopyOfLL(b12,4,4);
	b12 = ShapeTransforms.translatedCopyOf(b12,50,150);
	// with a thicker stroke
        Stroke thickness = new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	Stroke initial = g2.getStroke();
	g2.setStroke(thickness);
	//g2.setColor(new Color(0x002FA7));
	g2.draw(b12);

	// Draw a Black BedWithDrawers at (100,260) w/ w=300 h=180
	BedWithDrawers b2 = new BedWithDrawers(100,260,300,180);
	g2.setColor(Color.BLACK);
	g2.draw(b2);

	// signing and labeling
	g2.setStroke(initial);
	g2. drawString("Some Beds by Austin Hwang", 20,20);
    }



    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	// Make a black bed at (30,300) w/ w=50 h=40
	Bed b1 = new Bed(30,300,50,40);
	g2.setColor(Color.BLACK);
	g2.draw(b1);

	// translate 100 pixels right, 40 down;
	// size x3
	g2.setColor(new Color(0x00C4B0));
	Shape b12 = ShapeTransforms.scaledCopyOfLL(b1, 3, 3);
	b12 = ShapeTransforms.translatedCopyOf(b12, 100, 40);
	//change stroke thickness
	Stroke thickness = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	Stroke initial = g2.getStroke();
	g2.setStroke(thickness);
	g2.draw(b12);

	Bed b21 = new Bed(360, 50, 250, 100);

	thickness = new BasicStroke(2.2f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	g2.setStroke(thickness);

	g2.setColor(new Color(0x007FFF));
	g2.draw(b21);


	Shape b212 = ShapeTransforms.scaledCopyOfLL(b21, 0.5, 0.5);
	b212 = ShapeTransforms.translatedCopyOf(b212, 0, 260);
	b212 = ShapeTransforms.rotatedCopyOf(b212, Math.PI/4.0);
	g2.setColor(new Color(0xFFE135));
	g2.draw(b212);

	
	// Make 2 BedWithDrawers
	BedWithDrawers bwd1 = new BedWithDrawers(40,50,150,90);
	BedWithDrawers bwd2 = new BedWithDrawers(200,60,100,70);

	g2.setColor(new Color(0xB0BF1A));
	g2.draw(bwd1);

	Shape bwd3 = ShapeTransforms.rotatedCopyOf(bwd2, Math.PI/3.0);
	g2.draw(bwd3);

	Shape bwd4 = ShapeTransforms.translatedCopyOf(bwd3, 200, 150);
	Shape bwd5 = ShapeTransforms.rotatedCopyOf(bwd4, Math.PI/5.0);
	g2.setColor(new Color(0xFF9966));
	g2.draw(bwd5);


	
	g2.setStroke(initial);
	g2.setColor(Color.BLACK);
	g2.drawString("Beds and Beds with drawers by Austin Hwang", 20,20);
	

    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Some More Beds and Beds with drawers by Austin Hwang", 20,20);
	
	
	// Draw 
	
	Bed b1 = new Bed(300,50, 70,30);
	g2.setColor(new Color(0x3D0C02));
	g2.draw(b1);

	Shape b12 = ShapeTransforms.scaledCopyOfLL(b1, 2.5,2.5);
	b12 = ShapeTransforms.translatedCopyOf(b12, 100,10);
	Stroke thickness = new BasicStroke (3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	Stroke initial=g2.getStroke();
	g2.setStroke(thickness);
	g2.setColor(new Color(0x318CE7));
	g2.draw(b12);
	
	Bed b2 = new Bed(50,180, 400,270);
	g2.setColor(new Color(0xCC0000));
	g2.draw(b2);
	
	BedWithDrawers bwd1 = new BedWithDrawers(50,50, 150,100);
	g2.setColor(new Color(0xFFAA1D));
	g2.draw(bwd1);

	thickness = new BasicStroke (2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	g2.setStroke(thickness);
	
	Shape bwd12 = ShapeTransforms.translatedCopyOf(bwd1, 150,270);
	bwd12 = ShapeTransforms.rotatedCopyOf(bwd12, Math.PI/6.0);
	bwd12 = ShapeTransforms.scaledCopyOfLL(bwd12, 0.6,0.6);
	g2.setColor(new Color(0xFFC1CC));
	g2.draw(bwd12);
	
	BedWithDrawers bwd2 = new BedWithDrawers(200,200, 100,30);
	g2.setColor(new Color(0x004225));
	g2.draw(bwd2);
	
    }       
}
