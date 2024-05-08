package _05_While_Loops.src;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        a=sc.nextInt();
        int first=0 , second =1 , sum;
        sum = first+second ; 
    System.out.print(first+" "+second);{
        
    }
        while (sum<=a) {
            System.out.print(" " +sum+ " ");
            first = second;
            second=sum;
            sum= first+second;                                  

        }
    }
    //TODO print all  Fibonacci number from 1 to 1000
}