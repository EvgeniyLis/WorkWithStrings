package strings.input;

import java.util.Scanner;

public class StringOperations {
	
	//������ ��� ������, � ��������� � ���

	public static void main(String[] args) {
		String withSpaces, withOutSpaces;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first string");
		withSpaces=input.nextLine(); //������ ������ �� ������� Enter
		System.out.println("Enter second string");
		withOutSpaces=input.next(); //������ ������ �� ������� �������
		System.out.println("First string is : "+withSpaces);
		System.out.println("Second string is : "+withOutSpaces);
		input.close();

	}

}
