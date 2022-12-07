import java.util.Scanner;
public class Task112340{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr = a.split(" ");
        System.out.print(arr[arr.length - 1]);
    }
}
