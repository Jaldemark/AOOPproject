package testProject;

import java.awt.*;

import app.Board;
import app.Shop;

import java.awt.geom.*;
import java.util.List;
import java.awt.event.*;
import javax.swing.*;

import app.Shop;
import app.TriangleNode;

public class GraphPanel extends JComponent {
	private Graph graph;
	private ToolBar toolBar;
	Shop shop;
	public GraphPanel(ToolBar aToolBar, Graph aGraph) {
		toolBar = aToolBar;
		graph = aGraph;
		setBackground(Color.WHITE);

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent event) {
				Point2D mousePoint = event.getPoint();
				Object tool = toolBar.getSelectedTool();
				if (tool != null) {
					Node prototype = (Node) tool;
					Node newNode = (Node) prototype.clone();
					graph.add(newNode, mousePoint);	
					Shop.addToShop(newNode);
					GraphFrame.theArea.setText(Shop.getShop());
					
				}
				repaint();
			}
		});
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		graph.draw(g2);
	}

	
}
