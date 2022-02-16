import java.util.* ;

public class _07ReverseString {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        sc.close() ;
        char[] arr = s.toCharArray() ;

        System.out.print("Reverce String is :") ;
        for (int i = arr.length - 1 ; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }
    }
}