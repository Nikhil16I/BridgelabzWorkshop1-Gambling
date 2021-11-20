package com.Workshop1;

public class GamblingSim {
	
		//USECASE-6
		final int EVERY_BET=1;     /*Bet per amount*/		
		int STAKE=100; /*Total Stake amount*/	
		int PLUS= 0;
		
		final int STAKERISE=150; /*STAKE value if Wins*/
		final int STAKEFALL=50;  /*STAKE value if Loses*/
		int RISE=0;int FALL=0;
		int GAIN=0;    //Maximum Stake Gain 
		int REDUCE=0;  //Minimum Stake Lose
		int LUCKYDAY=0;int UNLUCKYDAY =0;
				
	
		public void Turn () {
			
			//System.out.println("Welcome to the Game");		
		int WINS = (int) (Math.random()*2);
		if (WINS==1) {
			STAKE+=EVERY_BET;
			RISE++;
			/*Player wins */ 
		}
		else {
			STAKE-=EVERY_BET;
			FALL++;
			/*Player loses */ 
	}
}
			
public void StakeStatus() {				
		while(STAKE>STAKEFALL && STAKE<STAKERISE ) {
			Turn();
		}
	if (STAKE==150) {
		PLUS+= 50;
		System.out.println(" And Congratulation YOU WIN ! $50 today");
		System.out.println(); //SPACE
		//System.out.println(" Your Current Stake Amount value is = $"+STAKE);
		/*Player Loses Amount at Particular Day*/	
	}
	else {
		PLUS-= 50;
		System.out.println("And ohh! Today YOU LOSE $50  Best luck Next time");
		System.out.println();// SPACE
		//System.out.println(" Your Current Stake Amount value is = $"+STAKE);
		/*Player Wins Amount at Particular Day*/		

	}
 }
public void Monthstatus() {
			for( int i =0; i<= 30;i++ )	{ /*Month Status*/
				StakeStatus();
			if(RISE>GAIN) {
				GAIN = RISE;
			LUCKYDAY = i+1;//Defining Lucky Status
			}
		    if (FALL>REDUCE) {
		    	REDUCE=FALL;
		    UNLUCKYDAY=	i-1;//Defining Unlucky Status
		    }
RISE =0;
FALL =0;
            if(PLUS>=0)
            	System.out.println(" You Won at day " + i +" with $"+PLUS);
            else
            	System.out.println("You Lost at day "+i+" with $"+PLUS);
		STAKE=100;
						
   }
	  System.out.println();//SPACE
System.out.println("Defining your Lucky Unlucky status - ");			
System.out.println(" You won ="+GAIN+ "$ at this Day");
System.out.println("For you Luckyday was -> DAY "+LUCKYDAY);
			/*Defining Day and Lucky Unlucky Status*/
System.out.println("");//SPACE
System.out.println(" You Lose =" +REDUCE+ "$ at this Day");
System.out.println("For you Unluckyday was -> DAY "+UNLUCKYDAY);
   }

 }
