package oop;

import javax.imageio.ImageTypeSpecifier;

import org.omg.PortableInterceptor.AdapterManagerIdHelper;

public class Assignment3 {

	public static void main(String[] args) {
		// Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
		//Hint: this should be static functions with a return type of the same data type as the array declaration.
		int[] age = {32,2,12,14,22,41};
	
		System.out.println("Minimun age is " + youngestChild(age));
		System.out.println("Max age is " + oldestChild(age));
		System.out.println("Average age is " + avgAge(age, 6 ));
	}
	public static int youngestChild (int[] age) {
		int youngestChild = age[0];
		for (int i=1; i<age.length;i++) {
			if(age[i] < youngestChild) {
				youngestChild = age[i];
			}
		}
		return youngestChild;
	}
	
	public static int oldestChild (int[] age) {
		int oldestChild = age[0];
		for (int i=1; i<age.length;i++) {
			if(age[i] > oldestChild) {
				oldestChild = age[i];
			}
		}
		return oldestChild;
	}
	
	public static double avgAge (int age[], int n) {
		int average = 0;
		for (int i=0; i<n;i++) 
			average += age[i];
			
		
		return average/n;
	}
	
	/*//Find minimum (lowest) value in array using array sort
	public static int minValue(int[] numbers){
	  Arrays.sort(numbers);
	  return numbers[0];
	}
	//Find maximum (largest) value in array using array sort
	public static int maxValue(int[] numbers){
	  Arrays.sort(numbers);
	  return numbers[numbers.length-1];
	}
*/
}
