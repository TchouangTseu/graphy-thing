package exceptions;

@SuppressWarnings("serial")
public class ExceptionNetwork extends Exception {
	
	private Exception e;

	public ExceptionNetwork(ExceptionGraph e) {
		this.e = e;
	}

}
