package edu.ucsb.cs56.drawings.iegan.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 A vector drawing of a desk that implements
 the Shape interface, and so can be drawn, as well as
 rotated, scaled, etc.
 
 @author Isaiah Egan
 @version for CS56, M16, UCSB
 
 */
public class Desk extends GeneralPathWrapper implements Shape
{
    
    public Desk(double x, double y, double width, double height)
    {
        
        double topHeight = height/8.0;
        
        double legWidth = width * .1;
        double legHeight = height - topHeight;
        double legY = y + topHeight;
        double rightLegX = x + width - legWidth;
        
        double shelfX = x + legWidth;
        double shelfY = y + .25 * height;
        double shelfWidth = width - 2 * legWidth;
        double shelfHeight = height * 0.1;
        
        //make the top of the desk
        Rectangle2D.Double topDesk =
            new Rectangle2D.Double(x, y, width, topHeight);
      
        //make the two legs
        Rectangle2D.Double leftLeg =
            new Rectangle2D.Double(x, legY, legWidth, legHeight);

        Rectangle2D.Double rightLeg =
            new Rectangle2D.Double(rightLegX, legY, legWidth, legHeight);
        
        //make the shelf
        Rectangle2D.Double Shelf =
            new Rectangle2D.Double(shelfX, shelfY, shelfWidth, shelfHeight);
    
        
        //build that desk
        GeneralPath theDesk = this.get();
        theDesk.append(leftLeg, false);
        theDesk.append(rightLeg, false);
        theDesk.append(topDesk, false);
        theDesk.append(Shelf, false);

    }
    
}