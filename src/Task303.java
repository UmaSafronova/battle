import java.util.Scanner;
public class Task303{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 10 == 0 || n % 10 == 5 || n % 10 == 6 || n % 10 == 7 || n % 10 == 8 || n % 10 == 9 || n / 10 == 1){
            System.out.println(n + " korov");
        }
        if (n % 10 == 1 && n / 10 != 1){
            System.out.println(n + " korova");
        }
        if ((n % 10 == 2 || n % 10 == 3 || n % 10 == 4) & n / 10 != 1){
            System.out.println(n +" korovy");
        }
    }
}
