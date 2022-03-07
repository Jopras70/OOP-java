import java.util.Scanner;

public class forum3ex11 {
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); 
    System.out.print("Input x : "); 
    int x = sc.nextInt();
    System.out.print("Input y : "); 
    int y = sc.nextInt();
    int n; 

    n = x; 
    x = y; 
    y = n; 
    System.out.println("Now x is :"+x + "  and y is:"+y);
    
    sc.close(); 

   } 
}
