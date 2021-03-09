package com.gaming.card.charge;
import com.gaming.card.GameUtility;
public class WeekendStrat implements ChargingStrategy{
	@Override
	public float deductBalance(int distance) {
		float totalTravelCharge=0.0f;
		if(GameUtility.isWeekend())
		{
			 totalTravelCharge=(float)(distance*10) ;
			
		}
		else
		{
			 totalTravelCharge=(float)(distance*20 );
			
		}
		return totalTravelCharge;
	}

}
