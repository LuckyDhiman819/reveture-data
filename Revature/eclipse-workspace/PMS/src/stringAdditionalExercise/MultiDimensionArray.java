package stringAdditionalExercise;

import java.util.Arrays;

public class MultiDimensionArray {
	
	public void sumOfMatrixes(int arr1[][], int arr2[][]) {
		int i,j;
		int len1;
		int len2;
		int sum[][];
		
		if(arr1.length==arr2.length) {
			 len1 = arr1.length;
			 len2 = arr1[0].length;
			 sum = new int[len1][len2];
			for(i = 0; i<arr1.length; i++) {
				if(arr1[i].length==arr2[i].length) {
					for( j = 0; j<arr1[i].length; j++) {
						sum[i][j] = arr1[i][j]+arr2[i][j];
					}
				}
				
			}
//			
			System.out.println(Arrays.deepToString(sum));
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][] = {{9,8,7},{6,5,4},{3,2,1}};
		MultiDimensionArray m = new MultiDimensionArray();
		m.sumOfMatrixes(arr1, arr2);

	}

}
