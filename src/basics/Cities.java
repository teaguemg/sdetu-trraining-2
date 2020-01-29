package basics;

public class Cities {

	public static void main(String[] args) {
		//Declare and define an array implicately 
		String[] cities = {"New York", " San Fransico", " Miami", " Dallas"};
		System.out.print(cities [0]);
		System.out.print(cities [1]);
		System.out.print(cities [2]);
		System.out.print(cities [3]);
		
		
		
		//Declare array
		String[] countries;
				
		//Define the array
		countries = new String[3];
		countries[0]= " USA";
		countries[1]= " Canada";
		countries[2]= " UK";
		System.out.println(countries[1]);
		
		System.out.println("***************");
		
		
		//Declare & define the array (only size) explicately 
				String[] states = new String[5];
				states[0] = " California";
				states[1] = " Ohio";
				states[2] = " New Jersey";
				states[3] = " Texas";
				states[4] = " Utah";
				int i = 0; 
				
				//Do loop enters the loop THEN test the condition
				do {
				System.out.println("State " + states[i]);
				 i = i + 1;
				}
				while (i < 5);
				
	//While loop: test the condition first then enters the loop
				 int n = 0; 
				boolean stateFound = false; 
				while(!stateFound) {
					String state = states[n];
					if (state == "Texas") {
						System.out.println("STATE FOUND!");
						stateFound = true;
					}					
					n++; 
					
					
				}
				System.out.println("\nPrinting with for loop");
				//For loop is best structure for intergrating through an array
				for (int x = 0; x < 5; x++) {
					System.out.println(states[x]);
				}
					
	}
				
	//
		
	}


