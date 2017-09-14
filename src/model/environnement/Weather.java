package model.environnement;

public class Weather {
	public static final String[] WEATHERS = {"sunny", "cloud", "rain", "mist", "snow", "hail"};
	
	private String actualWeather;
	
	public Weather(String weather) {
		this.setWeather(weather);
	}
	
	public String getActualWeather() {
		return actualWeather;
	}
	
	public void setWeather(String weather) {
		int i = 0;
		boolean isAValidWeather = false;
		while (!isAValidWeather && i < Weather.WEATHERS.length) {
			isAValidWeather = weather.equalsIgnoreCase(Weather.WEATHERS[i]);
			i++;
		}
		if (isAValidWeather) {
			this.actualWeather = weather;
		}
	}
}
