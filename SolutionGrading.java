package Com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionGrading {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int N= Integer.parseInt(br.readLine());
int grades[] = new int[N];

for(int i=0; i<grades.length; i++)
{
grades[i] = Integer.parseInt(br.readLine());
}

int finalGrade[] = new int[grades.length];

for(int i=0; i<grades.length; i++)
{
if(grades[i]<38)
{
	finalGrade[i] = grades[i];
}
else
{
	if(grades[i]%10==3 || grades[i]%10==4 || grades[i]%10==8 || grades[i]%10==9)
	{
		int temp = grades[i]%5;
	finalGrade[i] = grades[i] + (5- temp);	
	}
	else
	{
		finalGrade[i] = grades[i];
	}
	
	}
}

for(int i=0; i<finalGrade.length; i++)
{
System.out.println(finalGrade[i]);	
}
	}

}
