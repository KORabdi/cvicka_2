package cvicka_2;

public class Calc {
	
	private int x,y;
	private int[] vysledky = new int[4];
	private char[] operace = new char[4];
	
	public void vypocitej(){
		vysledky[0] = this.x+this.y;
		operace[0] = '+';
		vysledky[1] = this.x-this.y;
		operace[1] = '-';
		vysledky[2] = this.x*this.y;
		operace[2] = '*';
		vysledky[3] = this.x/this.y;
		operace[3] = '/';
	}
	
	public void vypis(){
		String x = Integer.toString(this.x);
		String y = Integer.toString(this.y);
		for(int i=0;i<vysledky.length;i++){
			String vysledekStr = Integer.toString(this.vysledky[i]);
			System.out.println(x+this.operace[i]+y+"="+vysledekStr);
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
