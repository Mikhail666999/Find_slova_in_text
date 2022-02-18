public class Func{
	public static void println(Object x){
		System.out.println(x);
	}

	public static void print(Object x){
		System.out.print(x);
	}

	public static void find(String text, String word_which_nado_compute){
		int x = 0;
		String[] words = text.split(" ");
		for(String word : words){
			if(word.contains(word_which_nado_compute)){
				x++;
			}
		}
		println(x);
	}
}