package app;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import testProject.Node;

public class TriangleNode implements Node {
	
	private double x;
	private double y;
	private double size;
	private Color color;
	Board b; 
	Wire w;
	private static final int DEFAULT_SIZE = 20;
	
	public TriangleNode(Color aColor) {
		b = new Board(2);
		w = new Wire(1);
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

	@Override
	public void draw(Graphics2D g2) {
		Rectangle2D square = new Rectangle2D.Double(x, y, size, size);
		Color oldColor = g2.getColor();
		g2.setColor(color);
		g2.fill(square);
		g2.setColor(oldColor);
		g2.draw(square);
		
	}

	@Override
	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
		
	}

	@Override
	public Rectangle2D getBounds() {
		return new Rectangle2D.Double(x, y, size, size);
		
	}
	
}
