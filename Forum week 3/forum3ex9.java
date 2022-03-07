import java.util.Scanner;

public class forum3ex9 {
   public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("Hello! I am a temperature converter program."+"\n"+"I shall convert any temperature in celcius to fahrenheit."+"\n"+"-----------------------------------------------------------");
       System.out.print("Input the temperature (°C) : "); 
       float celciusTemp = sc.nextFloat(); 
       float fahrenheitTemp = (celciusTemp/5*9) + 32; 
       System.out.println("The converted temperature in fahrenheit is " + String.format("%.2f", fahrenheitTemp) +"°F");

       sc.close(); 
   }
}
