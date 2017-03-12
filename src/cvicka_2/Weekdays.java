package cvicka_2;

public class Weekdays {
	private String[] name = {"Monday","Tuestday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	
	public String getDay(int x){
		if(x > 0 && x < 8){
			x--;
			String y = this.name[x];
			return y; 
		}
		return null;
	}
}
