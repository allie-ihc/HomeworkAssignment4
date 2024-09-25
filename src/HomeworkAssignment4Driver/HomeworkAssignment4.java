package HomeworkAssignment4Driver;

public class HomeworkAssignment4 {

	public static void main(String[] args) {
		int[][] arr = {{1,  2, 3, 4},
		        {5,  6, 7, 8},
		        {9, 10,11,12}};
		int [] ans = MatrixSearch(arr,5);
		System.out.println(ans[0] + " " + ans[1]);
		int [] ans2 = MatrixSearch(arr,11);
		System.out.println(ans2[0] + " " + ans2[1]);

	}
	public static int[] MatrixSearch(int[][] arr, int key) {
		int start = 0;
		int end = arr.length * arr[0].length - 1;
		int numCols = arr[0].length;
		while (start < end)
		{
			int mid = (end+start)/2;
			int r = mid / numCols;
			int c = mid % numCols;
			if ( arr[r][c] == key)
			{
				return new int[] {r,c};
			}
			else if (arr[r][c] < key)
			{
				start +=1;
			}
			else if (arr[r][c] > key)
			{
				end -=1;
			}
		}
		return new int[] {-1,-1};
		
	}
}
