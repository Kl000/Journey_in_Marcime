package model.environnement;

public class Time {
	int hour, minute;

	public Time(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public void addHour(int hour) {
		this.hour += hour;
		if(this.hour >= 24) {
			hour = 0;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void addMinute(int minute) {
		this.minute += minute;
		if(this.minute >= 60) {
			this.minute -=60;
			addHour(1);
		}
	}
	
	public String getTime () {
		if (hour > 21 && hour < 6) {
			return "night";
		}
		else if (hour > 8 && hour < 19) {
			return "day";
		}
		else if (hour > 6 && hour < 8) {
			return "dawn";
		}
		else {
			return "twilight";
		}
	}
}
