class OrderArray{
	int[] arr;
	int num;
	public OrderArray(int size) {
		arr = new int[size];
		num = 0;
	}
	public void insert_order(int data){
		int i;
		for(i=0;i<num;i++) {
			if(arr[i] > data) {
				break;
			}
		}
		for(int k=num;k>i;k--) {
			arr[k] = arr[k-1];
		}

		arr[i] = data;
		num++;
	}
	public void find (int key) {
		int i;
		for(i=0;i<num;i++) {
			if(arr[i]==key) {
				break;
			}
		}
		if(i==num) {
			System.out.printf("Can not find %d in Array.\n",key);
		}else {
			System.out.printf("Find %d in Array[%d].\n",key, i);
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
			System.out.printf("Can not find %d in Array.\n",key);
		}else {
			System.out.printf("Find %d in Array[%d] and will be deleted.\n",key, i);
			for(int k=i;k<num-1;k++) {
				arr[k] = arr[k+1];
			}
		}
		num--;
	}
	public void display() {
		for(int i=0;i<num;i++) {
			System.out.printf("%d in Array[%d].\n",arr[i],i);
		}
	}
}
public class OrderArrayAPP {

	public static void main(String[] args) {
		int key = 11;
		OrderArray arr = new OrderArray(100);
		
		arr.insert_order(3);
		arr.insert_order(4);
		arr.insert_order(17);
		arr.insert_order(6);
		arr.insert_order(8);
		arr.insert_order(9);
		arr.insert_order(0);
		arr.insert_order(1);
		arr.insert_order(11);
		arr.insert_order(99);
		arr.display();
		arr.find(key);
		key = 17;
		arr.delete(key);
		arr.display();

	}

}
