package com.gaming.card;
import java.text.*;
import java.util.*;

import com.gaming.card.CardFact;
import com.gaming.card.GameSapientSimulator;
import com.gaming.card.charge.WeekendStrat;

public class testcheck {
	public static void main(String args[])
	{
		
		GameSapientSimulator sap=new GameSapientSimulator();
		CardFact cardFacrtory=CardFact.getInstance(new WeekendStrat());
	    System.out.println("Creating a card with initail balance with 100 rupees");
		Card c4_5=cardFacrtory.IssueACard(100f);
		System.out.println("User1 trying to swipe card at game station number 1 \n");
		boolean isallowed=sap.swipeIn(c4_5, 1);
		
		
		System.out.println("User1 trying to swipe out card at game station number 1 \n");
		 isallowed=sap.swipeOut(c4_5, 2);
		
		 System.out.println("User1 trying to swipe card at game station number 2 \n");
		 isallowed=sap.swipeIn(c4_5, 2);
			
		 System.out.println("User1 trying to swipe card at game station number 2 \n");
		 isallowed=sap.swipeOut(c4_5, 3);
			
		 System.out.println("User1 trying to swipe card at game station number 3 \n");
		 isallowed=sap.swipeIn(c4_5, 3);
			
		 System.out.println("User1 trying to swipe card at game station number 3 \n");
		 isallowed=sap.swipeOut(c4_5, 4);
		
		 System.out.println("User1 trying to swipe card at game station number 4 \n");
		 isallowed=sap.swipeIn(c4_5, 4);
			
		 System.out.println("User1 trying to swipe card at game station number 4 \n");
		 isallowed=sap.swipeOut(c4_5, 5);
		
		 System.out.println("User1 trying to swipe card at game station number 5 \n");
		 isallowed=sap.swipeIn(c4_5, 5);
			
		 System.out.println("User1 trying to swipe card at game station number 5 \n");
		 isallowed=sap.swipeOut(c4_5, 6);
		
		 System.out.println("User1 trying to swipe card at game station number 6 \n");
		 isallowed=sap.swipeIn(c4_5, 6);
			
		 System.out.println("User1 trying to swipe card at game station number 6 \n");
		 isallowed=sap.swipeOut(c4_5, 7);
		 c4_5.recharge(30f);

		 System.out.println("User1 trying to swipe card at game station number 7 \n");
		 isallowed=sap.swipeIn(c4_5, 7);
			
		 System.out.println("User1 trying to swipe card at game station number 7 \n");
		 isallowed=sap.swipeOut(c4_5, 8);
		
		 System.out.println("User1 trying to swipe card at game station number 8 \n");
		 isallowed=sap.swipeIn(c4_5, 8);
			
		 System.out.println("User1 trying to swipe card at game station number 8 \n");
		 isallowed=sap.swipeOut(c4_5, 9);
		
		/*System.out.println("Created a card with initail balance with 50 rupees");
		Card c50=cardFacrtory.IssueACard(50f);
		System.out.println("User2 trying to swipe card at game station number 2");
		isallowed=sap.swipeIn(c50, 2);
		System.out.println("User2 trying to exit card at game station number 4\n");
		isallowed=sap.swipeOut(c50, 4);
		
	
		
		System.out.println("User2 trying to swipe card at game station number 4");
		isallowed=sap.swipeIn(c50, 4);
		System.out.println("User2 trying to exit card at game station number 10\n");
		isallowed=sap.swipeOut(c50, 10);
	    c50.recharge(30f);*/
	    sap.showSwapInOut(" G4\n");
		
		
		System.out.println("showing log");
		sap.showLogs(c4_5.getCardNumber());
		
		
         	    
	     
	
	
	}


}
