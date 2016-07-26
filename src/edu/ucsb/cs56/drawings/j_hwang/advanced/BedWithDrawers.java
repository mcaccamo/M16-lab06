package edu.ucsb.cs56.drawings.j_hwang.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;


/**
 * A class with methods for drawing beds with drawers
 * 
 * @author Austin Hwang 
 * @version for UCSB CS56, M16 
 */


public class BedWithDrawers extends Bed implements Shape{

    // ctor
    public BedWithDrawers(double x, double y, double w, double h){

	super(x,y,w,h);

	GeneralPath gp = this.get();

	double heightOfDrawer = (0.55*h)+(0.05*w);
	double thickOfDrawer = h-heightOfDrawer;
	double yCoordOfDrawer = y + heightOfDrawer + 0.5*thickOfDrawer;
	
	Rectangle2D.Double drawer1 =
	    new Rectangle2D.Double(x+ 0.05*w, y + heightOfDrawer,
				   (w-0.05*w)/2.0, thickOfDrawer);

	Rectangle2D.Double drawer2 =
	    new Rectangle2D.Double(x+ 0.05*w + ((w-0.05*w)/2.0),
				   y + heightOfDrawer,
				   (w-0.05*w)/2.0, thickOfDrawer);
	
	// add in lines for handles (just lines)

	Line2D.Double leftHandle =
	    new Line2D.Double(x + (0.05*w) + 0.2*(w-0.05*w),
			      yCoordOfDrawer,
			      x + (0.02*w) + 0.3*(w-0.05*w),
			      yCoordOfDrawer);

	Line2D.Double rightHandle = 
	    new Line2D.Double(x + (0.05*w) + 0.7*(w-0.05*w),
			      yCoordOfDrawer,
			      x + (0.02*w) + 0.8*(w-0.05*w),
			      yCoordOfDrawer);

	// add pillow?


	
	GeneralPath wholeBed = this.get();
	wholeBed.append(drawer1, false);
	wholeBed.append(drawer2, false);
	wholeBed.append(leftHandle, false);
	wholeBed.append(rightHandle, false);
    }
    
}
