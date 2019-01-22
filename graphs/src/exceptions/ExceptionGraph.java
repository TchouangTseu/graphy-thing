package exceptions;

@SuppressWarnings("serial")
public class ExceptionGraph extends Exception {
	
	private Exception e;
	
	public ExceptionGraph(Exception e) {
		this.setE(e);
	}

	public Exception getE() {
		return e;
	}

	public void setE(Exception e) {
		this.e = e;
	}

}
