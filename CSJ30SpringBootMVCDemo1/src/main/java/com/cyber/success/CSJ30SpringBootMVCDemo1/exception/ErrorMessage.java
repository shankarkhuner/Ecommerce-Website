package com.cyber.success.CSJ30SpringBootMVCDemo1.exception;

import java.time.LocalDate;

public class ErrorMessage {
	private String errorMsg;
	private LocalDate errorDate;
	public ErrorMessage(String errorMsg, LocalDate errorDate) {
		super();
		this.errorMsg = errorMsg;
		this.errorDate = errorDate;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public LocalDate getErrorDate() {
		return errorDate;
	}
	public void setErrorDate(LocalDate errorDate) {
		this.errorDate = errorDate;
	}
	public ErrorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
