import java.util.* ;

public class _04Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        sc.close() ;

        boolean b = false ;

        for(int i = 0 ; i < s.length()/2 ; i++){

            if(s.charAt(i) == s.charAt(s.length() - i - 1)){
                b = true ;
            }else{
                b = false ;
                break ;
            }
        }

        if(b == true) {
            System.out.println(s+" this String is palindrome") ;
        }else{
            System.out.println(s+" this String is not palindrome") ;
        }
    }
}