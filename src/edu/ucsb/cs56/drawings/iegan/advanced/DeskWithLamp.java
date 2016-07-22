package edu.ucsb.cs56.drawings.iegan.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 A Desk Witta Lamp
 
 @author Phill Conrad
 @version for CS56, W16, UCSB
 
 */
public class DeskWithLamp extends Desk implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public DeskWithLamp(double x, double y, double width, double height)
    {
        super(x, y, width, height);
        
        GeneralPath gp = this.get();
    }

}