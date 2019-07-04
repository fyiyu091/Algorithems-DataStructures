package algorithms;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] vals = {1};
        int [] weights = {5};
        int tweight = 0;
        int res = onezeroknapsack(vals, weights, tweight);
        System.out.println(res);
	}

	//0/1 knapsack problem
	public static int onezeroknapsack(int[] val, int[] weight, int totalweight) {
		//Create a matrix, row is the size of items, col is the totalweight+1
		int [][] matrix = new int[val.length][totalweight+1];
		//Initialize the matrix row0 and col0
		for (int i=0; i<matrix.length; i++) {
			matrix[i][0] = 0;
		}
		for (int j=1; j<matrix[0].length; j++) {
			if (j>=weight[0]) {
				matrix[0][j] = val[0];
			}
		}
		//Finished the initialize, using dp to finish the matrix
		for (int i=1; i<matrix.length; i++) {
			for (int j=1; j<matrix[0].length; j++) {
				if (j < weight[i]) {
					matrix[i][j] = matrix[i-1][j];
				}
				else {
					int tmp = Math.max(val[i]+matrix[i-1][j-weight[i]], matrix[i-1][j]);
					matrix[i][j] = tmp;
				}
			}
		}
		return matrix[val.length-1][totalweight];
	}
}
