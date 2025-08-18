package miniproject;

public class array {
	public static void main(String[] args) {
	int [] arr= {-2,9,7,5,-3};
	for(int i=0;i<arr.length-1;i++) {
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}
	for(int l:arr) {
		System.out.println(l);
	}
}
}
