package Com;

public class SaveThePrisonerSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 352926151;  //prisoner n
		int s = 380324688;  //sweet m
		int start = 94730870;  //start s
		  
		for(int i=1; i<s; i++)
		{
			if(start==p)
			{
				start = 1;
			}
			else
			{
				start += 1;
			}
		}
		System.out.print(start);
		
	}

}
