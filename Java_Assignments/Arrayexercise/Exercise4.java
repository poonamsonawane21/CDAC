//Write a Java program to copy an array by itera&ng the array
public class Exercise4 {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		int n = ConsoleInput.getInt();
		
		int[] arr = new int[n];
		int[] copy = new int[n];
		
		System.out.println("Enter array elements");
		
		// Store elements in original array
		for (int i = 0; i < n; i++) {
			arr[i] = ConsoleInput.getInt(); 
		}
		// Copy elements one by one
		for (int i = 0; i < n; i++) {
			copy[i] = arr[i];
		}
		// Display copied array
		System.out.println("Copied array");
		for (int i = 0; i < n; i++) {
			System.out.println(copy[i]);
		}
	}

}
