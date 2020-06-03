class ArrayInsertion{
	private int[] arr;
	private int num;
	public ArrayInsertion(int size) {
		arr = new int[size];
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
			System.out.println("Can't find the target.\n");
		}else {
			System.out.printf("Find the target %d at Array[%d].\n",key, i);
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
			System.out.println("Can't find the target.\n");
		}else {
			for(int k=i;k<num-1;k++) {
				arr[k] = arr[k+1];
			}
			System.out.printf("Delete the target %d at Array[%d].\n",key, i);
		}
		num--;
	}
	public void InsertionSort() {
		int inner, outer, temp;
		
		for(outer=1;outer<num;outer++) {
			temp = arr[outer];
			inner = outer;
			while(inner>0 && arr[inner-1]>=temp) {
				arr[inner] = arr[inner-1];
				--inner;
			}
			arr[inner] = temp;
		}
	}
	public void display() {
		for(int i=0;i<num;i++) {
			System.out.printf("%d at Array[%d].\n", arr[i], i);
		}
	}
}
public class InsertionSortApp {

	public static void main(String[] args) {
		int searchKey = 99;
		ArrayInsertion arr = new ArrayInsertion(100);
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
	    System.out.println("Do the Insertion sort and display.");
	    arr.InsertionSort();
	    arr.display();
	}

}
