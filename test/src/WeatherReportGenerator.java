import java.util.Scanner;

public class WeatherReportGenerator {

	public static void main(String[] args) throws Exception {
		String psvFile = "D:/Documents/WeatherReport.psv";
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of data records required : ");
		int number = scan.nextInt();
	    WeatherReportWriter.writePsvFile(psvFile, number);
	    System.out.println("End of main");
	}
}
