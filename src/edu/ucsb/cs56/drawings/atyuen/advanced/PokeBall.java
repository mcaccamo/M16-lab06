package edu.ucsb.cs56.drawings.atyuen.advanced;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


public class PokeBall extends GeneralPathWrapper implements Shape {
    
    /**
     * Constructor for Poke Ball objects
     * @param x = x coord of center
     * @param y = y coord of center
     * @param r = radius of Poke Ball
     */
    public PokeBall(double x, double y, double r) {
	
	Ellipse2D.Double ball = new Ellipse2D.Double(x-r, y-r, r*2, r*2);
       	Ellipse2D.Double obutton = new Ellipse2D.Double(x-(r/4), y-(r/4), r/2, r/2);
	Ellipse2D.Double ibutton = new Ellipse2D.Double(x-(r/6), y-(r/6), r/3, r/3);
	
	Line2D.Double lhalf = new Line2D.Double(x-r, y, x-(r/4), y);
	Line2D.Double rhalf = new Line2D.Double(x+r, y, x+(r/4), y);

	GeneralPath pokeball = this.get();
	pokeball.append(ball, false);
	pokeball.append(obutton, false);
	pokeball.append(ibutton, false);

	pokeball.append(lhalf, false);
	pokeball.append(rhalf, false);
    }
}