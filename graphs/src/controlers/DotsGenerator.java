package controlers;

import java.util.ArrayList;

import elements.Dot;
import Dimensions.Dimensions;

public class DotsGenerator {
	public ArrayList<Dot> getNRandomDots (int n){
		ArrayList<Dot> res = new ArrayList<Dot>();
		for (int i = 0; i < n; i++) {
			float x = (float) (Math.random() * Dimensions.width);
			float y = (float) (Math.random() * Dimensions.height);
			res.add(new Dot(x, y));
		}
		return res;
	}
	
}
