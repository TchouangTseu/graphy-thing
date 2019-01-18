package elements;

//La classe Address sert à identifier les noeuds d'un graph
//La string doit être construite sur le modèle numSousGraph/numNoeud
//c'est un choix arbitraire de m'en tenir là pour l'instant mais si
//des adresses plus compliquée étaient nécessaires, il ne serait sans
//doute pas trop dur de faire évoluer cette classe.

public class Address {
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String address;

	public Address(String address) {
		super();
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}
	

}
