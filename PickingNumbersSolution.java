package Com;

import java.util.Arrays;
import java.util.*;

public class PickingNumbersSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer a[] = {4,2,3,4,4,9,98,98,3,3,3,4,2,98,1,98,98,1,1,4,98,
		2,98,3,9,9,3,1,4,1,98,9,9,2,9,4,2,2,9,98,4,98,1,3,4,9,
		1,98,98,4,2,3,98,98,1,99,9,98,98,3,98,98,4,98,2,98,4,2,1,1,9,2,4};
int count = 0;


List<Integer> li = Arrays.asList(a);
//take values of list into set
Collections.sort(li);
Set<Integer> set=new TreeSet<Integer>(li);
//logic starts from here
for(Integer var:set)
{
	int temp = 0;
	for(Integer var2:li)
	{
		if(var>=var2)
		{
		if(Math.abs(var-var2)<=1)
		{
			temp += 1; 	
		}
		}
	}
	System.out.println(" Final Result "+temp);
	if(count<temp)
	{
		count=temp;
	}
}
System.out.println("Final"+count);
}
}