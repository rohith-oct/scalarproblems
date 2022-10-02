package advancedArrays;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {

	public static void main(String[] args) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(2);
		
		
		// ultimately the mod values gives two synonym
		// 1. (A[i] + i) - (A[j] + j);
		// 2. (A[i] - i) - (A[j] - j );
		// hence we need from these two ,
		int maxA= Integer.MIN_VALUE;
		int maxB= Integer.MIN_VALUE;
		int minA= Integer.MAX_VALUE;
		int minB= Integer.MAX_VALUE;
		for(int i =0;i<A.size();i++){
		maxA = Math.max(maxA,A.get(i)+i);
		maxB = Math.max(maxB,A.get(i)-i);
		minA = Math.min(minA,A.get(i) + i);
		minB = Math.min(minB,A.get(i)-i);
		}
		int val= Math.max(maxA-minA,maxB-minB);
		System.out.println(val);

	}

}
