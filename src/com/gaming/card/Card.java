package com.gaming.card;
import com.gaming.card.GameUtility;
import com.gaming.card.GameStation;
import com.gaming.card.charge.ChargingStrategy;
public class Card {
	private float initBalance=0.0f;
	private float totalFair=0;
	private boolean isAllowedToTravel=false;
	private boolean isWeekend=false;
	private String cardNumber;
	private GameStation startStation;
	private float recentFair;
	private GameStation endStation;
	private ChargingStrategy chargingStrategey;
	//To issue a new card
	public Card(float _initBalance,ChargingStrategy  _chargingStrategey ) 
	{
		this.chargingStrategey=_chargingStrategey;
		this.initBalance=_initBalance;
		this.cardNumber=GameUtility.generateCardNumber();
				System.out.println("A new card is issued with initail balance "+this.initBalance +" and card number "+cardNumber+"\n");

	}
	
	public boolean isAllowedToTraved()
	{
		if(initBalance<10)
		{
			System.out.println("Game station Use is not allowed to enter due to low balance \n");
			return false;
		}

		else
		{
			isAllowedToTravel=true;
			return true;
		}



	}
	public boolean swipeIn(GameStation _startPoint)
	{
		if(isAllowedToTravel)
		{
			this.startStation=_startPoint;		
			totalFair=0;
			this.isWeekend=GameUtility.isWeekend();
			return true;

		}
		else
		{
			System.out.println("You are not allowed to travel,Minimum balance should be 10 rupees \n)");
			return false;

		}



	}
	public void recharge(Float amount)
	{
		this.initBalance+=amount;
		System.out.println("Card [ "+this.cardNumber+ " ] Succesfully recharge with [ "+amount+ "] ");
		System.out.println("Your total balance is now "+initBalance +"Rupees ");

	}
	public boolean swipeOut(GameStation _endPoint)
	{

		this.endStation=_endPoint;
		int distance=_endPoint.getId()-startStation.getId();
		
		float totalTravelCharge=chargingStrategey.deductBalance(distance);
 

		if(this.initBalance < totalTravelCharge)
		{

			System.out.println("You are not allowed to exit due to ,you have low balance !!\n" +
					"Minimum balance required is "+(totalTravelCharge-initBalance)+" Plesae recharge from counter !!\n");
			return false;	
		}
		else
		{
			this.recentFair=totalTravelCharge;
			this.initBalance-=totalTravelCharge;

			this.isAllowedToTravel=false;
			System.out.println("Thank you for using Gaming Zone ,your current balance is"+initBalance+"\n" );
			return true;

		}



	}
	public float getBalance()
	{
		
		return this.initBalance;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public GameStation getStartStation() {
		return startStation;
	}
	public GameStation getEndStation() {
		return endStation;
	}

	public float getRecentFair() {
		return recentFair;
	}

	
}
