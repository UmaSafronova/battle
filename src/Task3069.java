import java.util.Scanner;
public class Task3069{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int d = 1;
        int k = 0;
        int a = in.nextInt();
        do{
            int b = in.nextInt();
            if (b > a){
                k++;
            }
            d = b;
            a = b;
        }while (d != 0);
        System.out.print(k);
    }
}
