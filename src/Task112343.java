import java.util.Scanner;
public class Task112343{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int n = a.length();
        char[] b = a.toCharArray();
        int k = 1;
        for (int i = 0; i <= n - 1; i++){
            if (b[i] != b[n - i - 1]){
                k = 0;
                break;
            }
        }
        if (k == 1){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
