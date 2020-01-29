package basics;

public class Days {
	public static void main(String[] args) {
		//Execute different bloc of code based on the value of a condition
		//Switch Block, In a switchblock once the run finds a true statement everything after it will also print becasue its in the same block.  You can use Break to make it only print once the statement is true. 
		
		String dayOfWeek = "Tuesday"; 
		
		switch (dayOfWeek) {
		case "Monday" : 
			System.out.println("Today is Monday");
			break;
		case "Tuesday" : 
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday" :
			System.out.println("Today is Wednesday");
			break;
		case "Thursday" : 
			System.out.println("Today is Thursday");
			break;
		case "Friday" : 
			System.out.println("Today is Friday");
			break;
		}
		
	}
}
