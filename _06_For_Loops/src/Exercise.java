package _06_For_Loops.src;



public class Exercise {
    public static void main(String[] args){
        System.out.println("----------------------------------------------------------");
        for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                        System.err.print("*");
                }
                System.err.println();
        }
        System.out.println("----------------------------------------------------------");
        int num=1;
        for (int k = 1; k <= 4; k++) {
                for (int l = 1; l <= k; l++,num++) {
                        System.err.print(" "+ num*num*num);
                }
                System.err.println();
        }
    }
         
       /*P

       Print the following patterns

1.
*
* *
* * *
* * * *
* * * * *

2.

1
8 27
64 125 216
349 512 728 1000



        */
    
}