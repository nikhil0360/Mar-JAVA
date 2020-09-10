import java.util.ArrayList;

public class Purchasing{

  // Purchasing Department
  // have method for adding books to store books List
  // gives unique id to book, and makes a new book
  // unique id is based on the fact that the input of years
  // are in chronological order

  public static double factor = 1.5 ;
  static int id = 0 ;
  static int flag_year = 0 ;

  void addBook(int year, double costPrice, ArrayList<Book> list){

    if(flag_year < year){
      flag_year = year ;
      resetId() ; // else purchasing.id = 0 ;
    }

    incrementId() ; // else Purchasing.id++ ;

    String string_id = Integer.toString(this.getidnumber());

    int max_id_len = 6 ;
    int string_id_len = string_id.length();
    for(int i = 0; i<max_id_len - string_id_len; i++)
    {
      // adding the zeros in front of string
      string_id = '0' + string_id ;
    }

    String bookId = Integer.toString(year) + '-' + string_id ;
    Book b = new Book(bookId, costPrice) ;
    list.add(b) ;

  }

  // if the factor of selling price has to be changed
  void changeFactor(int f){
    Purchasing.factor = f ;
  }

  int getidnumber(){ return Purchasing.id ; }
  private void incrementId(){ Purchasing.id++ ;}
  private void resetId(){ Purchasing.id = 0 ; }

} // END of class Purchasing
