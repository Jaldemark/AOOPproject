package testProject;

import java.awt.*;

import app.*;
import app.TextField;

import java.awt.geom.*;
import java.util.*;
import java.util.List;

import java.awt.*;
import java.awt.geom.*;
import java.io.Serializable;
import java.util.*;
import java.util.List;

import javax.swing.*;


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
	/**
	 * checks if the mousepoint is on the node
	 * @return true if the pointer is on a node
	 */
	public Node findNode(Point2D p){
		for(int i = 0; i<nodes.size(); i++ ){
			Node newNode = nodes.get(i);
			if(newNode.contains(p))
				return newNode;
			
		}
		return null;
	}

	public void deleteSelected(Node theNode) {
		nodes.remove(theNode);
		
	}


	

}
