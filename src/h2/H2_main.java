package h2;

public class H2_main {
	public static void main(String[] args) {
		int jahr=400;
		boolean schalt=false;
		int rest4=jahr%4;
		int rest100=jahr%100;
		int rest400=jahr%400;
	if (rest4==0) {
		schalt=true;
		if (rest100==0) {
			schalt=false;
			if (rest400==0) {
				schalt=true;
			}
		}
	} else schalt=false;
	System.out.println("rest4:"+rest4+"schalt:"+schalt);
	}
}
