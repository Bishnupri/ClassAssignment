package ClassAssignment.java;

public class DuplicateArray {
	public static void main(String[]args) {
	int[]arr= new int[] {20,9,48,7,31,9,92,64,20,48};//array declaration
	
		System.out.println("Duplicate integer value");//calling for duplicate array
		for(int i=0; i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}
		
	}

}
