package Com;

public class FindDigitsSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=12;
int result = 0;
int temp = n;

while(temp!=0)
{
	int divisor = temp%10;

if(divisor!=0)
{
if(n%divisor==0)
	{
	result += 1;	
	}
}
temp = temp/10;
}
	System.out.println(result);	
	
	}

}
