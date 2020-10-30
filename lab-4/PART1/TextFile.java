class TextFile extends File {
	// add constructor - takes name and String text.

  String text ;

  public TextFile(String name, String text){
    super(name) ;
    this.text = text ;
  }

	public String getText() { return this.text ; }

  public int getSize() {
    return super.getSize() + this.text.length() ;
  }
	// redefine getSize.
	// Size can be computed as length of the string, converted to bytes plus the overhead
}
