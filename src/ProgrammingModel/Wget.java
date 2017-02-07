package ProgrammingModel;

public class Wget {
	
	public static void main(String[] args) {
		In in = new In(args);
		String data = In.readAll();
		
		String filename = args.substring(args.lastIndexOf('/')+ 1 );
		Out out = new out(filename);
		out.println(data);
		out.close;
	}

}
