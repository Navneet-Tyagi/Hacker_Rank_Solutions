package Com;

public class LibraryFineSolution {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		//when it was return
		int d1=9;
		int m1=6;
		int y1=2015;
		//when it should return
		int d2=6;
		int m2=6;
		int y2=2015;
		
		if(y1<y2)
		{
			System.out.println("No Fine");
		}
		else if(y1==y2 && m1<m2)
		{
			System.out.println("No Fine");
		}
		else if(y1==y2 && m1==m2 && d1<d2)
		{
			System.out.println("No Fine");
		}
		else if(y1<=y2 && m1<=m2 && d1<=d2)
		{
			System.out.println("No Fine");
		}
		else if(y1>y2)
		{
			System.out.println("Late in years");
			System.out.println("10000");
		}
		else if(y1<=y2 && m1>m2)
		{
			System.out.println("Late in months");
			System.out.println(500*(m1-m2));
		}
		else
		{
			System.out.println("Late in days");
			System.out.println(15*(d1-d2));
		}
		
	}

}
