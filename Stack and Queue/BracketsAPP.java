import java.io.*;
class StackZ{
	private char[] arr;
	private int num;
	private int top;
	public StackZ(int size){
		num = size;
		arr = new char[num];
		top = -1;
	}
	public void push(char key) {
		arr[++top]=key;
	}
	public char pop() {
		return arr[top--];
	}
	public char peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}
	public void display() {
		System.out.println("String before reverse:");
		if(top==-1) {
			System.out.println("Error. No string.\n");
		}else {
		    for(int i=0;i<=top;i++) {
				System.out.printf("%c",arr[i]);
			}
		}
		System.out.println("");
	}
}
class ReverseBreacket{
	private String input;
	private String output;
	public ReverseBreacket(String in) {
		input = in;
	}
	public String ReverseFun() {
		int size = input.length();
		StackZ arr = new StackZ(size);
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			arr.push(ch);			
		}
		output = " ";
		while(!arr.isEmpty()) {
			char ch2 = arr.pop();
			output +=ch2;
		}
		return output;
	}
}
class Brackets{
	private String input;
	//private String output;
	public Brackets(String in) {
		input = in;
	}
	public void BracketFunc() {
		int stackSize = input.length();
		StackZ arr = new StackZ(stackSize);
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			switch(ch)
			{
			case'{':
			case'[':
			case'(':
				arr.push(ch);
				break;
			case'}':
			case']':
			case')':
				if(!arr.isEmpty()) {
					char chx = arr.pop();
					if((ch=='}' && chx!='{')||
					   (ch==']' && chx!='[')||
					   (ch==')' && chx!='(')){
						System.out.println("Error:"+ch+"at"+i);
					}	
				}else {
					System.out.println("Error:"+ch+"at"+i);
					break;
				}
			default:
				break;
			}
		}
	    if( !arr.isEmpty() ) {
	        System.out.println("Error: missing right delimiter");
	    }else {
	    	 System.out.println("All delimiters are matched.");
	    }
	}
}
public class BracketsAPP {

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
			ReverseBreacket arr = new ReverseBreacket(input);
			output = arr.ReverseFun();
			System.out.println("Reversed sentence: " + output);
			Brackets arr2 = new Brackets(input);
			arr2.BracketFunc();
		}

	}
	public static String getString() throws IOException
	{
		InputStreamReader str = new InputStreamReader(System.in);
		BufferedReader btr = new BufferedReader(str);
		String s = btr.readLine();
		return s;
	}

}
