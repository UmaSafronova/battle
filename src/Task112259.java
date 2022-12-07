import java.util.Scanner;
public class Task112259{
    static Scanner in = new Scanner(System.in);
    public static void f(int a){
        if (a != 0){
            int b = in.nextInt();
            f(b);
            System.out.print(a + " ");
        }
        else{
            System.out.print(" ");
        }
    }
    public static void main(String[]args){
        int a = in.nextInt();
        f(a);
    }
}
