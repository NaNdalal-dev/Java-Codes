class Recursion{
	public static int top10(int n){
		if (n == 0){
			return 0;
		}
		else{
			System.out.println(n);
			top10(n-1);
			return -1;
		}
		
	}
	
	public static void main(String[] args){
		Recursion.top10(10);
	}
}
