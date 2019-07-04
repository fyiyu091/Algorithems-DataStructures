package algorithms;

//Longest common subsequence
public class Longestcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcdef";
		String str2 = "appppppppbcf";
	    String res = lcs(str1, str2);
		System.out.println(res);

	}
	
	public static String lcs(String str1, String str2) {
		StringBuilder res = new StringBuilder();
		//Builder the matrix, row = str1+1, col = str2+1
		int row = str1.length()+1;
		int col = str2.length()+1;
		int matrix[][] = new int[row][col];
		//Initialize the row[0] and col[0] to be 0 for start
		for (int i=0; i<row; i++) {
			matrix[i][0] = 0;
		}
		for (int j=0; j<col; j++) {
			matrix[0][j] = 0;
		}
		//The matrix is build up
		for (int i=1; i<row; i++) {
			for (int j=1; j<col; j++) {
				if (str1.charAt(i-1) == str2.charAt(j-1)) {
					matrix[i][j] = matrix[i-1][j-1]+1;
				}
				else {
					matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]);
				}
			}
		}
		//Get the chars based on the matrix
		for (int j=col-1; j>=1; j--) {
			int i = row-1;
			if (matrix[i][j] != matrix[i][j-1]) {
				res.append(str2.charAt(j-1));
				i--;
			}
		}
		return res.reverse().toString();
	}

}
