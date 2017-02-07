package DataAbstraction;

public class CircularShiftsCheck {
	
	public static boolean circularShiftsCheck(String s, String t) {
		return (s.length() == t.length()) && (s.concat(s).indexOf(t) >= 0);
	}

}
