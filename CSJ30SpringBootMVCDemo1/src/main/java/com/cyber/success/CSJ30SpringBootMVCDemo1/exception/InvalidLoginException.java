package com.cyber.success.CSJ30SpringBootMVCDemo1.exception;

public class InvalidLoginException extends Exception {
	
	
	public InvalidLoginException(String errorMsg)
	{
		super(errorMsg);
	}

}
