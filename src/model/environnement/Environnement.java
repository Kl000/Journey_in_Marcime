package model.environnement;

public class Environnement {
	private int temperature;
	private Time time;
	private Weather weather;
	
	public Environnement(int temperature, Time time, Weather weather) {
		super();
		this.temperature = temperature;
		this.time = time;
		this.weather = weather;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	
	
}
