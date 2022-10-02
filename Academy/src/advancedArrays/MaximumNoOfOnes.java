package advancedArrays;

public class MaximumNoOfOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("test");
		int[][] A = {{0, 0, 1, 1, 1},{0, 0, 0, 1, 1},{0, 0, 0, 1, 1},{0, 0, 0, 0, 1},{0, 0, 0, 1, 1}};
		
		int index = -1;
        int sum =0;
        int count =0;
        int n = A.length;
        int m = A[0].length;
        int row =0;
        int col = m-1;
        while(row<n){
            while(col>=0 && A[row][col]==1){
                count+=1;
                col--;
            }
            if(sum<count){
                sum =count;
                index = row;
            }
            row+=1;
        }
        System.out.println(index);

	}

}
