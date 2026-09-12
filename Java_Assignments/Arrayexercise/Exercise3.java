//Write a Java program to sum values of an array and average,min,max,reverse
public class Exercise3 {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		int n = ConsoleInput.getInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter array elements");
		for (int i = 0; i < n; i++) { 
			arr[i] = ConsoleInput.getInt();
		}
		int sum=0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		double average=(double)sum/n;
		
		// Find maximum and minimum
		int max = arr[0];
		int min = arr[0]; 
		for (int i = 1; i < n; i++) { 
			if (arr[i] > max) {
				max = arr[i]; 
			}
			if (arr[i] < min) {
				min = arr[i]; 
			}
		}
		
		// Print array in reverse order
		System.out.println("Reverse array");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
			System.out.println();
		}
		
		
		// Find duplicate values
		System.out.println("Duplicate values:"); 
		for (int i = 0; i < n; i++) { 
			for (int j = i + 1; j < n; j++) { 
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]); 
				}
			} 
		}
		
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
		System.out.println("Maximum = " + max);
		System.out.println("Minimum = " + min);
		
		
	}

}
