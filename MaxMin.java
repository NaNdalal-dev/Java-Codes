class Maximum{
	public static int getMax(int arr[]){

		if(arr.length == 0){
			System.out.println("--No Elements in Array--");
			return 0;
		}
		int max = arr[0];

		for(int i=1;i<arr.length;i++){
			if(arr[i] > max){
				max=arr[i];
			}
		}
		return max;
	}
}

class Minimum{
	public static int getMin(int arr[]){
		if(arr.length == 0){
			System.out.println("--No Elements in Array--");
			return 0;
		}
		int min = arr[0];

		for(int i=1;i<arr.length;i++){
			if(arr[i] < min){
				min=arr[i];
			}
		}
		return min;
	}
}
class MaxMin{
	public static void main(String args[]){
		int arr[] = {-1,0,1,2,-3,9,-10};
		System.out.println(Maximum.getMax(arr));
		System.out.println(Minimum.getMin(arr));
	}
}