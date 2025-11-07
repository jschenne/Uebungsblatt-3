package h3;

public class H3_main {
	public static void main(String[] args) {
		int max=5;
		int fix=2;
		int wartend=2;
		boolean istVoll=false;
		int frei=max-fix;
		if (frei>wartend) {
			frei=frei-wartend;
			fix=fix+wartend;
			wartend=0;
			istVoll=false;
		}
		if (frei<wartend) {
			wartend=wartend-frei;
			frei=0;
			fix=max;
			istVoll=true;
		}
		if (frei==wartend) {
			wartend=0;
			frei=0;
			fix=fix+wartend;
			istVoll=true;
		}
		System.out.println("fix:"+fix+" wartend:"+wartend+" istVoll:"+istVoll);
	}
}
