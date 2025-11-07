package h1;

public class H1_main {
	public static void main(String[] args) {
		double guthaben=-100, monEingang=200;
		int rating=-2;
		boolean warnhinweis=true, negativ=false;
	if (guthaben<0) {
		if (monEingang>=guthaben) {
			rating +=1;
		}
		if (monEingang<guthaben) {
			rating -= 1;
			if (rating<0) {
				warnhinweis=true;
			} 
		}
		negativ=true;
	} else {
		negativ=false;
		warnhinweis=false;
	}
	if (guthaben>0) {
		rating += 3;
	} 
	if (guthaben==0) {	
		rating += 2;
	}
	System.out.println("guthaben:"+guthaben+"monEingang:"+monEingang+"rating"+rating+"warnhinweis"+warnhinweis+"negativ"+negativ);
	} 
}
