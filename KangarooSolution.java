package Com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KangarooSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	String line = br.readLine();
	    	String lineBreak[] = line.split(" ");
	    	
	    	int x1 = Integer.parseInt(lineBreak[0]);
	    	int v1 = Integer.parseInt(lineBreak[1]);
	    	int x2 = Integer.parseInt(lineBreak[2]);
	    	int v2 = Integer.parseInt(lineBreak[3]);
	    	int count=0;
	    	
	    	for(int i=0; i<=10000; i++)
	    	{
	    		x1 += v1;
	    		x2 += v2;
	    		
	    			if(x1 == x2)
	    			{
	    				count = count+1;
	    				break;
	    			}
	    	}
	    	
	    	if(count>=1)
	    	{
	    		System.out.println("Yes");
	    	}
	    	else
	    	{
	    		System.out.println("No");
	    	}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
