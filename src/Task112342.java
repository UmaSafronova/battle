import java.util.Scanner;
public class Task112342{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr = a.split(" ");
        int n = arr.length;
        int k = 0;
        for (int i = 0; i <= n - 1; i++){
            if (arr[i].length() > 0){
                k++;
            }
        }
        System.out.print(k);
    }
}
