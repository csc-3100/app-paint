package javiergs.paint.delta;

import java.awt.*;

/**
 * Draws a filled rectangle from the coordinates selected by the user.
 * <p>Preserved from the CSC308 paintApp as the Delta teaching example.</p>
 */
public class Rectangle extends Shape {
	
	public Rectangle(int x1, int y1, int x2, int y2, String c) {
		super(x1, y1, x2, y2, c);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect((x2>x1)?x1:x2, (y2>y1)?y1:y2, (x2>x1)?x2-x1:x1-x2, (y2>y1)?y2-y1:y1-y2);
	}
}
