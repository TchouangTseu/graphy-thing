package controlers;

import java.util.ArrayList;

import elements.Dot;
import elements.Link;

public class LinksGenerator {
	public ArrayList<Link> getLinksForDots (ArrayList<Dot> dots){
		ArrayList<Link> res = new ArrayList<Link>();
		//ArrayList<Dot> linked = new ArrayList<Dot>();
		for (int i = 0; i < dots.size() - 2; i++) {
			Dot d = dots.get(i);
			//while (linked.contains(d)) d = dots.get((i + 1) % dots.size());
			res.add(new Link(d, dots.get((i + 1) % dots.size())));
			res.add(new Link(d, dots.get((i + 2) % dots.size())));
		}
		return res;
	}

}
