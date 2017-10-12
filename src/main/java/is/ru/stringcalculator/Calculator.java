package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text != ""){
			if(text.contains(",") ||text.contains("\n")){
				String [] numbers = getNumbers(text);
				for(String number : numbers){
					if(getNum(number) < 0){
						throw new IllegalArgumentException("Negatives not allowed: " + number);
					}
				}
				return getSum(numbers);
			}
			return getNum(text);
		}
		return 0;
	}

	private static int getNum(String number){
		return Integer.parseInt(number);
	}

	private static int getSum(String [] numbers){
		int sum = 0;
		for(String number : numbers){
			sum += getNum(number);
		}
		return sum;
	}

	private static String [] getNumbers(String text){
		text = text.replace("\n", ",");
		String [] numbers = text.split(",");
		return numbers;
	}
}
