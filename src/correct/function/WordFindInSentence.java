package correct.function;

import java.util.Scanner;

public class WordFindInSentence {
	
	// найти слово, введенное с консоли, в предложении и вывести его

	public static void outArray(String[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	public static void main(String[] args) {
		String[] sentenses;
		int count;
		String word;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the count of sentences");
		count=input.nextInt();
		sentenses=new String[count];
		System.out.println("Enter "+count+" sentences");
		input.nextLine(); //ввести пустую строку, которая образовалась после нажатия Enter
		for (int i = 0; i < sentenses.length; i++) {
			sentenses[i]=input.nextLine();
		}
		System.out.println("Enter finding word");
		word=input.next();
		System.out.println("Sentence which contains the word "+word+" are: ");
		for (int i = 0; i < sentenses.length; i++) {
			if (sentenses[i].contains(word)) {
				System.out.println(sentenses[i]);
			}
		}
		
		
	

	}

}
