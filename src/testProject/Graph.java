package testProject;

import java.awt.*;
import app.*;
import app.TextField;

import java.awt.geom.*;
import java.util.*;
import java.util.List;

public abstract class Graph {
	private ArrayList<Node> nodes;
	public TextField shop;
	
	public Graph() {
		nodes = new ArrayList<Node>();
		
	}

	public void add(Node n, Point2D p) {
		Rectangle2D bounds = n.getBounds();
		n.translate(p.getX() - bounds.getX(), p.getY() - bounds.getY());
		nodes.add(n);
	}

	public void draw(Graphics2D g2) {
		for (Node n : nodes)
			n.draw(g2);
	}

	public abstract Node[] getNodePrototypes();

	public List<Node> getNodes() {
		return Collections.unmodifiableList(nodes);
	}
	public TextField shop(int n, String s){
		return new TextField(n,s);
	}

	

}
