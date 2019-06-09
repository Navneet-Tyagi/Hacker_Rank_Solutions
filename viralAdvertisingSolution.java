package Com;

public class viralAdvertisingSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 3;

int likes = 2;
int shares = 3;
int totalLikes = 2;


for(int i=1; i<n; i++)
{
int temp = ( likes * shares ) / 2;
likes = temp;
totalLikes += temp;
}

System.out.println(totalLikes);
	}

}
