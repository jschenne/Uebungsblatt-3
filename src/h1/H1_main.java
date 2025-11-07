package h1;

public class H1_main {
	public static void main(String[] args) {
		double guthaben=-100, monEingang=200;
		int rating=-2;
		boolean warnhinweis=true, negativ=false;
	if (guthaben<0) {
		if (Math.abs(monEingang)>=Math.abs(guthaben)) {
			rating +=1;
		}
		if (Math.abs(monEingang)<Math.abs(guthaben)) {
			rating -= 1; 
		}
		negativ=true;
	} else {
		negativ=false;
	}
	if (guthaben>0) {
		rating += 3;
	} 
	if (guthaben==0) {	
		rating += 2;
	}
	if (guthaben<0 && Math.abs(monEingang)<Math.abs(guthaben) && rating<0) {
		warnhinweis=true;
	} else warnhinweis=false;
	System.out.println("guthaben:"+guthaben+"monEingang:"+monEingang+"rating"+rating+"warnhinweis"+warnhinweis+"negativ"+negativ);
	} 
}
