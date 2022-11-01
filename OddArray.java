package ClassAssignment.java;

public class OddArray {
	public static void main(String[]args) {
		int[]array=new int[] {12,9,38,59,17};//array initialize
		System.out.println("array elements present in odd position");
		for(int i = 0;i<array.length;i=i+2) {//array increment value of i by 2
			System.out.println(array[i]);
			
		}
	}

}
