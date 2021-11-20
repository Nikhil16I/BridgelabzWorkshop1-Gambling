package com.Workshop1;

public class GamblingSim {
	
	public static void main(String[] args) {
		//USECASE-4
System.out.println("Welcome to the Game");
		int EVERY_BET=1;     /*Bet per amount*/		
		int STAKE=100; /*Total Stake amount*/	
		
		int STAKERISE=150; /*STAKE value if Wins*/
		int STAKEFALL=50;  /*STAKE value if Loses*/
		
	
		
for( int i =0; i<= 20;i++ )	{	
	STAKE=100;

		while(STAKE >STAKEFALL && STAKE < STAKERISE ) {
			int WINS = (int) (Math.random()*2);

		if (WINS==1) {
			
				STAKE-=EVERY_BET;
					 /*Player loses and his current Stake Amount*/ 
				}
				
				else {
					 STAKE+=EVERY_BET;
				 /*Player wins and his current Stake Amount*/ 
				}
	}
	if (STAKE==STAKERISE) {
		System.out.println("YOU WIN ! ");
		System.out.println(" You Wins at day" +i);
		System.out.println(" Your Current Stake Amount value is = $"+STAKE+" ");
	/*Player Wins Amount at Particular Day*/	
		
	}
	else {
		System.out.println("YOU LOSE ");
		System.out.println(" You Loses  at day "+i);
		System.out.println(" Your Current Stake Amount value is = $"+STAKE+" ");
		/*Player Loses Amount at Particular Day*/	

	}
  }
}
}