package utils;

public class InsufficientFundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str1;

	InsufficientFundException(String str2) {
		str1 = str2;
	}

	public String toString() {
		return ("InsufficientFundException Occurred: " + str1);
	}

}
