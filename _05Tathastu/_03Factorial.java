import java.util.* ;

public class _03Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int num = sc.nextInt();
        int mult = 1 ;
        sc.close() ;
        
        for( int i = num ; i > 0 ; i-- ) {
            mult = mult * i ;
        }
        System.out.println(mult) ;
        
    }
}