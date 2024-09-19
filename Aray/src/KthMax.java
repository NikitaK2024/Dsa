import java.util.Arrays;

public class KthMax {
	
	public static int largest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[arr.length-k];
		
	}
	
	public static void main(String[] args) {
	
		
		
		int[] arr= {344,2,55,37,9};
		int k=2;
		int lar=largest(arr, k);
		 System.out.println(lar);
	}

}
