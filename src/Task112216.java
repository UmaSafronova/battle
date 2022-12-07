import java.util.Scanner;
public class Task112216{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 1;
        int j = 0;
        while (n / (k + 2) != 0){
            int i = (n % (k * 10)) / k;
            int k1 = k * 10;
            while (n / k1 != 0){
                if ((n % (k1 * 10) / k1) == i){
                    j = 1;
                    break;
                }
                k1 *= 10;
            }
            if (j == 1){
                break;
            }
            k *= 10;
        }
        if (j == 1){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
