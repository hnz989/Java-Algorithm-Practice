import java.io.*; 
class StackY{
	private int max;
	private char [] arr;
	private int top;
	public StackY(int size) {
		max = size;
		arr = new char[max];
		top = -1;
	}
	public void push(char data) {
		arr[++top] = data;
	}
	public char pop() {
		return arr[top--];
	}
	public char peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return(top==-1);
	}

	public void dispayStack() {
		for(int i=0;i<=top;i++) {
			System.out.printf("Display Stack[%d] is %d.\n",i, arr[i]);
		}
	}
}
class Reverse{
	private String input;
	private String output;
	public Reverse(String in) {
		input = in;
	}	
	public String doRev() {
		int stac_size = input.length();
		StackY theStack = new StackY(stac_size);
		
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			theStack.push(ch);
		}
		output = "";
		while(!theStack.isEmpty()) {
			char ch = theStack.pop();
			output = output + ch;
		}
		return output;
	}
}
public class ReverseApp {

	public static void main(String[] args) throws IOException
	{
		String input, output;
		while(true) {
			System.out.print("Enter a string:");
			System.out.flush();
			input = getString();
			if(input.equals("")) {
				break;
			}
			Reverse theReverse = new Reverse(input);
			output = theReverse.doRev();
			System.out.println("Reversed sentence: " + output);
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
