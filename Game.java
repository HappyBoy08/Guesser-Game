# Guesser-Game
//This is a Fun Guesser Game App

import java.util.Scanner;
class Guesser
{
	int gnum();                                                                                           
	
	
	int guessingNum()
	{
		System.out.println("Guesser,Kindly guess a number..!");
		Scanner sc=new Scanner(System.in);
        gnum=scan.nextInt();
        return gnum;
	}
	
}
	
class Player
	{
		int pnum();
		
		int PredictingNum()
		{
			System.out.println("Player,Kindly Predict a number...!");
			Scanner sc=new Scanner(System.in);
			pnum=scan.nextInt();
			return pnum;
		}
		
    }
    
class Umpire
  {
    	int numFromGuesser();
    	int numFromPlayer1();
    	int numFromPlayer2();
    	int numFromPlayer3();
    	
    	void CollectNumFromGuesser()
    	{
    		Guesser g=new Guesser();
    		numFromGuesser=g.Guessernum();
    	}
    	void CollectNumFromPlayers()
    	{
    		Player P1=new Player();
    		Player P2=new Player();
    		Player P3=new Player();
    		numFromPlayer1=P1.PredictingNum();
    		numFromPlayer2=P2.PredictingNum();
    		numFromPlayer3=P3.PredictingNum();
    	}
    	void compare()
    	{
    		if(numFromPlayer 1 ==numFromGuesser)
    		{
    			System.out.println("Player 1 has won the game...!");
    		}
    		
    		else if(numFromPlayer 2 ==numFromGuesser)
    		{
    			System.out.println("Player 2 has won the game...!");
    		}
    		
    		else if(numFromPlayer 3 ==numFromGuesser)
    		{
    			System.out.println("Player 3 has won the game...!");
    		}
    		
    		
    		else
    		{
    			System.out.println("Guesser lost. Try Again...!");
    		}
    	 }
  }  
    class GuesserGameApp
    {
    	public static void main(String[] args)
    	{
    		Umpire u= new Umpire();
    		u.CollectNumFromGuesser();
    		u.CollectNumFromPlayers();
    		u.Compare();
    	}
    }
//output: 
// Guesser,Kindly guess a number..!: 
// 8
// Player,Kindly Predict a number...!:
// 5
// Player,Kindly Predict a number...!:
// 4
// Player,Kindly Predict a number...!:
// 8
// Player 3 has won the game...!
