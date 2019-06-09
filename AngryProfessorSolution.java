package Com;

public class AngryProfessorSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {-1,-3,4,2};
int k=3;
int count = 0;

for(int i=0; i<a.length; i++)
{
if(a[i]<=0)
{
	count +=1;
}
}

System.out.println(count);
if(count<k)
{
System.out.println("YES");
}
else
{
System.out.println("NO");	
}
	
	}

}
