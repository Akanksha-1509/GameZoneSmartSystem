package com.gaming.card;

import java.util.Calendar;
import java.util.Iterator;
import java.util.UUID;
import java.util.Vector;
import com.gaming.card.GameException;
import com.gaming.card.GameStation;

public class GameUtility {

	private static Vector<GameStation>   listOfSatations=null;
	public static boolean isValidStation(int stationId)
	{
		try {
			Iterator<GameStation> it=listOfSatations.iterator();
			while (it.hasNext()) {
				GameStation st = (GameStation) it.next();
				if(st.getId()==stationId)
					return true;

			}
			return false;

		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	static
	{
		listOfSatations=new Vector<GameStation>(10);
		try
		{
			listOfSatations.add(new GameStation("G1"));
			listOfSatations.add(new GameStation("G2"));
			listOfSatations.add(new GameStation("G3"));
			listOfSatations.add(new GameStation("G4"));
			listOfSatations.add(new GameStation("G5"));
			listOfSatations.add(new GameStation("G6"));
			listOfSatations.add(new GameStation("G7"));
			listOfSatations.add(new GameStation("G8"));
			listOfSatations.add(new GameStation("G9"));
			listOfSatations.add(new GameStation("G10"));
		} 
		catch (GameException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String generateCardNumber()
	{
		
			String cardId=UUID.randomUUID().toString();	

		return cardId;

	}
	public static boolean isWeekend()
	{

		Calendar cal=Calendar.getInstance();
		int dayofweek=cal.get(Calendar.DAY_OF_WEEK);
		if(dayofweek==7 || dayofweek==1)
			return true;
		else
			return false;

	}

	public static void listStations()
	{

		System.out.println("List of Game stations : ");
		for(GameStation s :listOfSatations)
		{
			System.out.println(s.toString());

		}




	}
	
}
