package elements;

import java.util.HashMap;

public class Node {
	
	private Dot dot;
	private Address address;
	private HashMap<Address, Integer> destinations;
	
	public Node() {
		dot = null;
		destinations = null;
	}
	
	public Node(Dot dot, HashMap<Address, Integer> destinations) {
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

	public HashMap<Address, Integer> getDestinations() {
		return destinations;
	}

	public void setDestinations(HashMap<Address, Integer> destinations) {
		this.destinations = destinations;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Node [dot=" + dot + ", address=" + address + ", destinations=" + destinations + "]";
	}

	

}
