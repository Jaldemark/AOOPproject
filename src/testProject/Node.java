package testProject;

import java.awt.*;
import java.awt.geom.*;

import app.Board;
import app.Wire;

public interface Node extends Cloneable {

	Board getBoard();
	Wire getWire();
	void draw(Graphics2D g2);

	void translate(double dx, double dy);

	Rectangle2D getBounds();

	Object clone();
	boolean contains(Point2D aPoint);
	//Object getArea();
	void setX(double x);
	void setY(double y);
	double getX();
	double getY();
}
