package edu.ucsb.cs56.drawings.sai_srimat777.advanced;

/**
 * Circle extends Ellipse2D to make it easier to draw circles
 * because the parameters to the constructor are more convenient
 * 
 * @author Sai Srimat 
 * @version CS56, M16, UCSB
 */

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of an ice cream cone with a scoop, able to be translated, scaled, and drawn. A delicious, portion controlled treat.
      
    
   @author Sai Srimat
   @version for CS56, M16, UCSB
   
*/

public class Scoop extends Cone implements java.awt.Shape
{
     /**
       Constructor
       
       @param x coordinate of bottom of cone
       @param y coordinate of bottom of cone
       @param width of top of cone
       @param height of cone(bottom tip to center of top ellipse)
     */
    public Scoop(double x, double y, double width, double height)
    {
	super(x, y, width, height);
	GeneralPath gp = this.get();
	
	double radius = width/2.0;

	//declare an arc to represent shape of ice cream scoop
	Arc2D.Double arc = new Arc2D.Double(Arc2D.PIE);
	arc.setFrame(x - width/2.0, y - (height * 1.3), radius * 2.0, radius*2);
	arc.setAngleStart(0.0);
	arc.setAngleExtent(180);
 	
	//append ice cream scoop to cone. best served chilled.
	GeneralPath wholeCone = this.get();
        wholeCone.append(arc, false);
        
	
    }
}



