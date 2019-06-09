package Com;

import java.util.*;
import java.util.Map.Entry;

class a
{
	static int b=10;
}

public class MapOperatorExample {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 9;
		int ar[] = {10,20,20,10,10,30,50,10,20};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(Integer arr:ar){
		Integer count = map.get(arr);
		if(count == null)
		{
		    map.put(arr,1);
		}
		else
		{
		    map.put(arr, ++count);
		}
		}
	
		int result=0;
		int finalResult = 0;
Set<Entry<Integer,Integer>> entrySet = map.entrySet();
for(Entry<Integer,Integer> entry:entrySet)
{
	if(entry.getValue()>1)
	{
result = entry.getValue();	
finalResult = finalResult + (result/2);
	}
	}

System.out.println(finalResult);
 	}

}
