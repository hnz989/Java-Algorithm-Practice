
public class ArrayAPP {

	public static void main(String[] args) {
		int[] intArray;
		int i,j;
		intArray = new int[10];
		int arrayLength = intArray.length;
//----------------------------------------------------------------------------------
		intArray[0] = 0;
		intArray[1] = 1;
		intArray[2] = 2;
		intArray[3] = 3;
		intArray[4] = 4;
		intArray[5] = 5;
		intArray[6] = 6;
		intArray[7] = 7;
		intArray[8] = 8;
		intArray[9] = 9;
//----------------------------------------------------------------------------------
		for(i=0;i<arrayLength;i++) {
			System.out.printf("intArray[%d] = %d\n",i,intArray[i]);
		}
	
		for(i=0;i<arrayLength;i++) {
			if(intArray[i]==8) {
				break;
			}
		}
		if(i==arrayLength) {
			System.out.println("8 is not in the intArray.\n");
		}else {
			System.out.printf("8 is in the intArray[%d]\n",i);
		}
		
		for(i=0;i<arrayLength;i++) {
			if(intArray[i]==5) {
				System.out.printf("5 is in the intArray[%d] and will be deleted.\n",i);
				break;
			}
		}
		if(i==arrayLength) {
			System.out.println("5 is not in the intArray.\n");
		}
		for(j=i;j<arrayLength-1;j++) {
		    intArray[j] = intArray[j+1];
		}
		arrayLength--;
		
		for(i=0;i<arrayLength;i++) {
			System.out.printf("intArray[%d] = %d\n",i, intArray[i]);
		}
		System.out.printf("arrayLength = %d\n",arrayLength);
		
	}

}
