package edu.ucsb.cs56.drawings.j_hwang.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of the sideview of a bed.
      
   @author Austin Jun Ho Hwang 
   @version for CS56, M16, UCSB
   
*/
public class Bed extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of bed
       @param y y coord of upper left corner of bed
       @param width width of the horizontal bed frame
       @param height height of the horizontal part 
              of the frame where the mattressits
    */
    //public House(double x, double y, double width, double height){
    public Bed(double x, double y, double w, double h){
	
	double heightOfLeft = h;
	double heightOfRight = 0.8 * h;
	double heightOfHorizontal = 0.55 * h;
	//double heightOfMattress = 0.7 * h;
	
	double widthOfPost = 0.05 * w;
	double widthOfFrame = 0.05 * w;
	double thickOfMattress = 0.25 * h;
	
	// Make the left bedpost

	Rectangle2D.Double lBedPost =
	    new Rectangle2D.Double (x, y, widthOfPost, heightOfLeft);
	
	// Make the right bedpost

	Rectangle2D.Double rBedPost =
	    new Rectangle2D.Double (x + w, y + (h-heightOfRight),
				     widthOfPost, heightOfRight);
	
	// Make the horizontal frame
 
	Rectangle2D.Double mBedFrame =
	    new Rectangle2D.Double (x + widthOfPost, y + heightOfHorizontal,
				    w - widthOfPost, widthOfPost);
	
	// Make the mattress

	Rectangle2D.Double mattress =
	    new Rectangle2D.Double (x + 1.15*widthOfPost,
				    y+heightOfHorizontal-thickOfMattress,
				    w - 1.3*widthOfPost,thickOfMattress);
	
	
	// Put the whole bed together

	GeneralPath wholeBed = this.get();
	wholeBed.append(lBedPost, false);
	wholeBed.append(rBedPost, false);
	wholeBed.append(mBedFrame, false);
	wholeBed.append(mattress, false);

    }
}
