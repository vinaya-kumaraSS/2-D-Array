package A_2D_Array;
public class Search_Element {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int key = 1;
		searchKey(arr, key);
	}
	public static void searchKey(int[][] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j] == key) {
					System.out.println("row :"+i+" column :"+j);
					break;
				}
			}
		}
		System.out.println("not found");
	}
}
