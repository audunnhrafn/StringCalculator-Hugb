package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text != ""){
			if(text.contains(",")){
				String [] numbers = text.split(",");
				return getNum(numbers[0]) + getNum(numbers[1]);
			}
			return Integer.parseInt(text);
		}

		return 0;
	}

	private static int getNum(String number){
		return Integer.parseInt(number);
	}
}
