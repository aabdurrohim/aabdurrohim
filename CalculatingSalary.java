//case : calculate the wages of employees working overtime with different classifications, and with different wages

import java.util.Scanner;

public class UpahKerja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); double waktu = 15; int a = 1, b = 2;
        System.out.print("Are you an employee of this company? (enter 1 for yes, 2 for no): ");
        int pegawai = sc.nextInt();
        System.out.println("Work done time = 15.00 pm (24-hour format) overtime limit is 24.00 pm");
        if ( pegawai == a){
            System.out.println("job code, 1 = Foreman, 2 = Technician, 3 = Labor,");
            System.out.print("Enter your employment status code: ");
            int kode  = sc.nextInt();
            if ( kode == 1 ){
                System.out.print("Enter your return time: ");
                double pulang = sc.nextDouble();
                if ( pulang > waktu && pulang <= 24){
                    double gaji = waktu * 30000; //example for hourly foreman salary
                    double jamlembur = pulang - waktu;
                    double upahLembur = jamlembur * 20000 * 75/100;//and if the foreman works overtime, he will get an additional, hourly 20000 + 0,75
                    double total = gaji + upahLembur;
                    System.out.println("You are the foreman, and your income: " + gaji);
                    System.out.println("Total salary and overtime pay : " + total);
                }
                else {
                    System.out.print("you don't work overtime!");
                }
            }
            else if ( kode == 2 ){
                System.out.print("Enter your return time: ");
                double pulang = sc.nextDouble();
                if ( pulang > waktu && pulang <= 24){
                    double gaji = waktu * 20000;//Example for hourly Technician salary
                    double jamlembur = pulang - waktu;
                    double upahLembur = jamlembur * 15000 * 5 / 10;//and if the Technician works overtime, he will get an additional, hourly 15000 + 0,5
                    double total = gaji + upahLembur;
                    System.out.println("You are a Technician  your income: " + gaji);
                    System.out.println("Total salary and overtime pay : " + total);
                }
                else {
                    System.out.print("you don't work overtime!");
                }
            }
            else if ( kode == 3 ){
                System.out.print("Enter your return time: ");
                double pulang = sc.nextDouble();
                if ( pulang > waktu && pulang <= 24){
                    double gaji = waktu * 10000;//Example for hourly labor salary
                    double jamlembur = pulang - waktu;
                    double upahLembur = jamlembur * 10000 * 3 / 10;//and if the labor works overtime, he will get an additional, hourly 10000 + 0,3
                    double total = gaji + upahLembur;
                    System.out.println("You are Labor your income: " + gaji);
                    System.out.println("Total salary and overtime pay : " + total);
                }
                else {
                    System.out.print("you don't work overtime!");
                }
            }
        }
        else {
            System.out.print("you are not an employee");
        }
    }
}



