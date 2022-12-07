import java.util.Scanner;
public class Factorization{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 2;
        while (i <= n){
            if (n % i == 0){
                if (i == n){
                    System.out.print(i);
                }
                else{
                System.out.print(i + "*");}
                n = n / i;
            }
            else{
                i++;
            }
        }
    }
}
