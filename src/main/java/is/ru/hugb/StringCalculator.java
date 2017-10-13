package is.ru.hugb;

public class StringCalculator {
	public static int add(String text){
		if(text.equals(""))
			return 0;
		else{
			if(text.contains(",") || text.contains("\\n") || text.contains("//")){
				String [] numbers = stringSplitter(text);
				
				if(!isNeg(numbers)){
					return sum(numbers);
				}
				else{
					int neg[] = getNeg(numbers);
					System.out.println("Negatives not allowed: ");
					for(int n : neg){
						System.out.println(n);
					}
				}
			}
			return 1;
		}
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static int sum(String [] numbers){
		int sum = 0;
		for(String n : numbers){
			if(toInt(n) <= 1000)
				sum += toInt(n);
		}
		return sum;
	}

	private static boolean isNeg(String [] numbers){
		for(String n : numbers){
			if(toInt(n) < 0){
				return true;
			}
		}
		return false;
	}

	private static int [] getNeg(String [] numbers){
		int neg[] = new int[numbers.length+1];
		int counter = 0;
		for(String n : numbers){
			if(toInt(n) < 0){
				neg[counter] = toInt(n);
				counter++;
			}
		}
		return neg;
	}

	private static String [] stringSplitter(String text){
		text = text.replace("\n", ",");
		String numbers[];
		String delimeter = ",";
		if(text.startsWith("//")){
			int index = text.indexOf("//") + 2;
			delimeter = text.substring(index, index + 1);
			text = text.substring(index + 2);
		}
		numbers = text.split(delimeter);
		return numbers;
	}
}

