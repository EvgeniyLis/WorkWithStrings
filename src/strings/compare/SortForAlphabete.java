package strings.compare;

import java.util.Scanner;
import java.util.Stack;

public class SortForAlphabete {

	// ������ ������ ���� � ������������� �� ��������
	 
	public static void outArray(String[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	public static void main(String[] args) {
		String[] names;
		String temp;
		int count;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		count=input.nextInt();
		names=new String[count];
		System.out.println("Enter "+count+" sentences");
		input.nextLine();
		for (int i = 0; i < names.length; i++) {
			names[i]=input.next();
		}
		System.out.println("Sourse array is :");
		outArray(names);
		for (int border = 0; border < names.length-1; border++) {
			for (int i = 0; i < names.length-1-border; i++) {
				if (names[i].compareTo(names[i+1])>0) { // ��������� ���� ����� � ����� ������ �� ���� ��������� ��������: 0 - ������ �����, 1 - ������ ������ ������, -1 - ������ ������ ������
					temp=names[i];
					names[i]=names[i+1];
					names[i+1]=temp;
				}
			}
		}
		System.out.println("New array is :");
		System.out.println();
		outArray(names);
		input.close();
	}

}
