package strings;

public class StringSplit {
	
	// метод принимает массив строк и оставляет последние 13 символов в строке

	public static void main(String[] args) {
		String[] text = {"http://www.wiley.com/en-us/Exam+77+421+Microsoft+Excel+2013+Expert-p-9781119015888",
			             "http://www.wiley.com/en-us/Praxis+5354+Special+Education+For+Dummies-p-9781119516118"};
		
		for (int i = 0; i < text.length; i++) {
			text[i] = text[i].substring(text[i].length() - 13);
		}
		
		for (int i = 0; i < text.length; i++) {
			System.out.println(text[i]);
		}
	}
}
