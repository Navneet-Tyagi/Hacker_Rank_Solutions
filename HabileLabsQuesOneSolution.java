package Com;

//Find 8^n and print last two digits

public class HabileLabsQuesOneSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1; //taking n
		int sum = 1; // to calculate 8^
		int result = 0; // to store result
		//Logic starts from here... looping to calculate 8^
		for(int i=1; i<=n; i++)
		{
			sum *= 8;
		}
		//Logic to take last two digits
		if(sum>10)
		{
			result = sum%100;
		}
		else
		{
			result = sum;
		}
		
		System.out.println(result);
		
		
	}

}
