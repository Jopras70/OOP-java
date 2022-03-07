import java.util.Scanner;
import java.lang.Math;

/**
 * forum3ex13,
 */
public class forum3ex13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a : ");
        double a = sc.nextDouble(); 
        while(a == 0){ 
            System.out.print("a cannot be 0! Please reinput a : ");
            double reinputA= sc.nextDouble();
            a = reinputA;
        }
        System.out.print("Enter coefficient b : ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c : ");
        double c = sc.nextDouble();

        double D = (Math.pow(b,2) - (4*a*c));

        if(D > 0){ 
            double x1 = ((-b+Math.pow(D,0.5))/(2*a)); 
            double x2 = ((-b-Math.pow(D,0.5))/(2*a));
            System.out.println("Found 2 x values! x1 = " + String.format("%.2f", x1) +" and x2 = " + String.format("%.2f", x2));

        } else if(D == 0) {
            double x = (-b/2*a);
            System.out.println("Found 1 x value! x = " + String.format("%.2f", x));

        } else if (D < 0) { 
            System.out.println("No real solution found, because this equation resulted in imaginary roots. ");
        }   
        
        sc.close();
    }
}