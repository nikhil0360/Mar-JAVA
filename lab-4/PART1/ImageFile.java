class ImageFile extends File {

  double width ;
  char[] image ;

// add constructor - takes name, image width, image (char array) - compute size from this array
  public ImageFile(String name, double width, char[] image) {
    super(name) ;
    this.width = width ;
    this.image = image ;
}

	public char[] getImage() {
    return this.image ;
	}

	// redefine getSize. Size can be computed as size of the image array plus overhead
  public int getSize(){
    return (super.getSize() + this.image.length) ;
  }

}
