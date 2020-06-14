class Link3{
	public double data;
	public Link3 next;
	public Link3 previous;
	public Link3(double d) {
		data = d;
	}
	public void dispayLink() {
		System.out.println("{ "+data+" }");
	}
}
class DoubleLink{
	private Link3 first;
	private Link3 last;
	public DoubleLink() {
		first = null;
		last = null;
	}
	public void insertFirst(double key) {
		Link3 newList = new Link3(key); 
        if(isEmpty()) {
        	last = newList;
        }else {
        	first.previous = newList; 
        }
		newList.next = first;
        first = newList;
	}
	public void insertLast(double key) {
		Link3 newList = new Link3(key);
		if(isEmpty()) {
			first = newList;
		}else {
			last.next = newList;
			newList.previous = last;
		}
		
		last = newList;
	}
	public void insertAfter(double dd, double key) {
		Link3 current = first;
		while(current.data!=dd) {
			current = current.next;
            if(current == null) {
                System.out.println("Can't find target to insert after!");
            }
		}
		Link3 newList = new Link3(key);
		if(current==last) {
			newList.next = null;
			last = newList;
		}else {
	        newList.next = current.next;
	        current.next.previous = newList;
		}
		newList.previous = current;
		current.next = newList;
		System.out.println("Insert "+newList.data+" after "+current.data);
	}
	public Link3 deleteFirst() {
		Link3 temp = first;
		if(first == null) {
			System.out.println("Empty list!");
			temp = null;
			return temp;
		}else {
			if(first.next == null) {
				last = null;
			}else {
				first.next.previous = null;
			}
			first = first.next;
			return temp;
		}
	}
	public Link3 deleteLast() {
		Link3 temp = last;
		if(first == null) {
			System.out.println("Empty list!");
			temp = null;
			return temp;
		}else {
			if(first.next == null) {
				first = null;
			}else {
				last.previous.next = null;
			}
			last = last.previous;
			return temp;
		}
	}
	public Link3 deleteKey(double key) {
		Link3 current = first;
		while(current.data != key) {
			current = current.next;
			if(current == null) {
				return null;
			}
		}
		if(current == first) {
			first = current.next;
		}else {
			current.previous.next = current.next;
		}
		if(current == last) {
			last = current.previous;
		}else {
			current.next.previous = current.previous;
		}
		return current;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	public void displayForward() {
		System.out.println("Forward Listing All Items: ");
		Link3 current = first;
		while(current!=null) {
			current.dispayLink();
			current = current.next;
		}
		System.out.println("");
	}
	public void displayBackward() {
		System.out.println("Backward Listing All Items: ");
		Link3 current = last;
		while(current!=null) {
			current.dispayLink();
			current = current.previous;
		}
		System.out.println("");
	}
	
}
public class DoubleLinkAPP {

	public static void main(String[] args) {
		DoubleLink theList = new DoubleLink();
		double key = 3.99;
		theList.insertFirst(3.99);
		theList.insertFirst(2.99);
		theList.insertFirst(1.99);
		theList.insertFirst(0.99);     
	   
		theList.insertLast(4.99);
	    theList.insertLast(5.99);
	    theList.insertLast(6.99);
	    theList.insertLast(7.99);
	    theList.insertLast(8.99);
		
	    theList.displayForward();
	    theList.displayBackward();
	    
	    theList.deleteFirst();
	    theList.deleteLast();
	    theList.deleteKey(key);
	    
	    theList.displayForward();
	    
	    theList.insertAfter(6.99, 10.10);
	    theList.insertAfter(5.99, 15.10);
	    
	    theList.displayForward();
	}

}
