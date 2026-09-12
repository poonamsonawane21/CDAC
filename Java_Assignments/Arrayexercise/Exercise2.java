//2. Write a Java program to sort an numeric array. The size of the array will be taken from the user, aer
//he specifies the size all the elements of the array will be taken as input and the arryay will be sorted.
public class Exercise2 {
	public static void main(String[] args) {
		System.out.println("Enetr size of array");
		int n=ConsoleInput.getInt();
		
		int[] arr=new int[n];
		
		//take array elememts
		System.out.print("Enetr array elemnts");
		for(int temp=0;temp<n;temp++) {
			arr[temp]=ConsoleInput.getInt();
			
		}
		
		for(int temp=0;temp<n-1;temp++) {
			for(int temp1=temp+1;temp1<n;temp1++) {
				if(arr[temp]>arr[temp1]) {
					int tempvar=arr[temp];
					arr[temp]=arr[temp1];
					arr[temp1]=tempvar;
				}
			}
		}
		System.out.println("Sorted array");
		for(int temp=0;temp<n;temp++) {
			System.out.print(arr[temp]+" ");
		}
	}
}
