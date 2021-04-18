package week3java;

import java .util.Random;
import java.util.Scanner;
public class Dowhile {

	public static void main(String[] args) {
		int a = 100;
		Random rand = new Random();
		
		do {
			a=rand.nextInt(100);
			System.out.println(a);
			Scanner s =new Scanner (System.in);
			System.out.println("Enter number");
			int num = s.nextInt();
			int number=25;
		
			{
				System.out.println("Too higher");
			}
			
		}
		while(a>5);
		
		
		
		
		
		

	}

}
