package CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set s = new HashSet();
        s.add(100);
        s.add(100);
        s.add(200);
        s.add(null);

        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //System.out.println(s);
    }
}
