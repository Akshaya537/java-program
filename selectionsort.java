package miniproject;

public class selectionsort {
	static void store() {
		int arr[]= {3,6,1,8,7,5};
		for(int i=0;i<arr.length-1;i++) {
			 int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
				minIndex=j;
			}
			}
				int temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
	}
		for(int num:arr) {
			System.out.println(num);
		}
}
public static void main(String[]args) {
	store();
}
}
