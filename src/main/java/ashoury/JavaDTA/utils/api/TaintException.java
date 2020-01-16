package ashoury.JavaDTA.agent;


public class TaintException extends RuntimeException {
	private String source;

	public TaintException(String message, String source) {
		super(message);
		this.source = source;
	}
}
