package Com;

import java.io.*;

public class Solution {

    // Complete the divisibleSumPairs function below.

    public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String input = br.readLine();
String inp[] = input.split(" ");

int n = Integer.parseInt(inp[0]);
int divide = Integer.parseInt(inp[1]);

String value = br.readLine();
String val[] = value.split(" ");
int ar[] = new int[n];

for(int i=0; i<n; i++)
{
ar[i] = Integer.parseInt(val[i]);
}


int count = 0;

for(int i=0; i<n; i++)
{
    for(int j=i+1; j<n; j++)
    {
        if((ar[i]+ar[j])%3==0)
        {
            count += 1;
            System.out.println(ar[i]+" "+ar[j]);
        }
    }
}
System.out.println(count);



    }
}
