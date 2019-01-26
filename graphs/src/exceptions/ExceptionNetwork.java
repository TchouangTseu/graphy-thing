package exceptions;

@SuppressWarnings("serial")
public class ExceptionNetwork extends Exception {
	
	private Exception e;

	public ExceptionNetwork(ExceptionGraph e) {
		this.setE(e);
	}

	public Exception getE() {
		return e;
	}

	public void setE(Exception e) {
		this.e = e;
	}

}
