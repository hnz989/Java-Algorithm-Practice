
class StackX{
	private int max;
	private int[] arr;
	private int top;
	public StackX(int size) {
		max = size;
		arr = new int[max];
		top = -1;
	}
	public void push(int data) {
		arr[++top] = data;
	}
	public int pop() {
		return arr[top--];
	}
	public int peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top==max-1);
	}
	public void dispayStack() {
		for(int i=0;i<=top;i++) {
			System.out.printf("Display Stack[%d] is %d.\n",i, arr[i]);
		}
	}
}
public class StackAPP {

	public static void main(String[] args) {
		StackX arr = new StackX(100);
		arr.push(10);
		arr.push(16);
		arr.push(18);
		arr.push(20);
		arr.push(11);
		arr.dispayStack();
		/*while(!arr.isEmpty()) {
			int data = arr.pop();
			System.out.print(data);
			System.out.print(" ");
		}
        System.out.println("");*/
		arr.pop();
		arr.pop();
		System.out.println(" ");
		arr.dispayStack();
	}

}
