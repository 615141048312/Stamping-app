package commandLineArguments;

public class JSample2_1 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("引数を2つ指定して下さい");
			System.out.println("JSample2_1 値1 値2");
			System.exit(1);
		}
		
		System.out.println("「" + args[0] + "」");
		System.out.println("「" + args[1] + "」");
	}

}
