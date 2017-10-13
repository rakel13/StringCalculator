package is.ru.hugb;

/* The StringCalculator accepts a string, splits the string into numbers by delimeters
*  and adds the numbers together and returns the sum. If numbers are negative the StringCalculator
*  will throw an exception. Delimeters can also be changed */
public class StringCalculator {
	public static int add(String text){
		if(text.equals(""))
			return 0;
		else{
			if(text.contains(",") || text.contains("\\n") || text.contains("//")){
				String [] numbers = stringSplitter(text);
				
				if(isNeg(numbers)){
					getNeg(numbers);	
				}
				else{
					return sum(numbers);
				}
			}
			return 1;
		}
	}
	/* converts string into an integer */
	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	/* sum up each number in the String array if the numbers are less than or equal to 1000 */
	private static int sum(String [] numbers){
		int sum = 0;
		for(String n : numbers){
			if(toInt(n) <= 1000)
				sum += toInt(n);
		}
		return sum;
	}

	/* If one of the numbers in the String array is negative isNeg will return true */
	private static boolean isNeg(String [] numbers){
		for(String n : numbers){
			if(toInt(n) < 0){
				return true;
			}
		}
		return false;
	}

	/* getNeg creates an integer array for every negative number in then numbers array and
	*  return the integer array along with the message that negatives are not allowed */
	private static void getNeg(String [] numbers){
		int neg[] = new int[numbers.length+1];
		int counter = 0;
		for(String n : numbers){
			if(toInt(n) < 0){
				neg[counter] = toInt(n);
				counter++;
			}
		}
		System.out.println("Negatives not allowed: ");
		for(int n : neg){
			System.out.println(n);
		}
	}

	/* stringSplitters split the string by delimeter, if it recieves "//" then it will split
	*  the array by a new kind of a delimeter. Then it will return fully splitted array */
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

