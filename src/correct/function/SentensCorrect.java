package correct.function;

import java.util.Scanner;

public class SentensCorrect {
	
	//������ ����������� � ������� ��� �� �����

	public static void main(String[] args) {
		String sentence;
		String[] words;
		System.out.println("Enter tne sentense");
		Scanner input=new Scanner(System.in);
		sentence=input.nextLine();
		sentence=sentence.replace(',', ' ');
		sentence=sentence.replace('.', ' '); // ������ ����� ���������� �� ������
		sentence=sentence.trim(); //�������� �������� � ������ � � ����� ������
		while (sentence.indexOf("  ")!=-1) { //�-��� ���� ����� ������� ��������� ������ ��������� � �������� ������, � ���� ������ ��������� ���, ��� ���������� -1
			sentence=sentence.replace("  ", " ");
		}
		words=sentence.split(" ");// �-��� ����� ������ �� ����� ��������� � ��������� �������� (� ��� ��� ������)
		System.out.println("Words or sentence are :");
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i]+" ");
		}
	}

}
