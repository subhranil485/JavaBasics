package _04_if.src;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
		
		int a,b,c,temp,larg;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter ithe 1st no: ");
		a = sc.nextInt();
		System.out.println("Enter ithe 2nd no: ");
		b = sc.nextInt();
		System.out.println("Enter ithe 3rd no: ");
		c = sc.nextInt();
		if (a>b && a>c) 
			{
			System.out.println("The largest no. is: "+a);
			}
		else if (b>c && b>a) {
			System.out.println("The largest no. is: "+b);
			} 
		else if (c>a && c>b) {
			System.out.println("The largest no. is: "+c);	
		}
	
	}
	
}
/*		Take three numbers from the user and print the greatest number. Go to the editor
		Test Data
		Input the 1st number: 25
		Input the 2nd number: 78
		Input the 3rd number: 87
		Expected Output :
		The greatest: 87*/
