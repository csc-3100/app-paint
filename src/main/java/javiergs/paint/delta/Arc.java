package javiergs.paint.delta;

import java.awt.*;


/**
 * Draws an arc from the coordinates supplied by the mouse interaction.
 * <p>Preserved from the CSC308 paintApp as the Delta teaching example.</p>
 */
public class Arc extends Shape {
	
	public Arc(int x1, int y1, int x2, int y2, String c) {
		super(x1, y1, x2, y2, c);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		int dx = (x1>x2)?x1-x2:x2-x1;
		int dy = (y1>y2)?y1-y2:y2-y1;
		double m = -((double)(y2-y1)/(double)(x2-x1));
		double angle = Math.atan(m)* 180/Math.PI;
		if ((angle>0 && y2>y1) || (angle<0 && y2<y1) )
				g.fillArc((x1<x2)?x1:x2, (y1<y2)?y1:y2, dx, dy, 180, (int)angle);
		else
				g.fillArc((x1<x2)?x1:x2, (y1<y2)?y1:y2, dx, dy, 0, (int)angle);
	}
}
