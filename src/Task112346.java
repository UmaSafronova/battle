import java.util.Scanner;
public class Task112346{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr = a.split(" ");
        String[] arr1 = arr[0].split( "");
        String[] arr2 = arr[1].split( "");
        System.out.print(arr[2] + " " + arr1[0] + "." + arr2[0] + ".");
    }
}
