import java.util.Scanner;

public class forum3ex14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt(); 
        while(sec<=0){
            System.out.print("Invalid input, Minimum input is 1, please reinput : ");
            int reSec = sc.nextInt();
            sec = reSec;
        }

        int hr = sec/3600;
        int min = (sec % 3600) / 60;
        int s = (sec % 3600) % 60;

        if(sec>1){
            System.out.println("The converted time are :"+"\n"+"Hour(s) : " + hr + "\n" + "Minute(s) : " + min + "\n" + "Second(s) : " + s);
        } else if(sec == 1){ 
            System.out.println("The converted time are :"+"\n"+"Hour(s) : " + hr + "\n" + "Minute(s) : " + min + "\n" + "Second(s) : " + s);
        } 

        sc.close();
    }
}
