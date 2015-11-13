import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class HashMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();

        map.put("a", 1);
        map.put("Dosmos", 1);
        map.put("Taban", 3);
        map.put("Test", 2);
        map.put("b", 34);

        System.out.println("Before removal");
        for( String s : map.keySet() ) {
            System.out.println( s );
        }

        System.out.println("\n\nAfter removal");
        
        
        Iterator<Map.Entry<String,Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,Integer> entry = iter.next();
//            if("taban".equalsIgnoreCase(entry.getValue())){
//                iter.remove();
//            }
            if( entry.getValue()  > 1  &&  entry.getValue()  < 4){
                iter.remove();
            }
        }
        
        for( String s : map.keySet() ) {
            System.out.println( s );
        }
    }
}