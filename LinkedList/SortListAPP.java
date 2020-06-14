class Link7{
	public double Ddata;
	public Link7 next;
	public Link7(double data) {
		Ddata = data;
	}
	public void displayLink() {
		System.out.println("{ "+Ddata+" }");
	}
}
class SortList{
	private Link7 first;
	public SortList() {
		first = null;
	}
	public boolean isEmpty() {
		return(first == null);
	}
	public void insert(double key) {
		Link7 newLink = new Link7(key);
		Link7 previous = null;
		Link7 current = first;
		while(current != null && key > current.Ddata) {
			previous = current;
			current = current.next;
		}
		if(previous==null) {
			first = newLink;
		}else {
			previous.next = newLink;
		}
		newLink.next = current;
	}

	public double deleteFirst() {
		double temp = first.Ddata;
		first = first.next;
		return temp;       
	}
	public void displayList() {
		System.out.println("List all the items:");
		Link7 current = first;
		while(current!=null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}

public class SortListAPP {

	public static void main(String[] args) {
		SortList theList = new SortList();
		theList.insert(22.22);
		theList.insert(66.66);
		theList.insert(33.33);
		theList.displayList();
		theList.insert(11.11);
		theList.insert(44.44);
		theList.insert(55.55);
		theList.insert(99.99);
		theList.insert(77.77);
		theList.insert(88.88);
		theList.displayList();
		theList.deleteFirst();
		theList.deleteFirst();
		theList.displayList();				
	}

}
