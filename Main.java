package org.example;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        read_salesman_100 obj1 = new read_salesman_100();
        read_salesinfo_1000 obj2 = new read_salesinfo_1000();
        List<List<String>> salesman = new ArrayList<>();
        List<List<String>> salesinfo = new ArrayList<>();
        salesman = (obj1.print1());
        System.out.println(obj1.data);

    }
}


