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
		
		for(int i = 0; i < nbDots; i++){
			dots.add(new Dot((float)(Math.random()*1280), 
					(float)(Math.random()*720)));
		}
		
		for(int i = 0; i < nbLinks; i++){
			links.add(new Link(dots.get((int)(Math.random()*nbDots)),
					dots.get((int)(Math.random()*nbDots))));
		}
	}

}
