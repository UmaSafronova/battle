import java.util.Scanner;
public class Task3078{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int l = 1;
        int lmax = 1;
        int d1 = 1;
        int b = in.nextInt();
        if (a != b && b != 0){
            l = 2;
            lmax = 2;
        }
        do{
            if (b == 0){
                break;
            }
            int c = in.nextInt();
            if ((a > b && b > c && c != 0) || (a < b && b < c && c != 0)){
                l++;
                if (l > lmax){
                    lmax = l;
                }
            }
            else{
                if (b != c){
                    l = 2;
                }
                else{
                    l = 1;
                }
            }
            a = b;
            b = c;
            d1 = c;
        }while (d1 != 0);
        System.out.print(lmax);
    }
}
