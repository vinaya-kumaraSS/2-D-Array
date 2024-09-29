package A_2D_Array;

public class Search_In_Sorted_Matrix {
	public static void main(String[] args) {
		int[][] matrix = {
				{1,3,5,7},
				{10,11,16,20},
				{23,30,34,60},
		};
		int key = 30;
		staircaseSearch(matrix, key);
		
	}
	public static boolean staircaseSearch(int[][] matrix, int key) {
		int row = 0;
		int column = matrix.length-1;
		while(row < matrix.length && column >=0) {
			if(matrix[row][column] == key) {
				System.out.println("row :"+row+" column :"+column);
				return true;
			}
			else if(key > matrix[row][column]) {
				row++;
			}
			else {
				column--;
			}
		}
		return false;
	} 
}
