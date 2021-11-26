import java.io.*;
import java.util.Scanner;
public class Saymypersonality {
public static void main(String [] args) {
	System.out.println("Hey!! shall we play a game?? I'll ask your fav no between 1-9 and guess your personality ");

	Scanner scanner = new Scanner(System.in);
	System.out.println("shall we start(yes/no)");
	String yesno = scanner.next();
		if(yesno.equals("yes") ) {
		System.out.println("Well!! I'am preparing to guess your personality");
		int favnumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your favourite number between (1-9): ");
		favnumber = sc.nextInt();
			if(favnumber!= 0 && favnumber==1 )
				System.out.println("Wow you people are always the best in any job\nsometimes pretend to do so..LOL\nYou people think you only have one soulmate in this entire world and do anything for them.\nyou prefer to be single your entire life if not commited.\nyou dont follow the crowd and respect your individuality.\n");
			else if(favnumber==2)
				System.out.println("You people are dicotomous (i.e) if you feel happy now..you believe u'll feel sad after sometime..\nits like this new anirudh's song(two two two) \nyou people play with emotions.\ninterestingly you have double personality.\nYou're a strong believer in your intutions.");
			else if(favnumber==3)
				System.out.println("Three lovers think life's a party\nYou're outgoing and really funny people\nAt the same time you people are strongly  egotistical\nNo human can understand better than you especially when it comes to drama LOL ");
			else if(favnumber==4)
				System.out.println("You people are really reliable at anycost\nyou people are really brave and honest\nyou are stubborn in your decisions");
			else if(favnumber==5)
				System.out.println("You can be very curious and energetic, but that can sometimes lead you to trouble making up your mind.\nyou people are highly excited\nThe most challenging characteristic is your ability to attract or cause drama\n Women nicknamed (drama queen) may be lovers of the number 5.");
			else if(favnumber==6)
				System.out.println("Six lovers are caring and patient.\nyou have lots of ideas u want to share with the world,\n this can make you a little vain or self-righteous.\n you're prone to feeling lonely and therefore clingier in your relationships.");
			else if(favnumber==7)
				System.out.println(" Due to your higher IQ, and can tend to be more impatient and critical of others.\nThe phrase ‘calm, cool, and collected’ may have been coined for a seven.\nHowever you are also very loyal and faithful people, who will stick by you're loved ones in times of crisis.");
			else if(favnumber==8)
				System.out.println("Eight lovers don’t need sevens luck to be successful.\nThey tend to be pretty powerful on their own, and work very hard to get what they want\nyou are very balanced in terms of both personality and mood");
			else if(favnumber==9)			
				System.out.println("Nine lovers use thier talents and abilities effectively which makes them great leaders.\nit is also the number of magic,wisdom and fulfillment\nHowever, you can be moody at times.\nif you favour nine you likely love action and adventure");
			else if(favnumber<0)
				System.out.println("if i had a physical structure like you i would like to have a date with you in that temperature in antartica ");
			else 
				System.out.println("Humans mere humans think they're too intelligent nav... :)\n sometimes they don't read the constraint\n sometime they do wantedly... LOL");
}
		else if(yesno.equals("no")) {
		System.out.println("I gotcha mind voice.. Bye Bye.. :)");	}



}
}