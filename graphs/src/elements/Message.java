package elements;

public class Message {
	
	private Dot sender, receiver;
	private String information;

	
	public Message() {
		sender = null;
		receiver = null;
		information = null;
	}

	public Message(Dot sender, Dot receiver, String information) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.information = information;
	}

	public Dot getSender() {
		return sender;
	}

	public void setSender(Dot sender) {
		this.sender = sender;
	}

	public Dot getReceiver() {
		return receiver;
	}

	public void setReceiver(Dot receiver) {
		this.receiver = receiver;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	@Override
	public String toString() {
		return "Message [sender=" + sender + ", receiver=" + receiver + ", information=" + information + "]";
	}
	
	

}
