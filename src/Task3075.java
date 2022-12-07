import java.util.Scanner;
public class Task3075{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int a = 1;
        int b = 1;
        int n = 2;
        int s = a + b;
        while (b < k){
            s = a + b;
            a = b;
            b = s;
            n++;
        }
        if (b == k){
            System.out.print(n);
        }
        else{
            System.out.print(-1);
        }
    }
}
