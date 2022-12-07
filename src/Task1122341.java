import java.util.Scanner;
public class Task1122341{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr = a.split(" ");
        String s = arr[0];
        int k = s.length();
        for (int i = 0; i <= arr.length - 1; i++){
            if (arr[i].length() > k){
                k = arr[i].length();
                s = arr[i];
            }
        }
        System.out.println(s);
        System.out.println(k);
    }
}
