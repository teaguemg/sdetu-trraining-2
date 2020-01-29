package oop;

import java.awt.print.Printable;

import javax.swing.text.AbstractDocument.DefaultDocumentEvent;

//Write a function that takes a value n returns the sum of numbers 1 to n
public class Assignment1 {
	public static void main(String[] args) {
		System.out.println(sum(5));
			
		}
	
	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i; 
		}
		return sum;
}
}







