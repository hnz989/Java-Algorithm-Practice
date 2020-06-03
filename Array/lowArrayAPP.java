class lowArray{
	private int [] a;
	public lowArray (int size) {
		a = new int [size];
	}
	public void getvalue(int i, int j) {
		a[i] = j;
	}
	public void findval(int j,int size) {
		int i;
		for(i=0;i<size;i++) {
			if(a[i]==j) {
				break;
			}
		}
		if(i==size) {
			System.out.printf("Could not fine %d in Array\n",j);
		}else {
			System.out.printf("Fine %d in Array[%d]\n",j,i);
		}
	}
	public int deleteval(int j, int size) {
		int i,k;
		for(i=0;i<size;i++) {
			if(a[i]==j) {
				break;
			}
		}
		if(i==size) {
			System.out.printf("%d is not in the intArray.\n",j);
			return size;
		}else {
			System.out.printf("%d is in the intArray[%d] and will be deleted.\n",j,i);
			for(k=i;k<size-1;k++) {
				a[k] = a[k+1];
			}
			size--;
			return size;
		}
	}
	public void print(int size) {
		int i;
		for(i=0;i<size;i++) {
				System.out.printf("Array[%d] = %d\n",i,a[i]);
		}
	}
}
public class lowArrayAPP {

	public static void main(String[] args) {
		int keyval = 8,length =10, i;
		lowArray arr = new lowArray(length);
	    for(i=0;i<length; i++) {
	    	arr.getvalue(i,i+1);
	    }		
		arr.print(length);
		
        arr.findval(keyval, length);
        
        keyval = 5;
        
        length = arr.deleteval(keyval, length);

        arr.print(length);
	}

}
