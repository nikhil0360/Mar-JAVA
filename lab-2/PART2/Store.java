import java.util.ArrayList;

public class Store {

  // CLASS STORE contains
  //  Store
  //  ( purchase )  ( Sales )  ( List of books )

  String storeName ;

  // constructor
  Store(String name) {
    this.storeName = name ;
  }

  // creating Departments and book list
  Purchasing pDept = new Purchasing() ;
  Sales sDept = new Sales() ;
  ArrayList<Book> books = new ArrayList<Book>() ;

} // END OF CLASS Store
