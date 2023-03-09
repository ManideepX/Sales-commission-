package org.example;
import com.opencsv.CSVReader;
import java.io.FileReader;
public class readcsvexample
{
    public static void main(String[] args)
    {
        CSVReader reader = null;
        try
        {
            reader = new CSVReader(new FileReader("C:\\Users\\sai.manga\\Desktop\\test.csv"));
            String [] nextLine;
//read one line at a time
            while ((nextLine = reader.readNext()) != null)
            {
                for(String token : nextLine)
                {
                    System.out.print(token+" ");
                }
                System.out.print("\n");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}