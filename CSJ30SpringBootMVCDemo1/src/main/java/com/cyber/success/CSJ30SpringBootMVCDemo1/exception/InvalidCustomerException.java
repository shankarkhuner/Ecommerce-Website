package com.cyber.success.CSJ30SpringBootMVCDemo1.exception;

public class InvalidCustomerException extends Exception
{

	public InvalidCustomerException(String errorMsg)
	{
		super(errorMsg);
	}
}
