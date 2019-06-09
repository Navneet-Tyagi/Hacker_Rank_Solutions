package Com;

public class overPracOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12:45:54PM";
		String temp=":";
		String Result="";
		
		if(s.charAt(8)=='P' || s.charAt(8)=='p')
		    {
			String s1[] = s.split(":");
	        int Hour = Integer.parseInt(s1[0]);
	        String Actual_Hour = "";
	        if(Hour == 12)
	        {
	        	Actual_Hour = "12";
	        }
	        else
	        {
	           	int data = 12 + Hour;
	        	Actual_Hour = String.valueOf(data);
	        }
	        
	        
	        Result = Actual_Hour +temp+s1[1]+temp+s1[2].substring(0, 2);
		    }
		    else
		    {
		    	String s1[] = s.split(":");
		    	int Hour = Integer.parseInt(s1[0]);
		        String Actual_Hour = "";
		        if(Hour == 12)
		        {
		        	Actual_Hour = "00";
		        	Result = Actual_Hour +temp+s1[1]+temp+s1[2].substring(0, 2); 
		        }
		        else {
		        	String s2[] = s.split("AM");
			        for(int i=0; i<s2.length; i++)
			        {
			        	Result = s2[i];
			        }	
		        }
		    	
		    }
		
				System.out.println(Result);
}
}