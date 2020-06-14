class Link2{
	public int id;
	public double data;
	Link2 next;
	public Link2(int i, double d) {
		id = i;
		data = d;
	}
	public void displayLink2() {
		System.out.println("{ "+id+" "+data+" }");
	}	
}
class LinkList2{
	private Link2 first;
	public LinkList2(){
		first = null;
	}
	public void insert(int i, double d) {
		Link2 newlink = new Link2(i, d);
		newlink.next = first;
		first = newlink;		
	}
	public Link2 delete(double key){                          
	      Link2 current = first;              
	      Link2 previous = first;
	      while(current.data != key)
	      {
	         if(current.next == null) {
	            return null; 
	         }
	         else{
	            previous = current;         
	            current = current.next;
	         }
	      }                               
	      if(current == first) {               
	         first = first.next; 
	      }else {                              
	         previous.next = current.next;
	      }
	      return current;
	}
	public Link2 find(double key) {
		Link2 current = first;
		if(isEmpty()) {
			System.out.println("List is Empty");
			return null;
		}
		while(!isEmpty()) {
			if(current.data == key) {
				return current;
			}else {
				current = current.next;
			}
		}
		return null;
	}
	public boolean isEmpty() {
		return (first == null);
	}
    public void displayList() {
       System.out.print("List (first-->last): \n");
       Link2 current = first;      
       while(current != null)     
          {
          current.displayLink2();  
          current = current.next;  
          }
       System.out.println("");
    }
}
public class LinkList2App {

	public static void main(String[] args) {
		LinkList2 theList = new LinkList2();
		double key = 3.99;
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
	    
	    Link2 theKey = theList.delete(key);
	    System.out.print("Delete:");
	    theKey.displayLink2();
	    
	    theList.displayList();
	    key = 7.99;
	    theKey = theList.delete(key);
	    System.out.print("Delete:");
	    theKey.displayLink2();
	    
	    theList.displayList();


	}

}
