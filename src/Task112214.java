import java.util.Scanner;
public class Task112214{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n % 10;
        int k = 1;
        int j = 0;
        while (n / k != 0){
            if ((n % (k * 10)) / k == n % (k * 100) / (k * 10)){
                j += 1;
            }
            k *= 10;
        }
        if (j == 0){
            System.out.print("NO");
        }
        else{
            System.out.print("YES");
        }
    }
}
