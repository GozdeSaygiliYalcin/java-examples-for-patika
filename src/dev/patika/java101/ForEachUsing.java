package dev.patika.java101;

public class ForEachUsing {

	public static void main(String[] args) {
		
		int [] list = {1,2,3,4};
		int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
		
		int sum = 0;
		
		for(int i: list) {
			sum += i;
		}
		System.out.println(sum);
		
		   for (int[] row : matrix) {
	            for (int col : row) {
	                System.out.print(col +",");
	            }
	            System.out.println();
	}

}
}