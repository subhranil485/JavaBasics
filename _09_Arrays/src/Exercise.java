package _09_Arrays.src;


public class Exercise {
    public static void main(String[] args) {
        int arr[] ={12 , 4 , 2003 , 5, 55, 58};
        int sum=0;
        for(int i=0 ; i < arr.length ; i++){
            sum = sum+arr[i];  
        }
        System.out.println("The sum is: "+sum);
        System.out.println("The avg is: "+sum/arr.length);
        System.out.println("-----------------------------------------");

        int arr1[] ={12 , 4 , 2003 , 5, 55, 58};
        int arr2[] ={13 , 4 , 2003 , 55, 52, 58};
        for(int i = 0; i <arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
        
}       
    //WAP to find sum and avg of a array
    //Write a Java program to find the common elements between two arrays of integers
