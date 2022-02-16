import java.util.* ;

public class _02Fibonacchi {
    public static void main(String [] args) {
        int x = 1 ;
        int y = 1 ;
        int num ;
        int n ;

        Scanner sc = new Scanner(System.in) ;
        n = sc.nextInt() ;
        sc.close() ;
        
        System.out.println("Fibonacchi Series is : ") ;
        System.out.println(x) ;
        System.out.println(y) ;

        for(int i = 1 ; i < n ; i++) {
            num = x + y ;
            System.out.println(num) ;
            y = num ;
            x = num - x ;
        }
    }
}