package javiergs.paint.delta;

import java.awt.*;

/**
 * Base abstraction for drawable shapes, storing their bounds and color.
 * <p>Preserved from the CSC308 paintApp as the Delta teaching example.</p>
 */
public abstract class Shape {

	protected int x1, y1, x2, y2;
	protected Color color;
	
	public Shape(int x1,int y1,int x2,int y2,String c) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		switch(c) {
			case("Black"): color=Color.BLACK; break;
			case("Red"): color=Color.RED; break;
			case("Blue"): color=Color.BLUE; break;
			case("Green"): color=Color.GREEN; break;
			case("Yellow"): color=Color.YELLOW; break;
			case("Orange"): color=Color.ORANGE; break;
			case("Pink"): color=Color.PINK; break;
			default: color=Color.WHITE;
		}
	}
	
	public abstract void draw(Graphics g);
}
