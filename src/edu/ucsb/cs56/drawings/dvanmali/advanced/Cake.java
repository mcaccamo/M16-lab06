package edu.ucsb.cs56.drawings.dvanmali.advanced;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Cake that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Dylan Vanmali
   @version for CS56, W16, UCSB
   
*/
public class Cake extends GeneralPathWrapper implements Shape
{
    /**
       Constructor that creates a three tiered cake
       
       @param x x coord is upper left corner of the cake
       @param y y coord of upper left corner of the cake
       @param width width of the cake
       @param height height of cake
    */
    public Cake(double x, double y, double width, double height)
    {
	double heightLevel1 = 0.5 * height;
	double heightLevel2 = 0.3 * height;
	double heightLevel3 = 0.2 * height;
	
	double widthLevel1 = width;
	double widthLevel2 = 0.75 * width;
	double widthLevel3 = 0.5 * width;

	Rectangle2D.Double tier1 = new Rectangle2D.Double(x,
							  y + heightLevel2 + heightLevel3,
							  widthLevel1, heightLevel1); // Bottom
	Rectangle2D.Double tier2 = new Rectangle2D.Double(x + (width/2.0)-(widthLevel2/2.0),
							  y + heightLevel3,
							  widthLevel2, heightLevel2); // Middle
	Rectangle2D.Double tier3 = new Rectangle2D.Double((x + (width/2.0)) - (widthLevel3/2.0),
							  y,
							  widthLevel3, heightLevel3); // Top
        
        // Let's make the cake
        GeneralPath yummyCake = this.get();
        yummyCake.append(tier1, false);
        yummyCake.append(tier2, false);
        yummyCake.append(tier3, false);    
    }
}
