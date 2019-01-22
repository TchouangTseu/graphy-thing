package elements;
import java.util.ArrayList;

//Un graph est un ensemble de points 
//et de liens entre ces points
//il doit toujours exister un chemin entre n'importe quels points

public class Graph {

	int nbDots, nbLinks;
	int numId;//pour l'adressage
	ArrayList<Dot> dots;
	ArrayList<Link> links;
	
	public Graph() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Graph(int numId, int nbDots, int nbLinks){
		this.numId = numId;
		this.nbDots = nbDots;
		this.nbLinks = nbLinks;
		
		dots = new ArrayList<Dot>();
		links = new ArrayList<Link>();
		
		
	}
	
	public Dot getRandomDot() {
		return dots.get((int) Math.random()*dots.size());
	}

	public int getNbDots() {
		return nbDots;
	}

	public void setNbDots(int nbDots) {
		this.nbDots = nbDots;
	}

	public int getNbLinks() {
		return nbLinks;
	}

	public void setNbLinks(int nbLinks) {
		this.nbLinks = nbLinks;
	}

	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public ArrayList<Dot> getDots() {
		return dots;
	}

	public void setDots(ArrayList<Dot> dots) {
		this.dots = dots;
	}

	public ArrayList<Link> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<Link> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "Graph [nbDots=" + nbDots + ", nbLinks=" + nbLinks + ", numId=" + numId + ", dots=" + dots + ", links="
				+ links + "]";
	}
	

}
