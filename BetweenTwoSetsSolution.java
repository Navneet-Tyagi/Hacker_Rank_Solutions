package Com;

public class BetweenTwoSetsSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 5;
		int keyboards[] = {5};
		int drives[] = {4};
		int result = -1;
		
		for(int i=0; i<keyboards.length; i++)
		{
			for(int j=0; j<drives.length; j++)
			{
				int spend = keyboards[i]+drives[j];
				if(spend<=b && spend>=result)
				{
					result = spend;
				}
				
			}
		}
		System.out.println(result);
	}

}
