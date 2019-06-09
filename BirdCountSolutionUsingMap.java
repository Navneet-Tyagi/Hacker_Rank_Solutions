package Com;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class BirdCountSolutionUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int ar[] = {2,4,3,2,3,1,2,1,3,3};
		
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
		
		int max = Collections.max(map.values());
		int Result=0;
		if(max > 0)
		{
		for(Entry<Integer,Integer> entry:map.entrySet())
		{
			if(entry.getValue().equals(max))
			{
				Result = entry.getKey();
				System.out.println(Result);
				break;
			}
		}
		}
				

	}

}
