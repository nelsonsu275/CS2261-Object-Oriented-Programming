import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a credit card number as a long integer: ");
			
			long ccn = input.nextLong();
			int total = 0;
			
			if (checkDigits(ccn) == true)
			{
				total = sumOne(ccn) + sumOdd(ccn);
				if (total % 10 == 0)
					System.out.println(ccn + " is a valid credit card number.");
				else
					System.out.println(ccn + " is an invalid credit card number.");
			}
			else
				System.out.println("Invalid");
		}
	}
	
	public static boolean checkDigits(long ccn)
	{
		String ccnStr = Long.toString(ccn);
		
		if (ccnStr.length() >= 13 && ccnStr.length() <= 16)
		{
			if (ccnStr.charAt(0) == '4' || ccnStr.charAt(0) == '5' || ccnStr.charAt(0) == '6')
				return true;
			else if (ccnStr.charAt(0) == '3' && ccnStr.charAt(1) == '7')
				return true;
			else
				return false;
		}			
		else
			return false;
	}
	
	public static int sumOne(long ccn)
	{
		int num = 0;
		int sum = 0;
		String ccnStr = Long.toString(ccn);
		for (int i = ccnStr.length() - 2; i >= 0; i -= 2)
		{
			num = Character.getNumericValue(ccnStr.charAt(i));
			num *= 2;
			if (num > 9)
				num = 1 + num % 10;
			sum += num;
		}
		return sum;
	}
	
	public static int sumOdd(long ccn)
	{
		int sum = 0;
		String ccnStr = Long.toString(ccn);
		for (int i = ccnStr.length() - 1; i >= 0; i -= 2)
		{
			sum += Character.getNumericValue(ccnStr.charAt(i));
		}
		return sum;
	}
}
