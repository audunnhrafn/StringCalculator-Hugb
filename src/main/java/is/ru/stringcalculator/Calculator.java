package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text != ""){
			if(text.contains(",")){
				String [] numbers = text.split(",");
				int sum = 0;
				for(String number : numbers){
					sum += getNum(number);
				}
				return sum;
			}
			return Integer.parseInt(text);
		}

		return 0;
	}

	private static int getNum(String number){
		return Integer.parseInt(number);
	}
}
