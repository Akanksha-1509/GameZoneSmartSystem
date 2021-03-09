package com.gaming.card;


import com.gaming.card.charge.ChargingStrategy;

public class CardFact {
	private static CardFact instance;
	private ChargingStrategy chargSt;
	private CardFact(ChargingStrategy _chargingStrategy)
	{
          chargSt=_chargingStrategy;

	}
	public static CardFact getInstance(ChargingStrategy chst)
	{
		if(instance==null)
			instance=new CardFact(chst);
		return instance;

	}
	
	
	public Card IssueACard(float initailAmount)
	{
		
		return new Card(initailAmount,this.chargSt);
		
		
	}


}
