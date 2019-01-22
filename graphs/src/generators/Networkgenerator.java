package generators;

import java.util.ArrayList;

import elements.Graph;
import elements.GraphConnection;
import elements.Network;
import exceptions.ExceptionGraph;
import exceptions.ExceptionNetwork;
import variablesGlobales.Dimensions;

public class Networkgenerator {
	
	public Network getRandomNetwork() throws ExceptionNetwork {
		GraphGenerator gg = new GraphGenerator();
		int nbPoints = (int) (Math.random()*Dimensions.MAX_DOTS_PER_GRAPH);
		ArrayList<Graph> graphs = new ArrayList<Graph>();
		for(int i = 0; i < Dimensions.NB_GRAPHS; i++) {
			try {
				graphs.add(gg. getGraph(nbPoints));
			} catch (ExceptionGraph e) {
				throw new ExceptionNetwork(e);
			}
		}
		GraphConnectionsGenerator gcg = new GraphConnectionsGenerator();
		ArrayList<GraphConnection> graphconnections = gcg.getGraphConnections(graphs);
		
		return new Network(graphs, graphconnections);
	}

}
