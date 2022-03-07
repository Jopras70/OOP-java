/**
 * forum3ex10
 */

import java.util.Scanner;

public class forum3ex10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.print("Input x1: ");
        float x1 = sc.nextFloat(); 
        System.out.print("Input x2: ");
        float x2 = sc.nextFloat();
        System.out.print("Input x3: ");
        float x3 = sc.nextFloat();

        double m = (x1+x2+x3)/3;
        double v = (Math.pow((x1 - m), 2) + Math.pow((x2 - m), 2) + Math.pow((x3 - m), 2)) / 3;
        double sd = Math.sqrt(Math.pow(v, 2));

        System.out.println("Mean: "+ m + "  Varience: "+ v + "  Standard Deviation: "+sd);
        sc.close(); 
    }
}