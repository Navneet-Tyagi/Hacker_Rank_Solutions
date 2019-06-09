package Com;

import java.util.HashMap;
import java.util.Map;

//find total no. of candies rohit can buy

public class HabileLabsQuesTwoSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int cost[] = {1,5,9};
int candies[] = {2,5,6};
int TotalMoney = 13;
int sum = 0;

	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	
	for(int i=0; i<cost.length; i++)
	{
		map.put(candies[i], cost[i]);
	}
	
	
	
	}

}
