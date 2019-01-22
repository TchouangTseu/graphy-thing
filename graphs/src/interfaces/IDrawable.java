package interfaces;

/*doit gérer toutes les questions liées à l'affichage
 * soit, non exhaustivement :
 * 
 * 		les formes
 * 			pour le point : un cercle, un disque, un espace entre les deux
 * 			pour les liens : une ligne rejoignant le cercle extérieur
 * 							d'opacité ~70%
 * 			pour les messages : un disque coloré d'opacité faible mais cerclé
 * 							de manière nette
 * 
 * 		les couleurs
 * 
 * 			élaborer une palette pour les points (les points d'un même sous graph ont
 * 				tous la même couleur)
 * 			une autre pour les messages
 * 			choisir une couleur pour les liens
 * 
 * 		les dimensions
 * 
 * 			points liens et messages seront les seuls objets à dimensionner 		
 */


public interface IDrawable {

	public void draw();
	
}
