import java.util.Scanner;

public class DiceGuess {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int computerdice;
		int player = 0;
		String playerguess;
		
		
		System.out.println("******Welcome to guess odd or even dice******");
		
			System.out.println("Player throw a dice !!!");
			computerdice = 0 + (int) (Math.random() * 6);
			System.out.print("please guess the number is odd or even: ");
			playerguess = input.next();
			// 1= odd,0= even;
			if (playerguess.toLowerCase().equals("odd"))
				player = 1;
			else if (playerguess.toLowerCase().equals("even"))
				player = 0;
			System.out.println("Number of the dice is :" + computerdice);
			
		}

	}


