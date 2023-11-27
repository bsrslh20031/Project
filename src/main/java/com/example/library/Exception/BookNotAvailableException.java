package com.example.library.Exception;

public class BookNotAvailableException extends RuntimeException {
	/**
	 * If Books are not available then it will raise an exception
	 */

	public String message;
	
	public BookNotAvailableException(String msg)
	{
		super(msg);
		this.message=msg;
	}


}

