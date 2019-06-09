package Com;

public class CountingValleysSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=8;
String s= "UDDDUDUU";
int level=0;
int valleys=0;

char ch[] = s.toCharArray();

for(int i=0; i<n; i++)
{
if(ch[i]=='U')
{
level +=1;	
}
else
{
level -= 1;	
}

if(level==0  && ch[i]=='U')
{
valleys += 1;	
}
}
System.out.println(valleys);
	}

}
