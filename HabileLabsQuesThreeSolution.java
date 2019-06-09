package Com;

//Print all palindrome date in given year with date format or print "No date Found"

public class HabileLabsQuesThreeSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Years which can be changed
int y = 2017;
int day = 1;
int mon = 1;
int sum=0;
int result =0;

//Logic starts from here. This logic will not work with 2031.
for(int i=day; i<=30; i++)
{
for(int j=mon; j<=12; j++)
{
	//Both the values should be empty in every iteration of loop.
	String temp = null;
	result = 0;
	//taking day,month and year in a string.
	temp = ""+String.format("%02d",i)+""+String.format("%02d",j)+""+y;
//converting string into integer
	sum = Integer.parseInt(temp);
	
	int temp2 = sum;
	//logic to reverse the number.
	while(temp2!=0)
	{
		result = (result * 10) + (temp2%10);
		temp2 = temp2/10;
		
	}
	//System.out.println(sum+" "+result);
	//if reverse num is equal then
	if(result == sum)
	{
		System.out.println(i+"-"+j+"-"+y+" (DD-MM-YYYY)");
	}

	}
}
}
		
	}


