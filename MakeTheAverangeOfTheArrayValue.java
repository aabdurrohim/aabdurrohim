package BasicJava;

import java.util.Scanner;

public class MakeTheAverangeOfTheArrayValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how much length of array you want : ");
        double n = input.nextInt();
        int array[] = new int[1000];
        double sum = 0;
        for (int i = 1; i <= n ; i++) {
            System.out.println("Enter the " + i + " value : ");
            array[i] = input.nextInt();
            sum = sum + array[i];
        }
        System.out.println("The Sum of all The Array Value is : " + sum);
        //the averange of all number you entered//
        System.out.println("The Averange of "+ sum + "/" + n + " is : " +sum/n);
    }

}
