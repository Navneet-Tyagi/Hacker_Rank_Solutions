package Com;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class BookPagesSolution {

   static int pageCount(int n, int p) {
        int count = 0;
        
        //start from front side of book
        if(p<=(n/2))
        {
            if(p==1)
            {
            	count = 0;
            }
            else if(p==2 || p==3)
            {
                count = 1;
            }
        else{
            count = 0;
                for(int i=2; i<=p; i=i+2)
                    {
                        count += 1;
                    }
            }

        }
        //start from back side of book
        else
        {
    
    if(n%2==0)
    {
        if(p==n)
        {
            count = 0;
        }
        else
        {
            count = 0;
            for(int i=n-1; i>=p; i=i-2)
            {
                count += 1;
            }
        }
    }
    else
    {
        if(p==n || p==n-1)
        {
            count = 0;    
        }
        else
        {
            count = 0;
            for(int i=n-2; i>=p; i=i-2)
            {
                count += 1;
            }
        }
    }

    

        }
return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

	
	    public static void main(String[] args) throws IOException {
	
		        
		        int result = pageCount(7, 3);

	System.out.println(result);
		        
		    }
	}

