package Com;

public class BeautifulDaysAtTheMovies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 0;
int j = 1000;
int k = 6;
int count = 0;

for(int l=i; l<=j; l++)
{
int reverse = 0;
int TempNum = l;
while(TempNum!=0)
{
reverse = reverse *10 + (TempNum%10);
TempNum = TempNum/10;
}
if(Math.abs(reverse-l)%k==0)
{
count += 1;
}
}
System.out.println(count);
	}
	
}
