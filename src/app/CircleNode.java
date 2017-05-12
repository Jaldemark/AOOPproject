package app;

import java.awt.*;

import java.awt.geom.*;

import testProject.*;

/**
 * A circular node that is filled with a color.
 */
public class CircleNode implements Node {
	Board b;
	Wire w;
	public CircleNode(Color aColor) {
		b = new Board(3);
		w = new Wire(4);
		size = (b.size)*DEFAULT_SIZE;
		x = 0;
		y = 0;
		color = aColor;
	}
	public Board getBoard(){
		return b;
	}
	public Wire getWire() {
		return w;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException exception) {
			return null;
		}
	}

	public void draw(Graphics2D g2) {
		Ellipse2D circle = new Ellipse2D.Double(x, y, size, size);
		Color oldColor = g2.getColor();
		g2.setColor(color);
		g2.fill(circle);
		g2.setColor(oldColor);
		g2.draw(circle);
	}

	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
	}

	public Rectangle2D getBounds() {
		return new Rectangle2D.Double(x, y, size, size);
	}

	private double x;
	private double y;
	private double size;
	private Color color;
	private static final int DEFAULT_SIZE = 20;
}