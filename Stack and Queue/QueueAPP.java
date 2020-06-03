class Queque{
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int num;
	public Queque(int size) {
		maxSize = size;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		num = 0;
	}
	public void insert(int key) {
		if(rear == maxSize-1) {
			rear = -1;
		}
		queArray[++rear] = key;
		num++;
	}
	public int remove() {
		int temp = queArray[front];
		queArray[front] = -1;
		front++;
		if(front == maxSize) {
			front = 0;
		}
		num--;
		return temp;
	}
	public int peek() {
		return queArray[front];
	}
	public boolean isEmpty() {
		return (num == 0);
	}
	public boolean isFull() {
		return (num == maxSize);
	}
	public void find(int key) {
		int i;
		for(i=0;i<=num;i++) {
			if(queArray[i]==key) {
				break;
			}
		}
		if(i==num) {
			System.out.println("Can't find the target");
		}else {
			System.out.printf("Array[%d] value is %d.\n", i, queArray[i]);
		}
	}
	public void display() {
		for(int i=0;i<maxSize;i++) {
			System.out.printf("Array[%d] value is %d.\n",i, queArray[i]);
		}
	}	
}
public class QueueAPP {

	public static void main(String[] args) {

		int key;
		Queque Queue = new Queque(10);
		Queue.insert(2);
		Queue.insert(10);
		Queue.insert(8);
		Queue.insert(6);
		Queue.insert(4);
		Queue.insert(14);
		Queue.insert(25);
		Queue.insert(66);
		Queue.insert(88);
		Queue.insert(0);
		key = Queue.remove();
		key = Queue.remove();
		Queue.display();
		Queue.insert(11);
		Queue.insert(22);
		Queue.display();
		
		key = Queue.remove();
		System.out.printf("Delete item %d.\n", key);
		key = Queue.remove();
		System.out.printf("Delete item %d.\n", key);
		Queue.display();

	}

}
