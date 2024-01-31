package com.cyber.success.CSJ30SpringBootMVCDemo1;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyber.success.CSJ30SpringBootMVCDemo1.exception.ErrorMessage;
import com.cyber.success.CSJ30SpringBootMVCDemo1.exception.InvalidCustomerException;
import com.cyber.success.CSJ30SpringBootMVCDemo1.exception.InvalidLoginException;
import com.cyber.success.CSJ30SpringBootMVCDemo1.exception.InvalidProductException;





@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	
	@ResponseBody
	@ExceptionHandler(InvalidProductException.class)
	public String checkInvalidProductId(InvalidProductException e)
	{
		ErrorMessage msg=new ErrorMessage(e.getMessage(), LocalDate.now());
		return "<h3><font color='red'>"+msg.getErrorMsg()+ " "+"on"+ " "+msg.getErrorDate()+"</font></h3>"+" "+"<a href='/'>go back</a>";
		
	}
	@ResponseBody
	@ExceptionHandler(InvalidLoginException.class)
	public String checkInvalidLogin(InvalidLoginException e)
	{
		ErrorMessage msg=new ErrorMessage(e.getMessage(), LocalDate.now());
		return "<h3><font color='red'>"+msg.getErrorMsg()+ " "+"on"+ " "+msg.getErrorDate()+"</font></h3>"+" "+"<a href='/'>go back</a>";
		
	}
	@ResponseBody
	@ExceptionHandler(InvalidCustomerException.class)
   public String checkInvalidCustomerId(InvalidCustomerException e)
   {
	   ErrorMessage msg=new ErrorMessage(e.getMessage(), LocalDate.now());
		return "<h3><font color='red'>"+msg.getErrorMsg()+ " "+"on"+ " "+msg.getErrorDate()+"</font></h3>";
		
   }

}
