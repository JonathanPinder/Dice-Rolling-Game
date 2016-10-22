// Jonathan Pinder, Homework 5
import java.util.Scanner;
public class ICalledYou {
	public static void main(String args[]){
		int x;
		x = equation_product();
		System.out.println("The product is " + x);
		
		int u;
		u = equation_max();
		System.out.println("The max of the two given values is " + u);
		
	}
		public static int equation_product (){ 
//1)Reads in two numbers from user input and calculate the 
//product of this two number then print out the result. 			
			Scanner scan = new Scanner(System.in);
			System.out.println("Give two values to find their product: ");
			int a,b;
			a = scan.nextInt();
			b = scan.nextInt();
			
			int y = (a*b);
			 return y;
			
		
	}
		public static int equation_max(){
			//2)Reads in two numbers from user input then print out the greater one. 
			//You could use max() function from Math class 
			Scanner scan = new Scanner(System.in);
			System.out.println("Give two numbers to find the max of the two: ");
			int r,s;
			r = scan.nextInt();
			s = scan.nextInt();
			
			int t = Math.max(r,s);
				return t;
		}
}
