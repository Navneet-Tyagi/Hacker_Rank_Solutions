package Com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*; 

public class TestRockstar {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int N = Integer.parseInt(br.readLine());
String A = br.readLine();
String B = br.readLine();

char Alice[] = A.toCharArray();
char Bob[] = B.toCharArray();
int countWin=0;

if(Pattern.matches("[AKQJT2-9]", A) )
{
	System.out.println("Wrong Pattern");
}
else
{
	System.out.println("Correct Pattern");
	}

for(int i=0; i<N; i++)
{
	
	int tempAlice = (int)Alice[i];
	int BobAlice = (int)Bob[i];
	
	
	if(tempAlice==50 || tempAlice==51 || tempAlice==52 || tempAlice==53 || tempAlice==54 || tempAlice==55 || tempAlice==56 || tempAlice==57 )
	{
		if(tempAlice>BobAlice)
		{
			countWin += 1;
		}
		
	}
	else
	{
		if(tempAlice<BobAlice)
		{
			countWin += 1;
		}
		
	}
}
System.out.println(countWin);

	}

}
