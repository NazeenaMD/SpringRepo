package com.spring.springbean;

public class MessageBean {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	public void displayMessage()
	{
		System.out.println("message is:" + message);
	}

}
