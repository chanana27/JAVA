import java.util.Scanner;

class Guesser{
	int guessNum;
	
	int guessNumFromGuesser(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser guess the number");
		guessNum = scan.nextInt();
		
		return guessNum;
	}
}

class Player{
	int guessNumPlayer;
	
	int guessNumFromPlayer() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Player guess the number");
		guessNumPlayer = scan.nextInt();
		return guessNumPlayer;
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void compare() {
		Guesser obj = new Guesser();
		numFromGuesser = obj.guessNumFromGuesser();
		
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		
		numFromPlayer1 = player1.guessNumFromPlayer();
		numFromPlayer2 = player2.guessNumFromPlayer();
		numFromPlayer3 = player3.guessNumFromPlayer();
		
		if(numFromGuesser == numFromPlayer1) {
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
				System.out.println("All three players have won the game!");
			else if(numFromGuesser == numFromPlayer2)
				System.out.println("Player1 and Player2 have won the game");
			else if(numFromGuesser == numFromPlayer3)
				System.out.println("Player1 and Player3 have won the game");
			else
				System.out.println("Player1 have won the game");
		}
		
		else if(numFromGuesser == numFromPlayer2) {
			if(numFromGuesser == numFromPlayer3)
				System.err.println("Player2 and and Player3 have won the game");
			else
				System.out.println("Player2 have won the game");
		}
		
		else if(numFromGuesser == numFromPlayer3){
			System.out.println("Player3 have won the game");
		}
		
		else
			System.out.println("No one won the game. Try Again!");
	}
}

public class Launchgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire obj = new Umpire();
		obj.compare();

	}
}
