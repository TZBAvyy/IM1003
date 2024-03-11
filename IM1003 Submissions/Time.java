
public class Time {
	
	private int hour,minute,second;
	
	public Time(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public Time nextSecond() {
		this.second = this.second + 1;
		this.minute = this.minute + this.second/60;
		this.hour = this.hour + this.minute/60;
		
		this.second = this.second%60;
		this.minute = this.minute%60;
		this.hour = this.hour%24;
		
		return this;
	}
	
	public Time previousSecond() {
		this.second -= 1;
		if (this.second<0) {
			this.second = 59;
			this.minute -= 1;
		}
		
		if (this.minute<0) {
			this.minute = 59;
			this.hour -= 1;
		}
		
		if (this.hour<0) {
			this.hour = 23;
		}
		
		return this;
	}
	
}
