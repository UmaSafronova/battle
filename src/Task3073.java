import java.util.Scanner;
public class Task3073{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int k = 0;
        int s = 0;
        do{
            int n = in.nextInt();
            if (n == 0){
                k++;
            }
            else{
                k = 0;
            }
            s += n;
        }while(k < 2);
        System.out.print(s);
    }
}
