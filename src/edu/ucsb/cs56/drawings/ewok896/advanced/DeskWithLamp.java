package edu.ucsb.cs56.drawings.ewok896.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 A Desk Witta Lamp
 
 @author Phill Conrad
 @version for CS56, W16, UCSB
 
 */
public class DeskWithLamp extends Desk implements Shape
{
    /**
     * Constructor for objects of class DeskWithLamp
     */
    public DeskWithLamp(double x, double y, double width, double height)
    {
        super(x, y, width, height);
        
        GeneralPath gp = this.get();
        
        double legX = x + 0.8 * width;
        double legY = y - height/3.0;
        
        double neckY = legY - (0.1 * legY);
        double neckX = legX - (0.1 * neckY);
        
        Line2D.Double lampLeg =
        new Line2D.Double (legX, y, legX, legY);
        
        Line2D.Double lampNeck =
        new Line2D.Double (legX, legY, neckX, neckY);
        
        Rectangle2D.Double lampHead =
        new Rectangle2D.Double(neckX, neckY, 0.08 * height, 0.08*width);

        
        GeneralPath withLamp = this.get();
        withLamp.append(lampLeg, false);
        withLamp.append(lampNeck, false);
        withLamp.append(lampHead, false);

    }

}
