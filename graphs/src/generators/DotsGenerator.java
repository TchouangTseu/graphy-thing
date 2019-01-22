package generators;

import java.util.ArrayList;

import elements.Dot;
import exceptions.ExceptionNbDots;
import Dimensions.Dimensions;

public class DotsGenerator {
	/*en raison de la manière de créer les connections entre
	 * les dots le nombre minimum de dots dans une liste de
	 * dots est de 3.
	 */
	
	public ArrayList<Dot> getNRandomDots (int n) throws ExceptionNbDots{
		if(n < 3) throw new ExceptionNbDots();
		ArrayList<Dot> res = new ArrayList<Dot>();
		for (int i = 0; i < n; i++) {
			float x = (float) (Math.random() * Dimensions.width);
			float y = (float) (Math.random() * Dimensions.height);
			res.add(new Dot(x, y));
		}
		return res;
	}
	
}
