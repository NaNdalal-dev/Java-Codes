class BubbleSort {
	int[] arr;
	int temp;
	BubbleSort(int[] array){
		arr=array;
	}
	public  void getSorted(boolean ascending){
		for(int j=arr.length-1; j>0; j-=1){
			for(int i=0; i<j; i+=1){
				
				if(arr[i]>arr[i+1]){
					//Swap
					arr[i] = arr[i]^arr[i+1];
					arr[i+1] = arr[i]^arr[i+1];
					arr[i] = arr[i]^arr[i+1];
					/*temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]=temp;*/
				}
				for(int k=0;k<arr.length;k+=1){
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}
	public static void main(String[] args){
		int[] arr = {1,2,3,0,-1,-2};
		BubbleSort b = new BubbleSort(arr);
		b.getSorted(true);
		
	}
}