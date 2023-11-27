package com.example.library.Exception;

public class BookNotReturnedException extends RuntimeException {
	/**
	 * If Books are not returned on time it will return an exception
	 */
	public String message;
	public BookNotReturnedException(String msg)
	{
		super(msg);
		this.message=msg;
	}

}

