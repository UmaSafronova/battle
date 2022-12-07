import java.util.Scanner;
public class Task112191{
    public static int f(int a){
        int s = 0;
        if (a != 0){
            while (a > 0){
                a = a / 10;
                s++;
            }
            return s;
        }
        else{
            return 1;
        }
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print(f(a));
    }
}
