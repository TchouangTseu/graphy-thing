package generators;

import java.util.ArrayList;

import elements.Graph;
import elements.GraphConnection;


public class GraphConnectionsGenerator {
	public ArrayList<GraphConnection> getGraphConnections(ArrayList<Graph> graphs){
		ArrayList<GraphConnection> res = new ArrayList<GraphConnection>();
		for (int i = 0; i < graphs.size(); i++) {
			GraphConnection gc = new GraphConnection(graphs.get(i), graphs.get((i + 1) % graphs.size()));
			/*gc.setA(graphs.get(i));
			gc.setB(graphs.get((i + 1) % graphs.size()));
			gc.setL(new Link(gc.getA().getDots().get((int) (Math.random() * gc.getA().getDots().size())), 
							gc.getB().getDots().get((int) (Math.random() * gc.getB().getDots().size()))));*/
			res.add(gc);
		}
		return res;
	}

}
