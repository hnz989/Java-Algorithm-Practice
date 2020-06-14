class Link5{
	public double data;
	public Link5 next;
	public Link5(double key) {
		data = key;
	}
	public void displayLink() {
		System.out.println("{ "+data+" }");
	}
}
class LinkedList{
	private Link5 first;
	private Link5 last;
	public LinkedList() {
		first = null;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	public void insertFirst(double key) {
		Link5 newLink = new Link5(key);
		if(isEmpty()) {
			last = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	public void insertLast(double key) {
		Link5 newLink = new Link5(key);
		if(isEmpty()) {
			first = newLink;
		}else {
			last.next = newLink;
		}
		last = newLink;
	}
	public double deleteFirst() {
		double temp = first.data;
		if(first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}
	public void displayList() {
		Link5 current = first;
		System.out.println("List all the elements:");
		while(current!=null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
class StackList{
	private LinkedList theList;
	public StackList(LinkedList List1) {
		theList = List1;
	}
	public void push(double key) {
		theList.insertFirst(key);
	}
	public double pop() {
		return theList.deleteFirst();
	}
	public boolean stackEmpty() {
		return (theList.isEmpty());
	}
	public void displayStck() {
		theList.displayList();
	}
}
public class StackListAPP {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.insertFirst(33.33);       
		myList.insertFirst(22.22);
		myList.insertFirst(11.11);
	    
		myList.insertLast(44.44);     
		myList.insertLast(55.55);
		myList.insertLast(66.66);
		StackList myStack = new StackList(myList);
		myStack.displayStck();
		myStack.push(77.77);
		myStack.push(88.88);
		myStack.displayStck();
		myStack.pop();
		myStack.pop();
		myStack.displayStck();
	}

}
