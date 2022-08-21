package ch11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex11_5 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


//        Iterator it = list.iterator();
//
//        while (it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj);
//        }

    }

}
