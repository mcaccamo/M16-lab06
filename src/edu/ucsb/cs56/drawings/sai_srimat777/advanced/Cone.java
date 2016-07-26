package edu.ucsb.cs56.drawings.sai_srimat777.advanced;

/**
 * 
 * @author Sai Srimat 
 * @version CS56, M16, UCSB
 */

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of an empty ice cream cone, able to be translated, scaled, and drawn.
      
    
   @author Sai Srimat
   @version for CS56, M16, UCSB
   
*/

public class Cone extends GeneralPathWrapper implements java.awt.Shape
{
     /**
       Constructor
       
       @param x coordinate of bottom of cone
       @param y coordinate of bottom of cone
       @param width of top of cone
       @param height of cone(bottom tip to center of top ellipse)
     */
    public Cone(double x, double y, double width, double height)
    {
	//draw left diagonal
	Line2D.Double left = 
	    new Line2D.Double (x, y,
                               x - width/2.0, y - height);
	//draw right diagonal
	Line2D.Double right = 
	    new Line2D.Double (x, y,
			       x + width/2.0, y - height);
	//draw ellipse to give illusion of an empty cone
	Ellipse2D.Double cavity =
	    new Ellipse2D.Double (x - width/2.0, y - (height * 1.08), width, .15 * height);
	
	//append each part to make a whole cone
	GeneralPath wholeCone = this.get();
        wholeCone.append(left, false);
        wholeCone.append(right, false);
        wholeCone.append(cavity, false);
	
    }
}



