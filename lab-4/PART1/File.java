public class File {

  String name ;

	public File(String name) {
    this.name = name ;
	}

  public String getName() {
    return this.name ;
	}

  public int getSize() { return 32; }
  // size of the file in bytes
  // Assume this is a fixed overhead for all types of files


  // override the toString method to print out the name and size of the file
  public String toString() {
    String str = this.getName() + " " + this.getSize() ;
    return str ;
  }

}
