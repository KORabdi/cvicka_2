package cvicka_2;

public class Circle {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getObsah(){
		return this.round(this.radius*Math.PI*2,3);
	}
	
	public double getObvod(){
		return this.round(this.radius*Math.PI,3);
	} 
	
	private double round(double value, int scale) {
	    return Math.round(value * Math.pow(10, scale)) / Math.pow(10, scale);
	}
	
	public void vypis(){
		System.out.println(this.getObsah());
		System.out.println(this.getObvod());
	}
	
}
