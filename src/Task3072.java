import java.util.Scanner;
public class Task3072{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int k = 0;
        int d = 1;
        int max = 0;
        do{
            int n = in.nextInt();
            d = n;
            if (n == max){
                k++;
            }
            if (n > max){
                k = 1;
                max = n;
            }
        }while (d != 0);
        System.out.print(k);
    }
}
