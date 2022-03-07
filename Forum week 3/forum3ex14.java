import java.util.Scanner;

/**
 * forum3ex13,
 */
public class forum3ex14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the seconds to convert : ");
        int seconds = sc.nextInt();
        int hour = seconds / 3600;
        int minutes = (seconds / 60) % 60;
        int sec_left = seconds % 60;

        System.out.print(seconds + " seconds are " + hour + " hour, " + minutes + " minutes, and " + sec_left + " seconds.");
        sc.close();
    }
}