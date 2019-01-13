package elements;
import java.util.ArrayList;


public class Graph {
	int nbDots, nbLinks;
	ArrayList<Dot> dots;
	ArrayList<Link> links;
	
	public Graph(int nbDots, int nbLinks){
		this.nbDots = nbDots;
		this.nbLinks = nbLinks;
		
		dots = new ArrayList<Dot>();
		links = new ArrayList<Link>();
		
		
	}

}
