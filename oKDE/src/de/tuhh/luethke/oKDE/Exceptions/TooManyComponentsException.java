package de.tuhh.luethke.oKDE.Exceptions;

public class TooManyComponentsException extends Exception {

	private static final long serialVersionUID = 5182689601412391328L;

	public TooManyComponentsException() {
	}

	public TooManyComponentsException(String msg) {
		super(msg);
	}
}
