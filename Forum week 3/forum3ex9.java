import java.util.Scanner;

public class forum3ex9 {
   public static void main(String[] args) {

       Scanner sc = new Scanner (System.in);
       System.out.print("Input the temperature (°C) : "); 
       float c = sc.nextFloat(); 
       float f = (c/5*9) + 32; 
       System.out.print("The temperature in fahrenheit is : " + f);

       sc.close(); 
   }
}
