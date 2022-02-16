import java.util.* ;

public class _08MirrorInverse {
    boolean search(int ele , int ind , int[] arr) {
        boolean check = true ;
        for(int i = 0 ; i < ind ; ++i){
            if(arr[i] == ele){
                check = false ;
            }
        }
        return check ;
    }
    public static void main(String[] args) {
        _08MirrorInverse Mi = new _08MirrorInverse() ;

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Length : ") ;
        int length = sc.nextInt() ;
        int[] arr = new int[length] ;
        int index = 0 ;
        int element = 0 ;
        int[] inv = new int[arr.length] ;

        while(index !=length){
            element = sc.nextInt() ;

            if((element < length) && Mi.search(element,index,arr)){
                arr[index] = element ;
                ++index ;
            }
        }

        for(int i = 0 ; i < length ; i++) {
            System.out.print(arr[i]) ;
        }
        System.out.println() ;
        
        for(int i = 0 ; i < arr.length ; i++) {
            int v = arr[i] ;
            inv[v] = i ;
        }

        for(int i = 0 ; i < length ; i++) {
            System.out.print(inv[i]) ;
        }
        sc.close() ;
    }
}