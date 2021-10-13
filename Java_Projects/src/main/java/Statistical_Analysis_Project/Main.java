package Statistical_Analysis_Project;

public class Main {


    public static void main(String[] args) {

        Statistical_data_calculation cities = new Statistical_Analysis_Project.Statistical_data_calculation();
        cities.data_reader_for_population("/Users/benjaminkolyshev/Downloads/simplemaps_worldcities_basicv1.74/WUP2018-F12-Cities_Over_300K.csv");
        cities.data_reader_for_AQI("/Users/benjaminkolyshev/Downloads/waqi-covid19-airqualitydata-2018H1.csv");

        Collecting_City_Names cityNames = new Collecting_City_Names();
        cityNames.data_reader_for_cities("/Users/benjaminkolyshev/Downloads/waqi-covid19-airqualitydata-2018H1.csv");

    }

}
