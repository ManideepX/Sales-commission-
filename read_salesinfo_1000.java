package org.example;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class read_salesinfo_1000 {
    static HashMap<String,List<String>> mp =new HashMap<>();
    static List<List<String>> sales_info = new ArrayList<>();
    static List<List<String>> print2()
    {
        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("C:\\Users\\sai.manga\\Downloads\\sales_info_1000.csv"));
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null)
            {

                List<String> temp =  new ArrayList<String>();
                for (String token : nextLine) {
                    temp.add(token);
                }
                mp.put(temp.get(3),temp);
                sales_info.add(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sales_info;
    }
    public static void main(String[] args)
    {
        System.out.println("sales info");
        System.out.println(sales_info);
    }
}