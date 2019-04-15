package Task_7_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMapClass {
    public static void main(String[] args) {


        Set<String> set = new HashSet<String>();
set.add("value");
set.add("value");
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}