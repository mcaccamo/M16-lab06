package edu.ucsb.cs56.drawings.atyuen.advanced;

import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D;

public class DiamondBall extends PokeBall implements Shape {
    
    public DiamondBall(double x, double y, double r) {
	
	super(x, y, r);
	
   	Line2D.Double topL = new Line2D.Double(x, y-(4*r/5), 
					       x-(r/10), y-(3*r/5));
	Line2D.Double topR = new Line2D.Double(x, y-(4*r/5),
					       x+(r/10), y-(3*r/5));
	
	Line2D.Double botL =new Line2D.Double(x, y-(2*r/5),
					      x+(r/10), y-(3*r/5));
        Line2D.Double botR = new Line2D.Double(x, y-(2*r/5),
					       x-(r/10), y-(3*r/5));
					    
	GeneralPath diamond = this.get();
	diamond.append(topL, false);
	diamond.append(topR, false);
	diamond.append(botL, false);
	diamond.append(botR, false);	
    }
}