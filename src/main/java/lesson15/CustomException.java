package lesson15;

public class CustomException extends Exception {
	private static final long serialVersionUID = -1347918112213969278L;

	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomException(String message) {
		super(message);
	}

	public CustomException(Throwable cause) {
		super(cause);
	}

}
