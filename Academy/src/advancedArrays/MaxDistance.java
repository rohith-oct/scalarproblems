package advancedArrays;

public class MaxDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {7,6,5,4,3,2,1};
		int s=0,n=A.length,e=n-1;
		int maxSum=Integer.MIN_VALUE;
		while(s<=e){
		if(A[s]<=A[e]){
		maxSum=Math.max(maxSum,e-s);
		s++;
		e=n-1;
		}else{
		e--;
		}
		}
		
		System.out.println(maxSum);
	}

}
