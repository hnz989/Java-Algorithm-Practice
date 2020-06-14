class Link8{
	public long Ddata;
	public Link8 next;
	public Link8(long data) {
		Ddata = data;
	}
	public void displayLink() {
		System.out.println("{ "+Ddata+" }");
	}
}
class InsertionList{
	private Link8 first;
	public InsertionList() {
		first = null;
	}
	public InsertionList(Link8[] linkArr) {
		first = null;
		for(int i=0;i<linkArr.length;i++) {
			insert(linkArr[i]);
		}
	}
	public void insert(Link8 d) {
		Link8 previous = null;
		Link8 current = first;
		while(current != null && d.Ddata > current.Ddata) {
			previous = current;
			current = current.next;
		}
		if(previous == null) {
			first = d;
		}else {
			previous.next = d;
		}
		d.next = current;
	}
	public Link8 remove() {
		Link8 temp = first;
		first = first.next;
		return temp;
	}
}
public class InsertionListAPP {

	public static void main(String[] args) {
		int size = 10;
		Link8[] linkArr = new Link8[size];
		
		for(int j=0;j<size;j++) {
			int n = (int)(java.lang.Math.random()*99);
			Link8 newLink = new Link8(n);
			linkArr[j] = newLink;
		}
		System.out.println("Unsorted array: ");
        for(int i=0;i<size;i++) {
        	System.out.println(linkArr[i].Ddata+" ");
        }
        System.out.println("");
        
        InsertionList theList = new InsertionList(linkArr);
        for(int i=0;i<size;i++) {
        	linkArr[i] = theList.remove();
        }
        System.out.println("Sorted array: ");
        for(int i=0;i<size; i++) {
        	System.out.println(linkArr[i].Ddata+"");
        }
        System.out.println("");
	}

}
