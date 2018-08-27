package correct.function;

import java.util.Scanner;

public class SentensCorrect {
	
	//ввести предложение и разбить его на слова

	public static void main(String[] args) {
		String sentence;
		String[] words;
		System.out.println("Enter tne sentense");
		Scanner input=new Scanner(System.in);
		sentence=input.nextLine();
		sentence=sentence.replace(',', ' ');
		sentence=sentence.replace('.', ' '); // замена знака препинания на пробел
		sentence=sentence.trim(); //удаление пробелов в начале и в конце строки
		while (sentence.indexOf("  ")!=-1) { //ф-ции ищет номер первого вхождения своего аргумента в исходную строку, и если такого вхождения нет, она возвращает -1
			sentence=sentence.replace("  ", " ");
		}
		words=sentence.split(" ");// ф-ция делит строку на части указанным в аргументе символом (у нас это пробел)
		System.out.println("Words or sentence are :");
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i]+" ");
		}
	}

}
