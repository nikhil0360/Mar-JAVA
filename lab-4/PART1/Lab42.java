
public class Lab42 {

	public static void main(String[] args) {

		File f = new File("test1");

		TextFile t1 = new TextFile("text1", "contents of the text file");

		// Upcasting TextFile object to File object
		File f1 = (File) t1;


		f1.getName();

		// .getText won't work as the File class doesn't have this method
		// f1.getText();

		t1.getText();
		f1.getSize();
		t1.getSize();

		// both this print statements work, as they can call toString function, in
		// class File
		System.out.println(f1);
		System.out.println(t1);

		// here downcasting is not allowed. (we are converting File to TextFile )
		// t1 = f1;


		t1.getName();
		t1.getSize();

		System.out.println(t1);

		// we cannot cast one derived class to another dervied class
		// ImageFile i1 = t1;

		// downcasting is not allowed here
		// ImageFile i2 = f1;

		// i1.getSize();
		// i2.getSize();

		// in conclusion, we can upcast a derived object to its parent object type,
		// and we cannot downcast here. and we cannot convert one derived object to
		// other derived object 

	}

}
