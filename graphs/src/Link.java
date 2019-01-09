
public class Link {
	Dot a, b;

	public Link(Dot a, Dot b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Dot getA() {
		return a;
	}

	public void setA(Dot a) {
		this.a = a;
	}

	public Dot getB() {
		return b;
	}

	public void setB(Dot b) {
		this.b = b;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Link other = (Link) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}

}
