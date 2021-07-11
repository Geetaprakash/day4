
public class EmU5 {
		public static final int parttime = 1;
		public static final int fultime = 2;
		public static final int emrperhr = 20;
		public static final int numofworkingdays = 2;
		public static void main(String[] args) {
		int emphrs = 0;
		int empwage = 0;
		int totalempwag = 0;
		for (int day = 0; day < numofworkingdays; day++) {
		int empcheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empcheck) {
		case parttime:
		emphrs = 4;
		break;
		case fultime:
		emphrs = 8;
		break;
	default:
		emphrs = 0;
	}
	empwage = emphrs * emrperhr;
	totalempwag += empwage;
	System.out.println("empwage: " + empwage);
	}
	System.out.println("total emp empwage: " + totalempwag);
	}
	}

