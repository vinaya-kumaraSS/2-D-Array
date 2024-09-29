package A_2D_Array;

public class Spiral_Array {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int startRow = 0;
		int startColumn = 0;
		int endRow = arr.length-1;
		int endColumn = arr[0].length-1;
		while(startRow <= endRow && startColumn <= endColumn) {
			
//			top
			for(int i=startColumn; i<=endColumn; i++) {
				System.out.print(arr[startRow][i]+" ");
			}
//			right
			for(int j=startColumn+1; j<=endColumn; j++) {
				System.out.print(arr[j][endColumn]+" ");
			}
//			bottom
			for(int i=endColumn-1; i>=startColumn; i--) {
				if(startRow == endRow) {
					break;
				}
				System.out.print(arr[endRow][i]+" ");
			}
//			left
			for(int j=endRow-1; j>=startRow+1; j--) {
				if(startColumn == endColumn) {
					break;
				}
				System.out.print(arr[j][startColumn]+" ");
			}
			startRow++;
			startColumn++;
			endRow--;
			endColumn--;
		}
	}
}
