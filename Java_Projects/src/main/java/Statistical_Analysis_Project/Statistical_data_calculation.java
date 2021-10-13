package Statistical_Analysis_Project;

import java.io.*;
import java.util.*;

public class Statistical_data_calculation {

    public double total_population = 0;
    public double total_AQI = 0;


    public Statistical_data_calculation() {
        System.out.println("hi");
    }

    public void data_reader_for_population(String file_name) {

        String file = file_name;
        BufferedReader reader = null;
        String line  = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            for (int i = 0; i < 17; i++) {
                String headerLine = reader.readLine();
            }
            while((line = reader.readLine()) != null) {

                String[] row = line.split(",");
                if (row[22] != "") {
                    row[22] = row[22].replace(" ","");
                    total_population = total_population + Double.parseDouble(row[22]);
                }
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
        total_population = total_population * 1000;
        //System.out.printf("%.2f", total_population);
        //System.out.println();

    }

    public void data_reader_for_AQI(String file_name) {
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
                if (row[2].equals("Washington D.C.") && row[7] != "") {
                    row[7] = row[7].replace(" ","");
                    total_AQI = total_AQI + Double.parseDouble(row[7]);
                    counter++;
                }
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
        System.out.printf("%.2f", total_AQI);
        System.out.println();
        System.out.println(counter);
        double average_AQI = total_AQI/(counter);
        System.out.printf("%.2f", average_AQI);
        System.out.println();

    }


}
