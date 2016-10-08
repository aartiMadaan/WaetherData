import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class WeatherReportWriter {
	
	//Delimiter used in PSV file
    private static final String PIPE_DELIMITER = "|";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static String[] location = {"India", "Sydney", "Melbourne", "Adelaide"};
	private static String[] position = {"37.6,68.7,-8.6", "-33.86,151.21,39", "-37.83,144.98,7", "-34.92,138.62,48"};
	private static String[] localTime = {"2016-10-07 01:40:19", "2016-08-23 16:02:12", "2016-07-25 02:30:55", "2016-09-21 23:05:37"}; 
	private static String[] conditions = {"Rain", "Snow", "Sunny", "Windy"};
	private static String[] temperature = {"+25.2", "+12.5", "-5.3", "+39.4"};
	private static double[] pressure = {999.1, 1010.3, 998.4, 1114.1};
	private static long[] humidity = {82, 97, 55, 12};

    //PSV file header

    private static final String FILE_HEADER = "Location|Position|Local Time|Conditions|Temperature|Pressure|Humidity";
    
    public static void writePsvFile(String fileName, int number) {
        
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            //Write the PSV file header
            fileWriter.append(FILE_HEADER.toString());
            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write a new student object list to the CSV file
            for (int i = 0; i < number; i++) {
            	Weather weather1 = new Weather(location[new Random().nextInt(location.length)],
            			position[new Random().nextInt(position.length)],
            			localTime[new Random().nextInt(localTime.length)],
            			conditions[new Random().nextInt(conditions.length)],
            			temperature[new Random().nextInt(temperature.length)],
            			pressure[new Random().nextInt(pressure.length)],
            			humidity[new Random().nextInt(humidity.length)]);
                fileWriter.append(weather1.getLocation());
                fileWriter.append(PIPE_DELIMITER);
                fileWriter.append(weather1.getPosition());
                fileWriter.append(PIPE_DELIMITER);
                fileWriter.append(weather1.getLocalTime());
                fileWriter.append(PIPE_DELIMITER);
                fileWriter.append(weather1.getConditions());
                fileWriter.append(PIPE_DELIMITER);
                fileWriter.append(weather1.getTemperature());
                fileWriter.append(PIPE_DELIMITER);
                fileWriter.append(String.valueOf(weather1.getPressure()));
                fileWriter.append(PIPE_DELIMITER);
                fileWriter.append(String.valueOf(weather1.getHumidity()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("PSV file was created successfully !!!");
        } catch (Exception e) {
            System.out.println("Error in WeatherReportWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }
	}