
class Stack{
	int size,top=-1;
	int arr[];
	public Stack(int sz){
		size = sz;
		 arr = new int[size];
	}
	
	public String push(int val){
		if(top < size){
			top += 1;
			arr[top] = val;
			return "Pushed";
		}
		else{
			throw new ArrayIndexOutOfBoundsException("---Stack overflow--");
		}
	}
	
	public String pop(){
		if(top == 0){
			System.out.println("---Stack UnderFlow---");
			return "Stack UnderFlow";
			
		}
		
		else {
			System.out.println("---"+arr[top]+" poped from stack.--");
			arr[top] = 0;
			top -= 1;
			return "Poped";
		}
	}
	
	
	
	public void show(){
		if (top == 0){
			System.out.println("---Stack is Empty.---");
		}
		else{
			System.out.println("---Elements in Stack:---");
			for(int i=top; i>-1; i-=1){
				System.out.println(arr[i]);
			}
		}
	}
	
	public int peek(){
		if (top == 0){
			System.out.println("---Stack is Empty.---");
			return 0;
		}
		else{
			System.out.println("---Element on Top---");
			System.out.println(arr[top]);
			return arr[top];
		}
	}
	
}

class myStack{
	public static void main(String[] args){
		Stack stk = new Stack(5);
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.show();
		stk.peek();
		stk.pop();
		stk.show();
		stk.peek();
		stk.pop();
		stk.show();
		stk.peek();
	}
}

/*
//Output:

---Elements in Stack:---
40
30
20
10
---Element on Top---
40
---40 poped from stack.--
---Elements in Stack:---
30
20
10
---Element on Top---
30
---30 poped from stack.--
---Elements in Stack:---
20
10
---Element on Top---
20

*/
