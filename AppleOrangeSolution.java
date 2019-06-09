package Com;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class AppleOrangeSolution {

	    // Complete the countApplesAndOranges function below.
	    
	    public static void main(String[] args) {
	    	try {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	String tempS = br.readLine();
	    	String tempST[] = tempS.split(" ");
	    	int s = Integer.parseInt(tempST[0]); //house start point
	    	int t = Integer.parseInt(tempST[1]); //house end point
	    	
	    	String tempA = br.readLine();
	    	String tempAB[] = tempA.split(" ");
	    	int a = Integer.parseInt(tempAB[0]); //Apple tree
	    	int b = Integer.parseInt(tempAB[1]); //Orange tree
	    	
	    	String tempM = br.readLine();
	    	String tempMN[] = tempM.split(" ");
	    	int m = Integer.parseInt(tempMN[0]); //no. of apples thrown
	    	int n = Integer.parseInt(tempMN[1]); //no. of orange thrown
	    	
	    	String tempApples = br.readLine();
	    	String apples[] = tempApples.split(" ");
	    	
	    	String tempOrange = br.readLine();
	    	String oranges[] = tempOrange.split(" ");
	    	
	    	int applesN[] = new int[m];
	    	int orangesN[] = new int[n];
	    	
	    	int countApples=0;
	    	int countOrange=0;
	    	
	    	for(int i = 0; i<m; i++) {
	    		applesN[i] = Integer.parseInt(apples[i]);
	    		int temp = applesN[i] + a;
	    	
	    	if(temp >= s && temp <= t) {
	    		countApples= countApples + 1;
	    	}
	    	
	    	}
	    	
	    	for(int j = 0; j<n; j++) {
	    		orangesN[j] = Integer.parseInt(oranges[j]);
	    		int temp = orangesN[j] + b;
	    		
	    		if(temp >=s && temp <= t) {
	    			countOrange = countOrange + 1;
	    		}
	    	}
	    	
System.out.println(countApples);
System.out.println(countOrange);
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
	    
	    }
	}
