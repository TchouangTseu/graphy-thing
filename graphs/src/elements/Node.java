package elements;

import java.util.HashMap;

public class Node {
	private Dot dot;
	private HashMap<Node, Integer> destinations;
	
	public Node() {
		dot = null;
		destinations = null;
	}
	
	public Node(Dot dot, HashMap<Node, Integer> destinations) {
		super();
		this.dot = dot;
		this.destinations = destinations;
	}

	public Dot getDot() {
		return dot;
	}

	public void setDot(Dot dot) {
		this.dot = dot;
	}

	public HashMap<Node, Integer> getDestinations() {
		return destinations;
	}

	public void setDestinations(HashMap<Node, Integer> destinations) {
		this.destinations = destinations;
	}
	
	
	

}
