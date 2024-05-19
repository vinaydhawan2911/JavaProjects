package firstproject;
import java.util.Scanner;

import firstproject.Helpers.Car;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("hello World");
        Scanner scan = new Scanner(System.in);
     //   System.out.println("Please enter ur name:");
        String sub = scan.nextLine();
        int n = Integer.parseInt(sub);
        for (int i=0;i<n;i++)
        {
            String[] input = scan.nextLine().split(" ");
            Car c = new Car();
            if (input.length ==1){
                c.printTopSpeed();
            }
        }
     //   System.out.println("hello "+sub);
        scan.close();
    }
}