package unionFind;

public class QuickFind {
	private int[] id;
	private int count;
	
	public QuickFind(int n) {
		count = n;
		id = new int[n];
		for (int i=0; i<n; i++) {
			id[i] = i;
		}
	}
	
	public int count() {
		return count;
	}
	
	public int find(int p) {
		validate(p);
		return id[p];
	}
	
	public void validate(int p) {
		int n = id.length;
		if (p<0 || p>=n) {
			throw new IndexOutOfBoundsException("index "+p+"is not correct");
		}
	}
	
	public boolean connected(int p, int q) {
		validate(p);
		validate(q);
		return id[p]==id[q];
	}
	
	public void union(int p, int q) {
		validate(p);
		validate(q);
		// 1. to reduce array accesses
		// 2. To avoid changing id[p] to id[q] in the for loop
		// so that any object larger than p with equal id cannot be updated
		int pId = id[p];
		int qId = id[q];
		
		if (pId == qId) return;
		
		for (int i=0; i<id.length; i++) 
			if (id[i] == pId) id[i] = qId;
		count--;
		
	}
	
	public static void main(String[] args) {
		int n = StdIn.readInt();
		QuickFind qf = new QuickFind(n);
		while (!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if (qf.connected(p, q)) continue;
			qf.union(p, q);
			StdOut.println(p + " " + q);
		}
		StdOut.println(qf.count() + " components");
	}
	
	

}
