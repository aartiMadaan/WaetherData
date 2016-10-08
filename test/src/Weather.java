public class Weather {

	private String location;
	private String position;
	private String localTime;
	private String conditions;
	private String temperature;
	private double pressure;
	private long humidity;

	public Weather(String location, String position, String localTime,
			String conditions, String temperature, double pressure,
			long humidity) {
		super();
		this.location = location;
		this.position = position;
		this.localTime = localTime;
		this.conditions = conditions;
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getLocalTime() {
		return localTime;
	}

	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public long getHumidity() {
		return humidity;
	}

	public void setHumidity(long humidity) {
		this.humidity = humidity;
	}

}
