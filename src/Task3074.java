import java.util.Scanner;
public class Task3074{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int maxk = 1;
        int a = in.nextInt();
        int k = 1;
        int d = 1;
        do{
            int b = in.nextInt();
            d = b;
            if (b == a){
                k++;
            }
            else{
                if (k > maxk){
                    maxk = k;
                }
                k = 1;
            }
            a = b;
        }while (d != 0);
        System.out.print(maxk);
    }
}
