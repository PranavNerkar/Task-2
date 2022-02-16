import java.util.* ;

public class _10Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("How many Rows : ") ;
        int r = sc.nextInt() ;

        System.out.println("How many Column : ") ;
        int c = sc.nextInt() ;

        int[][] arr = new int[r][c] ;

        System.out.println("Total no. of Elements You Have to Enter : "+r*c) ;
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++){
                arr[i][j] = sc.nextInt() ;
            }
        }

        System.out.println("Mtrix is : ") ;
        for(int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++){
                System.out.print(arr[i][j]+" ") ;
            }
            System.out.printf("\n\n") ;
        }

        System.out.println("Transpose is : ") ;
        for(int i = 0 ; i < c ; i++) {
            for(int j = 0 ; j < r ; j++){
                System.out.print(arr[j][i]+" ") ;
            }
            System.out.printf("\n\n") ;
        }
        sc.close() ;
    }
}