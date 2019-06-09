package Com;

public class CatAndMouseSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 2;
int x[] = {1,1};
int y[] = {2,3};
int z[] = {3,2};
	
for(int i=0; i<n; i++)
{
int ResultX = Math.abs(x[i]-z[i]);
int ResultY = Math.abs(y[i]-z[i]);

if (ResultX==ResultY)
{
System.out.println("Mouse C");	
}
else if(ResultX<ResultY)
{
System.out.println("Cat A");
}
else
{
System.out.println("Cat B");	
}
}
	
	}

}
