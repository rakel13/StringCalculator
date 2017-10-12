package is.ru.hugb;

public class StringCalculator {
	public static int add(String text){
		if(text.equals(""))
			return 0;
		else{
			if(text.contains(",")){
				String numbers[] = text.split(",");
				int sum = 0;
				for(String n : numbers){
					sum += toInt(n);
				}
				return sum;
			}
			return 1;
		}
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}
}

