package com.gaming.card;
import java.text.ParseException;

import com.gaming.card.GameException;

public class GameStation {
	private String gamestationName;
	private int id;
	public GameStation(String _gamestationName) throws GameException
	{
		this.gamestationName=_gamestationName;
		try
		{
		this.id=Integer.parseInt(this.gamestationName.substring(1));
		}
		catch (NumberFormatException e) 
		{
		   throw new GameException("Invalid game station name :p");
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id [ "+id+"  ]  , GameStation name [ "+gamestationName+" ]   ";
	}
	public int  getId()
    {
    	return id;
    	
    	
    }
	public GameStation(int stationId)
    {
    	this.id=stationId;
    	this.gamestationName="G"+this.id;
    	
    }
	public String getStationName()
	{
		return gamestationName;
		
	}
}
