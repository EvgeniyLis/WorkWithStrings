package strings.uselength;

import java.util.Scanner;

public class SortForLong {
	
	//ввести массив предложений и отсортировать его по длине символов

	public static void outArray(String[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	public static void main(String[] args) {
		String[] sentenses;
		int count;
		String temp;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the count of sentences");
		count=input.nextInt();
		sentenses=new String[count];
		System.out.println("Enter "+count+" sentences");
		input.nextLine(); //ввести пустую строку, которая образовалась после нажатия Enter
		for (int i = 0; i < sentenses.length; i++) {
			sentenses[i]=input.nextLine();
		}
		System.out.println("Sourse array is :");
		System.out.println();
		outArray(sentenses);
		for (int border = 0; border < sentenses.length-1; border++) {
			for (int i = 0; i < sentenses.length-1-border; i++) {
				if (sentenses[i].length()>sentenses[i+1].length()) { //функции, поддерживаемые строками, вызываются через точку после элемента массива
					temp=sentenses[i];
					sentenses[i]=sentenses[i+1];
					sentenses[i+1]=temp;
				}
			}
		}
		System.out.println("New array is :");
		System.out.println();
		outArray(sentenses);
		input.close();
	}

}
