class Link4{
	public double data;
	public Link4 next;
	public Link4(double d) {
		data = d;
	}
	public void displayLink() {
		System.out.println("{ "+data+" }");
	}
}
class DoubleEndList{
	private Link4 first;
	private Link4 last;
	public DoubleEndList() {
		first = null;
		last = null;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	public void insertFirst(double key) {
		Link4 newLink = new Link4(key);
		if(isEmpty()) {
			last = newLink;
		}
		newLink.next = first;
		first = newLink;	
	}
	public void insertLast(double key) {
		Link4 newLink = new Link4(key);
		if(isEmpty()) {
			first = newLink;
		}else{
			last.next = newLink;
		}
		last = newLink;
	}
	public double deleteFirst(){
	    double temp = first.data;
	    if(first.next == null) {
	    	last = null;
	    }
	    first = first.next;
	    return temp;
	}
	public void displayList() {
		System.out.println("List all the elements:");
		Link4 current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
public class DoubleEndListAPP {

	public static void main(String[] args) {
		DoubleEndList newList = new DoubleEndList();
		newList.insertFirst(33.33);       
		newList.insertFirst(22.22);
		newList.insertFirst(11.11);
	    
		newList.insertLast(44.44);     
		newList.insertLast(55.55);
		newList.insertLast(66.66);

		newList.displayList();
		
		newList.deleteFirst();
		newList.deleteFirst();
		
		newList.displayList();
	}

}
