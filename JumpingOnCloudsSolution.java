package Com;

public class JumpingOnCloudsSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c[] = {0,0,1,0,0,1,1,0};
		int k=2;
		int energy = 100;
		
		for(int i=0; i<c.length; i+=k) {
			if(c[i]==0)
			{
				energy -= 1;
			}
			else
			{
				energy -= 3;
			}
		}
		
		System.out.println(energy);
		
	}

}
