import java.util.Scanner;

public class MaximumANDValue {

	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int msb = 1;
		msb = msb<<30;
		int maxValue = 0;
		int mask = msb;
		for(int i=31;i>0;i--) {
			
			int count = 0;
			for(int j=0;j<n;j++) {
				
				if((mask&arr[j])==mask) {
					count++;
				}
				
			}
			
			if(count>=2) {
				
				maxValue = maxValue | msb;
				
			}
			
			msb = msb>>1;
			mask= msb|maxValue;
			
			
		}
		
		System.out.println(maxValue);
		
	}
	 
}
