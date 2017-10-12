package is.ru.hugb;

public class StringCalculator {
	public static int add(String text){
		if(text.equals(""))
			return 0;
		else{
			if(text.contains(",") || text.contains("\\n")){
				String numbers[] = text.replace("\n", ",").split(",");
				if(isNeg(numbers) == 0){
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
			

			sum += toInt(n);
		}
		return sum;
	}

	private static int isNeg(String [] numbers){
		for(String n : numbers){
			if(toInt(n) < 0){
				return 1;
			}
		}
		return 0;
	}

	private static int [] getNeg(String [] numbers){
		int neg[] = new int[numbers.length+1];
		int counter = 0;
		for(String n : numbers){
			if(toInt(n) < 0){
				neg[counter] = toInt(n);
			}
		}
		return neg;

	}
}

