package elements;

import java.util.ArrayList;

public class Network {
	ArrayList<Graph> graphs;
	ArrayList<GraphConnection> graphconnections;
	public Network() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Network(ArrayList<Graph> graphs, ArrayList<GraphConnection> graphconnections) {
		super();
		this.graphs = graphs;
		this.graphconnections = graphconnections;
	}
	public ArrayList<Graph> getGraphs() {
		return graphs;
	}
	public void setGraphs(ArrayList<Graph> graphs) {
		this.graphs = graphs;
	}
	public ArrayList<GraphConnection> getGraphconnections() {
		return graphconnections;
	}
	public void setGraphconnections(ArrayList<GraphConnection> graphconnections) {
		this.graphconnections = graphconnections;
	}
	@Override
	public String toString() {
		return "Network [graphs=" + graphs + ", graphconnections=" + graphconnections + "]";
	}

}
