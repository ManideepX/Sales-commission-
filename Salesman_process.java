package org.example;
import org.example.read_salesinfo_1000;
import org.example.read_salesman_100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Salesman_process
{
    static HashMap<Integer ,Float> SMC = new HashMap<>();
    static HashMap<Integer,Integer> SMS = new HashMap<>();
    public static void main(String[] args)
    {
        read_salesman_100 obj1 = new read_salesman_100();
        read_salesinfo_1000 obj2 = new read_salesinfo_1000();
        List<List<String>> salesman = new ArrayList<>();
        List<List<String>> salesinfo = new ArrayList<>();
        salesman = (obj1.print1());
        salesinfo = (obj2.print2());

        //calculating the total sum of each ----------------------------------------------------------------------------
        for(int i=0;i<salesinfo.size();i++)
        {
            String s = salesinfo.get(i).get(3);
            if(SMS.containsKey(s))
            {
                int p = SMS.get(s) + Integer.parseInt(salesinfo.get(i).get(1))*Integer.parseInt(salesinfo.get(i).get(2));
                SMS.put(Integer.parseInt(s),p);
            }
            else
            {
                SMS.put(Integer.parseInt(s),Integer.parseInt(salesinfo.get(i).get(1))*Integer.parseInt(salesinfo.get(i).get(2)));
            }

        }
        //calculating total commission of each salesman-----------------------------------------------------------------
        for(String i: obj1.mp.keySet())
        {
            String s = obj1.mp.get(i);
            Float f = Float.parseFloat(s);
            SMC.put(Integer.parseInt(i),(f*(SMS.get(Integer.parseInt(i)))/100));
        }
        //printing total amount and total commission
        System.out.println("salesman-id  salesman total sum  salesman commission");
        for(int i: SMS.keySet())
        {
            System.out.println(i+" "+obj1.data.get(i).get(1)+" "+SMS.get(i)+" "+SMC.get(i)+" "+obj1.data.get(i).get(2));
        }
    }

}
