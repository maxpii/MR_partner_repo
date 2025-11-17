/*
Part 1 : Write a method that will create a square array (with a user specified size) and is filled
with random numbers between 1- 10. COMMIT



Part 2: Write methods that will analyze a 2D array and will complete the following tasks.  Keep
in mind that your code will change as you complete the tasks.
Return the first even number that you find when looping via row major order. COMMIT
Return the first even number whose neighbors (elements to the left and right) have a sum that is
greater than 17. COMMIT
Return the first odd number whose neighbors in all directions (above, below, left, right) have a
sum that is greater than 33. COMMIT


Part 3: Refractor code using the “never nester” paradigm. COMMIT

*/
public class Project{

	public int[][] Part1(int size){
		int[][] arr = new int[size][size];
		for(int i = 0; i<size; i++){
			for(int j = 0; j<size; j++){
				arr[i][j] = (int)(Math.random()*10)+1;
			}
		}
		return arr;
	}

	public int Part2(int[][] arr){
		int rows = arr.length;
		int cols = arr[0].length;
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<cols; j++){
				if(arr[i][j]%2==0) return arr[i][j];
			}
		}
		return 0;
	}

	public static void main(String[] args){
		Project project = new Project();
	}
}