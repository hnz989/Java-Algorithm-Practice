
class CircularQueue {
	private int queSize;
	private int[] arr;
	private int num;
	private int front;
	private int rear;
	
	public CircularQueue(int size) {
		queSize = size;
		arr = new int[queSize];
		num = 0;
		front = -1;
		rear = -1;
	}
	
	public void Enqueue(int key)
	{
		if(isFull()) {
			System.out.println("The Queue is full!");
		}else {
			rear = (rear+1) % arr.length;
			arr[rear] = key;
			num++;
			if(front == -1) {
				front = rear;
			}
		}		
	}
	public int Dequeue()
	{
		int DequeueItem = 0;
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
		}else {
			DequeueItem = arr[front];
			arr[front] = -1;
			front = (front+1) % arr.length;
			num--;
		}
		return DequeueItem;
		
	}
	public boolean isFull() {
		return (num == arr.length);
	}
	public boolean isEmpty() {
		return (num == 0);
	}
	public void display() {

			for(int i=0;i<queSize;i++) {
				System.out.printf("Array[%d] value is %d.\n",i, arr[i]);
			}

	}
	
}

public class CircularQueAPP {

	public static void main(String[] args) {
		CircularQueue cirQueue = new CircularQueue(10);
		cirQueue.Enqueue(15);
		cirQueue.Enqueue(10);
		cirQueue.Enqueue(26);
		cirQueue.Enqueue(46);
		cirQueue.Enqueue(23);
		cirQueue.Enqueue(69);
		cirQueue.Enqueue(88);
		cirQueue.Enqueue(90);
		cirQueue.Enqueue(109);
		cirQueue.Enqueue(18);
		
		cirQueue.display();
		
		System.out.print("Dequeue items from Queue: ");
		System.out.println(cirQueue.Dequeue()+" ");
		cirQueue.display();
		cirQueue.Enqueue(66);
		System.out.println("After enqueue one more item:");
		cirQueue.display();
		
	}


}
