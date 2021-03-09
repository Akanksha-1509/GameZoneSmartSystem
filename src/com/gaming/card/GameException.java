package com.gaming.card;

public class GameException extends Exception{
private String message;
	
	public GameException()
	{
		super();
		
	}
	public GameException(String _message)
	{
		super(_message);
		this.message=_message;
	
		
	}
	public String toString()
	{
		
		return "DELHI-METRO Exception [ "+this.message+"] ";
		
	}


}
