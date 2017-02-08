package unionFind;

public class QuickUnion {
	
	private int[] parent;
	private int count;
	
	public QuickUnion(int n) {
		count = n;
		parent = new int[n];
		
		for (int i = 0; i<n; i++) {
			parent[i] = i;
		}
	}
	
	public int count() {
		return count;
	}
	
	public int find(int p) {
		validate(p);
		
		while (p!= parent[p])
			p = parent[p];
		return p;
	}
	
	public void validate(int p) {
		int n = parent.length;
		if (p<0 || p>=n) {
			throw new IndexOutOfBoundsException("index " + p + " is not correct");
		}
		
	}
	
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}
	
	public void union(int p, int q) {
		int pRoot = find(p);
		int qRoot = find(q);
		
		if (pRoot != qRoot) {
			parent[pRoot] = qRoot;
		} else {
			return;
		}
		count--;
	}
	
	public static void main(String[] args) {
		int n = StdIn.readInt();
		QuickUnion qu = new QuickUnion(n);
		while (!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			
			if (qu.connected(p, q)) continue;
			qu.union(p, q);
			StdOut.println(p + " " + q);
		}
		StdOut.println(qu.count() + " components");
	}

}
