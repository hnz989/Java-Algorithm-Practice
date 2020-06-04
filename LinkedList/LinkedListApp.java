class Link{
	public int id;
	public double data;
	public Link next;
	public Link(int n, double d) {
		id = n;
		data = d;
	}
	public void displayLink() {
		System.out.println("{ "+id+" + "+data+" }");
	}
}
class LinkList{
	private Link first;
	public LinkList(){
		first = null;
	}
	public void insert(int i , double d) {
		Link newLink = new Link(i , d);
		newLink.next = first;
		first = newLink;
	}
	public Link delete() {
		Link temp;
		temp = first;
		first = first.next;
		return temp;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	public void displayList() {
		Link current = first;
		System.out.println("List all the items: ");
		if(current == null) {
			System.out.println("Empty!");
		}
		while(current!=null) {
			current.displayLink();
			current = current.next;
		}

		System.out.println("");
	}
}
public class LinkedListApp {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
	    theList.insert(9, 0.99);     
	    theList.insert(8, 1.99);
	    theList.insert(7, 2.99);
	    theList.insert(6, 3.99);
	    theList.insert(5, 4.99);
	    theList.insert(4, 5.99);
	    theList.insert(3, 6.99);
	    theList.insert(2, 7.99);
	    theList.insert(1, 8.99);
	    
	    theList.displayList();
	    
	    theList.delete();
	    
	    theList.displayList();
	    
	    theList.delete();
	    
	    theList.displayList();
	    
	    while(!theList.isEmpty()) {
	    	Link temp = theList.delete();
	    	System.out.print("Deleted: ");
	    	temp.displayLink();
	    	System.out.println("");
	    }
	    theList.displayList();

	}

}
