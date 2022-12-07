import java.util.Scanner;
public class Task262{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println((c * 100 + d - a * 100 - b) / 100 + " " + (c * 100 + d - a * 100 - b) % 100);
    }
}
