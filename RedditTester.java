import java.util.Scanner;
import java.io.*;

public class RedditTester 
{
	public static void main(String[] args) 
	{	
		RedditReader2 user = new RedditReader2();
		int escape = 0;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What would you like to know more about?\n-Posts\n-Political Parties\n");
		String choice = kb.nextLine().toLowerCase();
		
		if(choice.equals("posts"))
		{
			System.out.println("You chose to learn more about the content of the reddit posts.");
			System.out.println("Are you more interested in:\n-Most upvoted post\n-Most commented post");
			String x1 = kb.nextLine().toLowerCase();
	
			if(x1.equals("most upvoted post"))
				user.getTopScore();
			else if(x1.equals("most commented post"))
				user.getNumComm();
			else
			{
				System.out.println("You did not input a choice. Check your spelling.\nPlease rerun the program");
			}
		}
		else if(choice.equals("political parties"))
		{
			user.getNumberOfDem();
			System.out.println("---------------------------------------------------------");
			user.getNumberOfRep();
			
		}
		else //FIX SO THAT WHILE WORKS
		{
			System.out.println("You did not input a choice. Check your spelling.\nPlease rerun the program");
		}
	}
}
