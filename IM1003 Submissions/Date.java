
public class Date {
	
	private int day,month,year;
	
	public Date(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public String toString() {
		String result = "";
		if (day>=10) {
			result += day;
		} else {
			result += "0" + day;
		}
		result += "/";
		if (month>=10) {
			result += month;
		} else {
			result += "0" + month;
		}
		result += "/";
		result += year;
		
		return result;
	}
	
}
