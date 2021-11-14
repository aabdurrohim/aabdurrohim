package BasicJava;

import java.util.Scanner;

public class MakeTheSumOfTheArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the lenght of the Array : ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            System.out.print("+" + i);
            sum = sum + i;
        }
        System.out.println("");
        System.out.println("The lenght of the array is : " + n);
        System.out.println("The Sum of The Value of all The Array is : " + sum);
    }
}
