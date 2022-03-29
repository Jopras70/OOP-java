import java.util.Scanner;
import java.util.Arrays;


public class MachineProblem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arsize;
        System.out.print("Enter the number of item: ");
        arsize = sc.nextInt();
        while (arsize < 0) {
            System.out.println("You should input the size of the array more than 0 : ");
            arsize = sc.nextInt();
        }
        int num[] = new int[arsize];
        System.out.println("Input array (seperate with space) ");

        for (int x = 0; x < num.length; x++) {
            System.out.printf("Enter the value/s [%d]: ", x);
            num[x] = sc.nextInt();
        }
        System.out.println("The values of your array are: " + Arrays.toString(num));
        sc.close();
    }
};