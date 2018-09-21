package main.java.com.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListImpl {

    public static void main(String args[]) {

        CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>();
        threadSafeList.add("Java");
        threadSafeList.add("J2EE");
        threadSafeList.add("Collection");

        // add, remove operator is not supported by CopyOnWriteArrayList iterator
        Iterator<String> itr = threadSafeList.iterator();
        while (itr.hasNext()) {
            System.out.printf("Read from CopyOnWriteArrayList : %s %n", itr.next());
        }
    }
}
