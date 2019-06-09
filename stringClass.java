package Com;

public class stringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Navneet";
		StringBuffer name1 = new StringBuffer(name);
		name1.reverse();
		System.out.print("This is a reverse Function"+" "+name1+" ");
		char ch[] = new char[name.length()];
		for(int i=0; i<name.length(); i++)
		{
		ch[i] = name.charAt(i);	
		}
		
		for(int j=name.length()-1; j>=0; j--)
		{
			System.out.print(ch[j]);			
		}
		
		char ch1[]=new char[name.length()];
		name.getChars(0, name.length(), ch1, 0);
		
		byte b1[] = new byte[name.length()];
		b1 = name.getBytes();
		System.out.println(b1);
		
		for(int i=0; i<ch1.length; i++)
		{
		System.out.print(" " + ch1[i]);
		}
		
		String car[] = {"hey", "bol", "asa", "jhakas", "gyei", "Jes", "Akj"};
		
		for(int i=0; i<car.length; i++)
		{
			for(int j=i+1; j<car.length; j++)
			{
				if(car[i].compareTo(car[j]) > 0)
				{
					String get = car[i];
					car[i] = car[j];
					car[j] = get;
				}
			}
		}
		
		for(int i=0; i<car.length; i++)
		{
			System.out.print(" "+car[i]);	
		}
		

	}

}
