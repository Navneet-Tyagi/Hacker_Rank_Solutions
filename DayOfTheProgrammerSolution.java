package Com;

public class DayOfTheProgrammerSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year = 1918;
String m = "09";
String Result;

if(year==2100 || year==2200 || year==2300 || year==2500 || 
year==2600 || year==2700 || year==1918)
{
System.out.println(13+".09."+year);
}
//if leap year means feb is 28
else if(year%4==0)
{
System.out.println(12+".09."+year);
}
//if not leap year means feb is 29
else
{
System.out.println(13+".09."+year);
}
		
	}

}
