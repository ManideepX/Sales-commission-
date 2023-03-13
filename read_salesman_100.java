package org.example;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;
public class read_salesman_100
{
    static HashMap<String,String> mp =new HashMap<>();
    static HashMap<Integer,List<String>> data =new HashMap<>();
    static List<List<String>> salesman_data = new ArrayList<>();
    static List<List<String>> print1()
    {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("C:\\Users\\sai.manga\\Downloads\\salesman_info_100.csv"));
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null)
            {
                List<String> temp =  new ArrayList<String>();
                for (String token : nextLine)
                {
                    temp.add(token);
                }
                salesman_data.add(temp);
                mp.put(temp.get(0),temp.get(3));
                data.put(Integer.parseInt(temp.get(0)),temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return salesman_data;

    }
    public static void main(String[] args)
    {
        System.out.println("sales man info");
        System.out.println(mp);
    }

}