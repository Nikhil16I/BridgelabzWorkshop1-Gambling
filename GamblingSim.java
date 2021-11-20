package com.Workshop1;

public class GamblingSim {
	
	public static void main(String[] args) {
		//USECASE-2
System.out.println("Welcome to the Game");
		int EVERY_BET=1;     /*Bet per amount*/		
		int STAKE=100;       /*Total Stake amount*/	
		int WINS = (int) (Math.random()*2);
		
		if (WINS==1) {
			   System.out.println("YOU LOSE = $1 dollar");
				STAKE-=EVERY_BET;
			   System.out.println(" Your Current Stake value is = $"+STAKE+" Dollars");
					 /*Player loses and his current Stake Amount*/ 
			   
				}
				
				else {
				System.out.println("YOU WIN ! = $1 dollar");
					 STAKE+=EVERY_BET;
				System.out.println(" Your Current Stake value is = $"+STAKE+" Dollars");
				 /*Player wins and his current Stake Amount*/ 

				}
	}
	  

}