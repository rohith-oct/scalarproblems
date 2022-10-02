package advancedArrays;

public class MinimumSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 12, 8, 8, 3, 14, 10, 5};
		int B =8;
		int n = A.length;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(A[i]<=B) {
				count+=1;
			}
		}
		
		int ans =count;
		int current=0;
		int left = 0;
		int right =0;
		while(right<n) {
			if(A[right]<=B) {
				current+=1;
			}
			right++;
			if(right-left<count) {
				continue;
			}
			ans=Math.min(ans, count-current);
			if(A[left]<=B) {
				current--;
				
			}
			left++;
		}
		System.out.println(ans);
	}

}
