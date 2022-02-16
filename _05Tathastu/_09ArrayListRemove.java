import java.util.* ;

public class _09ArrayListRemove {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>() ;
        al.add("Aanpa") ;
        al.add("Vedya") ;
        al.add("Ash ya") ;
        al.add("Dhanya") ;
        al.add("Sac hya") ;
        al.add("Omya") ;

        System.out.println(al) ;
        
        Iterator itr = al.iterator() ;
        while(itr.hasNext()) {
            String st = (String)itr.next() ;
            while(st.contains(" ")) {
                itr.remove() ;
            }
        }
        System.out.println(al) ;
    }
}