package generators;

import java.util.ArrayList;

import elements.Dot;
import elements.Graph;
import elements.Link;
import exceptions.ExceptionGraph;
import exceptions.ExceptionNbDots;

public class GraphGenerator {
	public Graph getGraph(int nbPoints) throws ExceptionGraph {
		Graph res = new Graph();
		DotsGenerator dg = new DotsGenerator();
		LinksGenerator lg = new LinksGenerator();
		ArrayList<Dot> dots;
		try {
			dots = dg.getNRandomDots(nbPoints);
			ArrayList<Link> links = lg.getLinksForDots(dots);
			res.setDots(dots);
			res.setLinks(links);
			res.setNbDots(dots.size());
			res.setNbLinks(links.size());
		} catch (ExceptionNbDots e) {
			throw new ExceptionGraph(e);
		}
		return res;
	}

}
