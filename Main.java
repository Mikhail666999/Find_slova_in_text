import java.util.*;

class Main{
	public static void main(String[] args){
		Func f = new Func();

		String text = "орк зад макака мозги резня орк мозги феменистка мозги орк тупой олег олег трутень орк мозги лопата макс феменистка феменистка мозги мозги мозги мозги зад задорк мозги феменистка мозги орк тупой олег олег трутень орк мозги лопата макс  зад орк орк орк мозги феменистка мозги орк тупой олег олег трутень орк мозги лопата макс  орк орк орк ";
		String[] word_which_nado_compute = new String[]	{"орк", "феменистка", "мозги", "олег"};
		int word_which_nado_compute_length = word_which_nado_compute.length;
		f.find(text, word_which_nado_compute, word_which_nado_compute_length);
		f.print("Кол-во слов коорые надо посчитать: " + word_which_nado_compute_length);
	}	
}
