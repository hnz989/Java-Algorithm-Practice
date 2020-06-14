class Link6{
	public double data;
	public Link6 next;
	public Link6(double d) {
		data = d;
	}
	public void displayLink() {
		System.out.println("{ "+data+" }");
	}
}
class LinkListQ{
	private Link6 first;
	private Link6 last;
	public LinkListQ() {
		first = null;
		last = null;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	public void insertLast(double key) {
		Link6 newLink = new Link6(key);
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
		Link6 current = first;
		System.out.println("Show all the List:");
		while(current!=null) {
			current.displayLink();
			current = current.next;		
		}
		System.out.println("");
	}
}
class QueueList{
	private LinkListQ theQueue;
	public QueueList() {
		theQueue = new LinkListQ();
	}
	public boolean isEmpty() {
		return (theQueue.isEmpty());
	}
	public void insert(double key) {
		theQueue.insertLast(key);
	}
	public double remove() {
		return theQueue.deleteFirst();
	}
	public void displayQue() {
		System.out.print("List all the Queue:");
		theQueue.displayList();
	}
}
public class QueueListAPP {

	public static void main(String[] args) {
		QueueList theList = new QueueList();
		theList.insert(66.66);
		theList.insert(55.55);
		theList.insert(44.44);
		theList.insert(33.33);
		theList.insert(22.22);
		theList.insert(11.11);
		
		theList.displayQue();
		
		theList.remove();
		theList.remove();
		
		theList.displayQue();

	}

}
