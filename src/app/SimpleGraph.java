package app;


import java.awt.*;

import testProject.*;

public class SimpleGraph extends Graph {
	public Node[] getNodePrototypes() {
		Node[] nodeTypes = { new TriangleNode(Color.GREEN), new CircleNode(Color.BLACK), new CircleNode(Color.WHITE), new SquareNode(Color.BLUE) };
		return nodeTypes;
	}
}
