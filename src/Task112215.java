import java.util.Scanner;
public class Task112215{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 1;
        int i = 0;
        while (n / (k * 10) != 0){
            if ((n % (k * 10) / k) != (n % (k * 100) / (k * 10))){
                i = 1;
                break;
            }
            k *= 10;
        }
        if (i == 0){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
