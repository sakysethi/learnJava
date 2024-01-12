package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(10);
        l.add(10);
        l.add(20);
        l.add(3,20);
        l.add(null);

        Iterator itr = l.iterator();                // elements of list come in iterator
          while(itr.hasNext()){
              System.out.println(itr.next());
            }

        ListIterator litr = l.listIterator();
          while(litr.hasNext()){
              System.out.println(litr.next());
          }



        //System.out.println(l);
    }
}
