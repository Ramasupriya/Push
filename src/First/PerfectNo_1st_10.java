package First;

public class PerfectNo_1st_10 {

	public static void main(String[] args) {
		int s=10;
		int sum=0;

		for(int i=1; i<=s; i++) {
			for(int j=1; j<=i/2; j++) {
				if(i%j==0) {
					sum+=j;
				}
				
			}
			if(sum==i) {
				System.out.println(i);
			}
			s++;

			
		}
	}

}
