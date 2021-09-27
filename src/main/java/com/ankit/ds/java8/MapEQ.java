package com.ankit.ds.java8;

import java.util.HashMap;
import java.util.Map;

class ToDos {

    String day;
    ToDos(String d) { day = d; }

    @Override
    public boolean equals(Object o) {

        return ((ToDos)o).day == this.day;
    }

    @Override
    public int hashCode() {
        return 9;
    }
}

public class MapEQ {



    public static void main(String[] args) {
        Map<ToDos, String> m = new HashMap<ToDos, String>();
        ToDos t1 = new ToDos("Monday");
        ToDos t2 = new ToDos("Monday");
        ToDos t3 = new ToDos("Tuesday");

        System.out.println(t1.equals(t2));
        m.put(t1, "doLaundry");
        m.put(t2, "payBills");
        m.put(t3, "cleanAttic");
        System.out.println(m.size());

        m.forEach((k,v) -> System.out.println("Key: " +k + "Value :" +v));
    }
}
