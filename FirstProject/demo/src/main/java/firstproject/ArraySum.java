package firstproject;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println("hello World");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int sizeOFArray = scan.nextInt();
        System.out.println("Enter the item value in the array:");
        int[] arr = new int[sizeOFArray];
        int total=0;

        for (int i=0;i<sizeOFArray;i++)
        {
            System.out.println("Enter the value for item:"+i);
            arr[i] = scan.nextInt();
            total += arr[i];
            }
        
        System.out.println("total is  "+total);
        scan.close();
    }
}