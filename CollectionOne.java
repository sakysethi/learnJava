package CollectionDemo;

import java.util.*;

public class CollectionOne {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add("deepak");
        al.add('c');
        System.out.println(al.add("abc"));

        HashSet hs = new HashSet();
        hs.add("rahul");
        hs.add(20);
        hs.add(true);

        List l1 = new ArrayList();
        List l2 = new LinkedList();

       // List h1 = new HashMap();
    }
}
