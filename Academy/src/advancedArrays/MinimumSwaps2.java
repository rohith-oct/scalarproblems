package advancedArrays;

public class MinimumSwaps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3, 4, 0};
		int n = A.length;
		int count=0;
		int i=0;
		while(i<n) {
			while(i != A[i]) {
				swap(A,i,A[i]);
				count++;
			}
			i++;
		}
		System.out.println(count);
		
	}
	
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i]=A[j];
		A[j]=temp;
		
	}

}
