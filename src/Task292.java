import java.util.Scanner;

public class Task292 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a >= b)
        {
           System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}
