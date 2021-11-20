package com.Workshop1;

public class GamblingSim {
	
		//USECASE-5
		final int EVERY_BET=1;     /*Bet per amount*/		
		int STAKE=100; /*Total Stake amount*/	
		int PLUS= 0;
		
		final int STAKERISE=150; /*STAKE value if Wins*/
		final int STAKEFALL=50;  /*STAKE value if Loses*/
		
	
		public void Turn () {
			//System.out.println("Welcome to the Game");
		
		int WINS = (int) (Math.random()*2);
		if (WINS==1) {
			STAKE+=EVERY_BET;
			/*Player wins */ 
		}
		else {
			STAKE-=EVERY_BET;
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
			for( int i =0; i<= 30;i++ )	{
				StakeStatus();
			if(PLUS >= 0)
		   System.out.println(" You Won at day " +i+" with $"+PLUS);
						/*Day Status Amount*/
		    else 
			System.out.println(" You Lost at day "+i+" with $"+PLUS);
			            /*Day Status Amount*/

		STAKE=100;
						
   }
  }
 }
