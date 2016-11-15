package dfrs.transaction;

public class TransactionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8839433455275376024L;
	private String message;
	
	public TransactionException(String message) {
		super(message);
		this.message = message;
	}
}
