package Statistical_Analysis_Project;

import java.io.*;
import java.util.*;

public class Collecting_City_Names {

    public double total_population = 0;
    public double total_AQI = 0;

    public void data_reader_for_cities(String file_name) {
        String file = file_name;
        BufferedReader reader = null;
        String line  = "";

        int counter = 0;

        try {
            reader = new BufferedReader(new FileReader(file));
            for (int i = 0; i < 5; i++) {
                String headerLine = reader.readLine();
            }
            while((line = reader.readLine()) != null) {

                String[] row = line.split(",");

                System.out.println(row[2]);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
