package basics;

public class Weather {
	public static void main(String[] args) {
		//This program will give suggestions of what to wear based on the weather (temperature and sun condition)
		 //Using If else statems and &&= and , ||= or, == = equal to
		int temperature = 45;
		String sunCondition = "Overcast"; 
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt.");
		}
		//When you write && (and) then both conditions must be true to print out the lines. 
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a littel cooler. Perhaps wear a long sleeve shirt and jeans.");
			System.out.println("Wear a hat to keep the sun out of your eyes");
		}
//		when you write || this means or  and if either of the statements are correct the ln will print
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day, make sure to wear warmer clothes.");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater.");
		}
		System.out.println("The program is ending");
	}
}
