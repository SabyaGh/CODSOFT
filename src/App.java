import java.util.Random;
import java.util.Scanner;

public class App{
    
	public static void main(String[] args) throws Exception {
            try (Scanner sc = new Scanner(System.in)) {
                Random random = new Random();
                boolean playAgain = true;
                int totalScore = 0;
                
                
                System.out.println("Wellcome To Number Gussing Game...");
                
                while(playAgain)
                {
                    int NumberGenerate = random.nextInt(100)+1;
                    int attempts = 0;
                    int maxAttempts = 7;
                    boolean guessCorectly = false;
                    int guess = 0;
                    
                    System.out.println("You have "+maxAttempts+" attempts To guess the Number...");
                    
                    while(attempts<maxAttempts)
                    {
                        System.out.println("Enter your guess: ");
                        try{
                        guess = sc.nextInt();
                        }
                        catch(Exception e)
                        {
                            System.out.println("Invalid Input, Please Enter a Number");
                            sc.next();
                            continue;
                        }
                        attempts++;
                        
                        if(guess == NumberGenerate)
                        {
                            System.out.println("Correct..! You guess it in "+attempts+" attempts");
                            guessCorectly = true;
                            totalScore +=(maxAttempts - attempts +5);
                            break;
                        }
                        else if(guess>NumberGenerate)
                        {
                            System.out.println("Too High, Try Again");
                        }
                        else
                        {
                            System.out.println("Too Low, Try Again");
                        }
                    }
                    if(!guessCorectly)
                    {
                        System.out.println("!!! You Have Reached Maximum Attempts..");
                        System.out.println("The Number is "+NumberGenerate);
                        totalScore = 0;
                    }
                    System.out.println("Your Score: "+totalScore);
                    
                    System.out.println("Do you want to play again(yes/no)");
                    String respones = sc.next().toLowerCase();
                    playAgain = respones.equals("yes");
                }
                
                System.out.println("Final Score "+totalScore);
                System.out.println("Thank you for playing... Good Bye");
            }		
	}
}
