package Com;

import java.util.*;
import java.util.Map.Entry;

public class intPrac {

	public static void main(String[] args) {

		int values[] = {1, 2, 1, 3, 3, 1, 4, 1, 3, 5, 1 };

		Arrays.sort(values);

		Map<Integer,Integer> m = new HashMap<>();
		
		for(Integer i : values) 
		{
			Integer count = m.get(i);
			if(count == null)
			{
				m.put(i, 1);
			}
			else
			{
				m.put(i, ++count);
			}
		}
		Set<Entry<Integer, Integer>> entry = m.entrySet();
		for(Entry<Integer, Integer> entries: entry)
		{
			System.out.println("Values:- "+ entries.getKey()+" occurence is:- "+entries.getValue());
		}
		/*
		 * for (int i = 0; i < values.length; i++) {
		 * 
		 * 
		 * int count=1; for(int j=i+1; j<values.length; j++) { if(values[i]==values[j])
		 * { count++; } }
		 * 
		 * System.out.println(values[i]+" "+count);
		 * 
		 * }
		 */
		 
	}
}