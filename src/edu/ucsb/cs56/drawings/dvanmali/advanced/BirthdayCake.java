package edu.ucsb.cs56.drawings.dvanmali.advanced;

import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;

/**
   A vector drawing of a Birthday Cake which extends Cake and 
   implements the Shape interface, and so can be drawn, as well as rotated, scaled, etc.
      
   @author Dylan Vanmali
   @version for CS56, M16, UCSB
   
*/
public class BirthdayCake extends Cake implements Shape
{
    /**
     * Constructor that creates a Cake and adds a candle on top
     *
     * @param x x coord is upper left corner of the Birthday Cake
     * @param y y coord of upper left corner of the Birthday Cake
     * @param width width of the Birthday Cake
     * @param height height of Birthday Cake
     */
    public BirthdayCake(double x, double y, double width, double height)
    {
	// construct the basic cake but leave room for our candle :)
	super(x,y+(height*0.15),width,height*0.85);
	
	double candleHeight = 0.08 * height;
	double flameHeight = 0.06 * height;
	double stemHeight = 0.01 * height;

	double candleWidth = 0.02 * width;
	double flameWidth = 0.01 * width;
	double centerHoriz = x + (width/2.0);

	Rectangle2D.Double candle = new Rectangle2D.Double(centerHoriz - (candleWidth/2.0),
							   y + flameHeight + stemHeight, 
							   candleWidth, candleHeight);
	Line2D.Double stem = new Line2D.Double(centerHoriz, y + flameHeight,
					       centerHoriz, y + flameHeight + stemHeight);
	Arc2D.Double flame = new Arc2D.Double(centerHoriz - (flameWidth/2), y,
					      flameWidth, flameHeight, 225, 90, Arc2D.PIE);

	// add the candle to the cake
        GeneralPath birthday = this.get();
        birthday.append(candle, false);
        birthday.append(stem, false);
	birthday.append(flame, false); 
    }    
}
