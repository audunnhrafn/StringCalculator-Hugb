package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text != ""){
			if(text.contains(",")){
				String [] numbers = text.split(",");
				return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
			}
			return Integer.parseInt(text);
		}

		return 0;
	}
	
}
