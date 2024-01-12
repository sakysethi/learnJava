package CollectionDemo;

import java.util.*;

public class CursorsDemo {

    public static void main(String[] args) {

//        List list = new ArrayList();
//        list.add(100);
//        list.add("deepak");
//        list.add("Rahul");
//        System.out.println(list);

//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

     //  ListIterator listIterator = list.listIterator();
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }

//        listIterator.next();
      //  listIterator.next();
//                while(listIterator.hasPrevious()){
//                    System.out.println(listIterator.previous());
//                }

//        list.remove("deepak");
//        System.out.println(list);


       // listIterator.add(900);
        //System.out.println(list);

//        listIterator.set("open");
//        System.out.println(list);


        Vector vector = new Vector();
        vector.add(100);
        vector.add("deepak");
        vector.add("Rahul");

        System.out.println(vector);

        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }

}
