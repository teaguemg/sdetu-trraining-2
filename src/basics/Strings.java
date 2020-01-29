package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")){
			System.out.println("The browswer is chrome");
		}
		String firstName = "Mack";
		String lastName = "Teague"; 
		String SSN = "123456788";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN");
		
		//print initials plus last 4 of SSN
		System.out.print(firstName.substring(0,1)); 
		System.out.print(lastName.substring(0,1));
		System.out.println(SSN.substring(5));
				
	}

}
