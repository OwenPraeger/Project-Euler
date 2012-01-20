import java.math.BigInteger;



public class ProjectEulerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int problem1_answer = Problem1();	
		//System.out.print("The answer is: "+ problem1_answer);
		
		//int problem2_answer = Problem2(); 
		//System.out.print("The answer is: "+ problem2_answer);
		
		int problem3_answer = Problem3(74); 
		System.out.print("The answer is: "+ problem3_answer);
		
		

	}
	
	//Problem One:
		//Find the sum of all the multiples of 3 or 5 below 1000.
	public static int Problem1()
	{
		int answer = 0; 
		for(int i = 0 ; i< 1000; i++)
		{
			if(i%3 == 0 && i%5 == 0)
			{
				answer += i;
			}
			else if (i%3 == 0) 
			{
				answer +=i; 
			}
			else if (i%5 == 0) 
			{
				answer += i; 
			}
		}
		return answer; 
	}

	//Problem Two: 
		//By considering the terms in the Fibonacci sequence whose 
		//values do not exceed four million, find the sum of the even-valued terms.
	public static int Problem2()
	{
		int answer = 0; 
		int x0 = 1; 
		int x1 = 1; 
		int x2 = 0; 
		
		while(x2 < 4000000)
		{
			x2 = x0+x1; 
			if (x2%2 == 0) answer += x2;
			x0 = x1; 
			x1 = x2; 
		}
		
		return answer; 
	}

	//Problem Three;
		//What is the largest prime factor of the number 600851475143 
	public static int Problem3(double n)
	{
		double sqrt_number_double = Math.sqrt(n); 
		int sqrt_number = (int) sqrt_number_double; 
		int answer = 1; 
		
		int i = 2; 
		int number = (int) n; 
		while(i <= sqrt_number)
		{
			if (number%i == 0)//min prime number
			{
				answer = i; 
				number = number/i;  
			}
			i++; 
		}
		return answer;  
		
		
//		for(int i = 1; i< sqrt_number; i+= 2)
//		{
//			if (n%i == 0)
//			{
//				answer = i; 
//				int guess2 = Problem3(n/answer); 
//				if(guess2 > answer) answer = guess2; 
//				return answer; 
//			}
//		}
	}


}
