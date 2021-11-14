package BasicJava;

import java.util.Scanner;

public class MakeTheAverangeOfTheArrayValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how much length of array you want : ");
        double n = input.nextInt();
        int array[] = new int[1000];//this is the limitation, how many can you entered//
        double sum = 0;
        for (int i = 1; i <= n ; i++) {
            System.out.println("Enter the " + i + " value : ");
            array[i] = input.nextInt();
            //so the program will execute the input as much as the value entered
            //like, "Enter the i( meaning is your first loop = 1 ) value : " --> "Enter the 1 value: ", "Enter the 2 value : " etc till the value of "n"
            sum = sum + array[i]; //the "sum" will sum up of all the array value//  
        }
        System.out.println("The Sum of all The Array Value is : " + sum);//the output of all the sum..
        //the averange of all number you entered//
        System.out.println("The Averange of "+ sum + "/" + n + " is : " +sum/n);
    }

}
