import java.io.*;    
class Link9{
	public long Ddata;
	public Link9 next;
	public Link9(long data) {
		Ddata = data;
	}
	public void displayLink() {
		System.out.println("{ "+Ddata+" }");
	}
}
class LinkList9{
	private Link9 first;
	public LinkList9() {
		first = null;
	}
	public boolean isEmpty() {
		return(first==null);
	}
	public Link9 getFirst() {
		return first;
	}
	public void setFirst(Link9 f) {
		first = f;
	}
	public IteratorList getIterator() {
		return new IteratorList(this);
	}
	public void displayList() {
		Link9 current = first;
		while(current!=null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
class IteratorList {
	private Link9 current;
	private Link9 previous;
	private LinkList9 theList;
	public IteratorList(LinkList9 list) {
		theList = list;
		reset();
	}
	public void reset() {
		current = theList.getFirst();
		previous = null;
	}
	public boolean atEnd() {
		return (current.next==null);
	}
	public void nextLink() {
		previous = current;
		current = current.next;
	}
	public Link9 getCurrent() {
		return current;
	}
	public void insertAfter(long dd) {
		Link9 newLink = new Link9(dd);
		if(theList.isEmpty()) {
			theList.setFirst(newLink);
			current = newLink;
		}else {
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
	}
	public void insertBefore(long dd) {
		Link9 newLink = new Link9(dd);
		if(previous==null) {
			newLink.next = theList.getFirst();
			theList.setFirst(newLink);
			reset();
		}else {
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
	}
	public long deleteCurrent() {
		long temp = current.Ddata;
		if(previous==null) {
			theList.setFirst(current.next);
			reset();
		}else {
			previous.next = current.next;
			if(atEnd()) {
				reset();
			}else {
				current = current.next;
			}
		}
		return temp;
	}
}
public class IteratorAPP {

	public static void main(String[] args) throws IOException
	{
		LinkList9 theList = new LinkList9();
		IteratorList iter = theList.getIterator();
		long value;
		iter.insertAfter(20);
		iter.insertAfter(40);
		iter.insertAfter(80);
		iter.insertBefore(60);
		
		while(true) {
			System.out.print("Enter first letter of show, reset, ");
			System.out.print("next, get, before, after, delete: ");
			System.out.flush();
			int choice = getChar();
			switch(choice) {
			case 's':
				if(!theList.isEmpty()) {
					theList.displayList();
				}else {
					System.out.println("List is Empty");
				}
				break;
			case 'r':
				iter.reset();
				break;
			case 'n':
				if(!theList.isEmpty()&&!iter.atEnd()) {
					iter.nextLink();
				}else {
					System.out.println("Can't go to next link");
				}
				break;
			case 'g':
				if(!theList.isEmpty()) {
					value = iter.getCurrent().Ddata;
					System.out.println("Returned: "+value);
				}else {
					System.out.println("List is empty");
				}
				break;
			case 'b':
				System.out.print("Enter value to insert: ");
				System.out.flush();
				value = getInt();
				iter.insertBefore(value);
				break;
			case 'a':
				System.out.print("Enter value to insert: ");
				System.out.flush();
				value = getInt();
				iter.insertAfter(value);
				break;
			case 'd':
				if(!theList.isEmpty()) {
					value = iter.deleteCurrent();
					System.out.println("Deleted: "+value);
				}else {
					System.out.println("Can't delete");
				}
				default:
					System.out.println("Invalid entry");
			}
		}
	}

	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	public static char getChar() throws IOException
	{
		String s = getString();
		return s.charAt(0);
	}
	public static int getInt() throws IOException
	{
		String s = getString();
		return Integer.parseInt(s);
	}
}
