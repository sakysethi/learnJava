package CollectionDemo;

import java.util.ArrayList;

public class MethodsCollections {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add("ABC");
        al.add('x');

        System.out.println(al);

        ArrayList alC = new ArrayList();
        alC.add("aaa");
        alC.add("bbb");
        alC.add("ccc");

        System.out.println(alC);

        al.addAll(alC);
        System.out.println(al);


        System.out.println(al.contains("ABC"));
        System.out.println(al.isEmpty());
        System.out.println(al.size());

        al.remove("aaa");
        System.out.println(al);

        al.removeAll(alC);
        System.out.println(al);

        al.clear();
        System.out.println(al);
    }
}
