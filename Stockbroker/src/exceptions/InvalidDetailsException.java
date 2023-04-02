package exceptions;


public class InvalidDetailsException extends Exception {
	public InvalidDetailsException() {

	}

	public InvalidDetailsException(String msg) {
		super(msg);
	}
}
