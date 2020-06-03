class ArraySelect{
	private int[] arr;
	private int num;
	public ArraySelect (int size) {
		arr = new int [size];
		num = 0;
	}
	public void insert(int data) {
		arr[num] = data;
		num++;
	}
	public void find(int key) {
		int i;
		for(i=0;i<num;i++) {
			if(arr[i]==key) {
				break;
			}
		}
		if(i==num) {
			System.out.println("Can't find the target item.\n");
		}else {
			System.out.printf("Target %d found at Array[%d].\n",key,i);
		}
	}
	public void delete(int key) {
		int i;
		for(i=0;i<num;i++) {
			if(arr[i]==key) {
				break;
			}
		}
		if(i==num) {
			System.out.println("Can't find the target item");
		}else {
			for(int k=i;k<num-1;k++) {
				arr[k] = arr[k+1];
			}
		}
		num--;
	}
	public void SelectionSort() {
		int in, out, min;
		for(out=0;out<num-1;out++) {
			min = out;
			for(in=out+1;in<num;in++) {
				if(arr[min]>arr[in]) {
					min = in;
				}
				swap(out,min);
			}
		}
	}
	public void swap(int aa, int bb) {
		int temp;
		temp = arr[aa];
		arr[aa] = arr[bb];
		arr[bb] = temp;		
	}
	public void display() {
		for(int i=0;i<num;i++) {
			System.out.printf("%d at Array[%d].\n", arr[i], i);
		}
	}
}
public class SelectionSortApp {

	public static void main(String[] args) {
		int searchKey = 99;
		ArraySelect arr = new ArraySelect(100);
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
	    System.out.println("Do the selection sort and display.");
	    arr.SelectionSort();
	    arr.display();

	}

}
