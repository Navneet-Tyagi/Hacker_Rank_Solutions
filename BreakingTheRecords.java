package Com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BreakingTheRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String lineBreak[] = line.split(" ");
			int arr[] = new int[n];
			int Min=0, Max=0;
			int temp = 0;
			
			for(int i=0; i<n; i++)
			{
				arr[i] = Integer.parseInt(lineBreak[i]);
			}
		
		//Logic to find Maximum value	
		temp = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(temp<arr[i])
			{
				temp = arr[i];
				Max = Max+1;
			}
		}
		
		//Logic to find a Minimum Value
		temp = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(temp>arr[i])
			{
				temp = arr[i];
				Min = Min +1;
			}
		}
		
		System.out.println(Max+" "+Min);
		
		}
		catch(Exception e)
		{
			
		}

	}

}
