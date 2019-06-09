package Com;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
return count;
*/

public class ChoclateCountSolution {


		    public static void main(String[] args) throws IOException {

		    	int n = 5;
				int s[] = {2,2,1,3,2};
				int m=2;
				int d=4;
				int result=0;
				
				
				for(int i=0; i<s.length-(m-1); i++){
					int count=0;
				for(int j=(i+m)-1; j>=i; j--)
				{
				count += s[j];	
				}
				if(count==d)
				{
					result += 1;
				}
				}   
				System.out.println(result);
				}			
		    
		    }


