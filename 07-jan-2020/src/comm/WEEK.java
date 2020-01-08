package comm;

public enum WEEK {
	SUN("Today is sunday", 1), 
	MON("Today is monday", 2),
	TUE("Today is tuesday", 3),
	WED("Today is wednesday", 4),
	THS("Today is thursday", 5),
	FRI("Today is friday", 6),
	SAT("Today is saturday", 7);
	
	
	private final String msg;
	private final int dayOfWeek;

	private WEEK(String m, int d) {

		 msg= m;
		dayOfWeek = d;
	}

	public String getMsg() {
		return msg;
	}
	public int getDayOfWeek() {
		return dayOfWeek;
	}
}
