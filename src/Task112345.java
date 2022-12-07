import java.util.Scanner;
public class Task112345{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] b = a.toCharArray();
        int n = a.length();
        for (int i = 0; i <= n - 1; i++){
            if (b[i] != '\\'){
                System.out.print(b[i]);
            }
            else{
                System.out.println("");
            }
        }
    }
}
