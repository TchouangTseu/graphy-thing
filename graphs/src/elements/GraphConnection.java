package elements;

public class GraphConnection {
	Graph a, b;

	public GraphConnection(Graph a, Graph b) {
		super();
		this.a = a;
		this.b = b;
	}

	public GraphConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Graph getA() {
		return a;
	}

	public void setA(Graph a) {
		this.a = a;
	}

	public Graph getB() {
		return b;
	}

	public void setB(Graph b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "GraphConnection [a=" + a + ", b=" + b + "]";
	}

}
