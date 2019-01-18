package controlers;

import java.util.ArrayList;

import elements.Dot;
import elements.Graph;
import elements.Link;

public class GraphGenerator {
	public Graph getGraph(int nbPoints) {
		Graph res = new Graph();
		DotsGenerator dg = new DotsGenerator();
		LinksGenerator lg = new LinksGenerator();
		ArrayList<Dot> dots = dg.getNRandomDots(nbPoints);
		ArrayList<Link> links = lg.getLinksForDots(dots);
		res.setDots(dots);
		res.setLinks(links);
		res.setNbDots(dots.size());
		res.setNbLinks(links.size());
		return res;
	}

}
