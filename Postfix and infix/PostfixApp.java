import java.io.BufferedReader;
import java.io.*; 
class Stack{
	private int[] arr;
	private int maxSize;
	private int num;
	private int top;
	public Stack(int size) {
		maxSize = size;
		arr = new int[maxSize];
		top = -1;
		num = 0;
	}
	public void push(int key){
		if(!isFull()) {
			arr[++top] = key;
			num++;
		}else {
			System.out.println("Stack is full!");
		}
	}
	public int pop() {
		int temp = -1;
		if(!isEmpty()) {
			temp = arr[top];
			System.out.printf("Remove item %d from Array[%d]\n", temp, top);
			top--;
			num--;
			return temp;
		}else {
			System.out.println("Stack is empty, nothing to remove!\n");
			return temp;
		}
	}
	public boolean isFull() {
		return (num == maxSize);
	}
	public boolean isEmpty() {
		return (num == 0);
	}
	public int peekN(int n) {
		return arr[n];
	}
	public void display(String s) {
		System.out.print(s);
		System.out.print("Stack(bottom-->top):\n");
		for(int i=0;i<num;i++) {
			System.out.print(peekN(i));
			System.out.print(" ");
		}
		System.out.println("");
	}
}
class ParsePost{
	private Stack myStack;
	private String input;
	public ParsePost(String s) {
		input = s;
	}
	public int doParse() {
		myStack = new Stack(20);
		char ch;
		int i;
		int num1, num2, results;
		for(i=0;i<input.length();i++) {
			ch = input.charAt(i);
			myStack.display(""+ch+" ");
			if(ch>='0' && ch<='9') {
				myStack.push((int)(ch-'0'));
			}else {
				num2 = myStack.pop();
				num1 = myStack.pop();
				switch(ch) {
				case '+':
					results = num1 + num2;
					break;
				case '-':
					results = num1 - num2;
					break;
				case '*':
					results = num1 * num2;
					break;
				case '/':
				    results = num1 / num2;
				    break;
				default:
					results = 0;
				}
			myStack.push(results);
			}
		}
	results = myStack.pop();
	return results;
	}
}
public class PostfixApp {

	public static void main(String[] args) throws IOException
	{
		String input;
		int output;
		while(true) {
			System.out.print("Enter postfix: ");
			System.out.flush();
			input = getString();
			if(input.equals("")) {
				break;
			}
			ParsePost parser = new ParsePost(input);
			output = parser.doParse();
			System.out.println("Evaluates to "+output);
		}
	}
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
