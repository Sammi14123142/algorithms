package ProgrammingModel;

public class Sattolo {
	
	public static void cycle(Object[] a) {
		int n = a.length;
		for (int i = n; i>1; i--) {
			int r = (int) (Math.random()*(i-1));
			Object temp = a[r];
			a[r] = a[i-1];
			a[i-1] = temp;
		}
	}

}
