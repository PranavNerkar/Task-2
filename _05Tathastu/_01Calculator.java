import java.util.* ;

public class _01Calculator {
    public static void main(String[] args) {
        int num1,num2 ;
        char sym ;
        int operation ;
        Scanner sc = new Scanner(System.in) ;
        num1 = sc.nextInt() ;
        num2 = sc.nextInt() ;
        sc.nextLine() ;
        sym = sc.nextLine().charAt(0) ;
        sc.close() ;

        switch(sym) {
            case '+' :
                operation = num1 + num2 ;
                System.out.println("Num1 + Num2 = "+operation) ;
                break ;

            case '-' :
                operation = num1 - num2 ;
                System.out.println("Num1 - Num2 = "+operation) ;
                break ;

            case '*' :
                operation = num1 * num2 ;
                System.out.println("Num1 * Num2 = "+operation) ;
                break ;

            case '/' :
                operation = num1 / num2 ;
                System.out.println("Num1 / Num2 = "+operation) ;
                break ;

            default :
                System.out.println("Enter Valid Operator") ;
                break ;
        }
    }
}
