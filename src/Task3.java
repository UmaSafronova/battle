import java.util.Scanner;
public class Task3{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 0;
        while (n > 1){
            if (n % 2 == 0){
                n = n / 2;
            }
            else{
                n = n / 2 + 1;
            }
            k++;
        }
        System.out.print(k);
    }
}
