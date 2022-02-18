public class Func{
	public static void print(Object x){
		System.out.println(x);
	}


	public static void find(String text, String[] word_which_nado_compute, int word_which_nado_compute_length){
		int x = 0;
		int i = 0;
		String[] words = text.split(" ");
		while (i != word_which_nado_compute_length ) {
			for(String word : words){
				if(word.contains(word_which_nado_compute[i])){
					x++;
				}
			}
			i++;
		}
		print(x);
	}
}
