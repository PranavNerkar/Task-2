import java.util.Scanner ;

public class _05PermutationCombination {
    public static void main(String[] args) {
        int n , r ,m ;
        int nfact = 1 ;
        int rfact = 1 ;
        int mfact = 1 ;
        float permutation ;
        float combination ;

        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter Values : ") ;
        n = sc.nextInt() ;
        r = sc.nextInt() ;
        m = n-r ;
        
        for( int i = n ; i > 0 ; i-- ) {
            nfact = nfact * i ;
        }

        for( int i = r ; i > 0 ; i-- ) {
            rfact = rfact * i ;
        }

        for( int i = m ; i > 0 ; i-- ) {
            mfact = mfact * i ;
        }

        permutation = (nfact/mfact) ;
        combination = nfact/(rfact*mfact) ;

        System.out.printf("%f\n",permutation) ;
        System.out.printf("%f\n",combination) ;

        sc.close() ;
    }
}