class ArrayBubble {
	private int[] a;
	private int num;
	public ArrayBubble(int size) {
		a = new int[size];
		num = 0;
	}
	public void insert(int data) {
		a[num] = data;
		num++;
	}
	public void find (int key) {
		int i;
		for(i=0;i<num;i++) {
			if(a[i]==key) {
				break;
			}
		}
		if(i==num) {
			System.out.println("Can't find the item.\n");
		}else {
			System.out.printf("Find %d at Array[%d].\n", key, i);
		}
	}
	public void delete(int key) {
		int i;
		for(i=0;i<num;i++) {
			if(a[i]==key) {
				break;
			}
		}
		if(i==num) {
			System.out.println("Error. Can't find the delete target.\n");
		}else {
			for(int k=i;k<num-1;k++) {
				a[k] = a[k+1];
			}
			System.out.printf("Delete %d at Array[%d].\n",key, i);
		}
		num--;
	}
	public void bubbleSort() {
		int out=num, in=0;
		for(out=num-1;out>1;out--) {
			for(in=0;in<out;in++) {
				if(a[in] > a[in+1]) {
					swap(in, in+1);
				}
			}
		}
		for(int i=0;i<num;i++) {
			System.out.printf("%d at Array[%d].\n", a[i], i);
		}
	}
	public void swap(int aa, int bb) {
		int temp = a[aa];
		a[aa] = a[bb];
		a[bb] = temp;
	}
	public void display() {
		for(int i=0;i<num;i++) {
			System.out.printf("%d at Array[%d].\n", a[i], i);
		}
	}
}

public class BubleSortApp {
    
	public static void main(String[] args) {
		int searchKey = 88;
		ArrayBubble arr = new ArrayBubble(100);
		arr.insert(77);            
	    arr.insert(99);
	    arr.insert(44);
	    arr.insert(55);
	    arr.insert(22);
	    arr.insert(88);
	    arr.insert(11);
	    arr.insert(00);
	    arr.insert(66);
	    arr.insert(33);
	    
	    arr.display();
	    
	    arr.find(searchKey);
	    searchKey = 11;
	    arr.delete(searchKey);
	    
	    arr.display();
	    System.out.println("Do the bubble sort and display.");
	    arr.bubbleSort();


	}

}
