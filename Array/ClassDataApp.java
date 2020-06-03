class Person{
	private String first_name;
	private String last_name;
	private int age;
	public Person(String a, String b, int c) {
		first_name = b;
		last_name = a;
		age = c;
	}
	public void displayP() {
		System.out.printf("First name: %s, Last name: %s, Age: %d\n", last_name, first_name, age);
	}
	public String getLast() {
		return last_name;
	}
}
class ClassDataArray{
	private int num;
	private Person[] arr;
	public ClassDataArray(int size) {
		arr = new Person[size];
		num = 0;
	}
	public void insert(String a, String b, int c) {
		arr[num] = new Person(a, b, c);
		num++;
	}
	public Person find(String key) {
		int i;
		for(i=0;i<num;i++) {
			if(arr[i].getLast().equals(key)) {
				break;
			}				
		}
		if(i==num) {
			System.out.println("No such person.\n");
			return null;
		}else {
			System.out.printf("Find Mr/Mrs: %s.\n", arr[i].getLast());
			return arr[i];
		}
	}
	public void delete(String key) {
		int i;
		for(i=0;i<num;i++) {
			if(arr[i].getLast().contentEquals(key)) {
				break;
			}
		}
		if(i==num) {
			System.out.println("No such person, no need to delete.");
		}else {
			for(int k=i;k<num-1;k++) {
				arr[k] = arr[k+1];
			}
			System.out.printf("Delete Mr/Mrs: %s.\n", key);
		}
		num--;
	}
	public void display() {
		for(int i=0;i<num;i++) {
			arr[i].displayP();
		}
	}
}
public class ClassDataApp {

	public static void main(String[] args) {
		ClassDataArray arr = new ClassDataArray(100);
		arr.insert("Evans", "Patty", 24);
		arr.insert("Smith", "Lorraine", 37);
	    arr.insert("Yee", "Tom", 43);
	    arr.insert("Adams", "Henry", 63);
	    arr.insert("Hashimoto", "Sato", 21);
	    arr.insert("Stimson", "Henry", 29);
	    arr.insert("Velasquez", "Jose", 72);
	    arr.insert("Lamarque", "Henry", 54);
	    arr.insert("Vang", "Minh", 22);
	    arr.insert("Creswell", "Lucinda", 18);
	    
	    arr.display();
	    
	    String key = "Yee";
	    
	    arr.find(key);
	    
	    key = "Adams";
	    
	    arr.delete(key);
	    
	    arr.display();

	}

}
