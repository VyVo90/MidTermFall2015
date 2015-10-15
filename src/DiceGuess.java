import java.util.Scanner;
import javax.swing.JOptionPane;

public class DiceGuess {

	public static void main(String[] args) {
		
		Scanner user = new Scanner (System.in);
		
		int rand, min = 1, max = 6, userchoice;
		int i = 1;
		int counturn;
		int odd, even;
		int percentage;
		int pereven, perodd;
		String again;
		String message;
		
		rand = min + (int)(Math.random()*max);
		System.out.print("******Let play the dice game******");
		
		userchoice =Integer.parseInt(JOptionPane.showInputDialog
				("A dice has 6 sides from 1 to 6 dots. How many dots do you get? "));
		do{
			System.out.print(i);
		if (rand == 1)
			System.out.printf("The dice is %d",rand);
		else 
			System.out.printf("The dice is %d",rand);
			
		i++;
		
		message = String.format("%d\n The correct is %d",userchoice, rand);
		JOptionPane.showMessageDialog(null,message);
		} while (i<=max);
	}

}
