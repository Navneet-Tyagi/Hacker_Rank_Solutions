package Com;

import java.util.Arrays;

public class TheHurdleRaceSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k = 7;
int height[] = {2,5,4,5,2};
int result = 0;
Arrays.sort(height);
int Max = height[height.length-1];

if(k<Max)
{
	result = k - Max;
}
	
	System.out.println(result);
	}

}
