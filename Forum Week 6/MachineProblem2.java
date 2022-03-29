import java.util.Scanner;

public class MachineProblem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int NUM_ITEMS; 
        int[] numbers;

        System.out.print("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();

        while (NUM_ITEMS <= 0){
            System.out.println("Invalid (Minimal Input is 0).");
            System.out.print("Enter the number of items: ");
            NUM_ITEMS = sc.nextInt();
            continue;
        } 

        System.out.print("Enter the value of all items (separated by space ) : ");
        numbers = new int[NUM_ITEMS];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("-".repeat(60));
        for (int i = 0; i < numbers.length; i++){
            String index = (i) + ": " ;
            String stars = "*".repeat(numbers[i]);
            String nums = "(" + numbers[i] + ")";
            System.out.println(index + stars + nums);
        }
        System.out.println("-".repeat(60));
        sc.close();
    }
}