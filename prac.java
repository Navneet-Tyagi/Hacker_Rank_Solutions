package Com;

class o
{
int num;
o(int num)
{
	this.num = num;
	System.out.println(num);
}
}

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 0;
for(int j=0; j<5; j++)
{
new o(i);
i += 1; 
}
	}

}
