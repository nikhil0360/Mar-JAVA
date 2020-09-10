// import array list and scanner
import java.util.ArrayList;
import java.util.Scanner;

// Driver class Test
public class Test{

  public static void main(String args[]){

    // for input from command line
    Scanner scan = new Scanner(System.in);

    // making a Store instance called : BOOK STORE
    Store bookStore = new Store("BOOK STORE");

    // first part of input
    // entering data of books and storing in book list
    do {

      String s = scan.nextLine();

      if(s.equals("0 0"))
        break ;

      String[] str = s.split(" ");  //"year price"

      int year = Integer.parseInt(str[0]) ;
      double costPrice = Double.parseDouble(str[1]) ;

      // book store's purchasing dept has add book method
      bookStore.pDept.addBook(year, costPrice, bookStore.books) ;

    } while(true) ;  // END OF WHILE LOOP 1

    // Driver for testing code till here : print all the stored book ids
    // for( Book book: bookStore.books)
    // {
    //   System.out.println(book.id) ;
    // }

    // second part of input
    // entering sales data, and storing record of sales

    do {

      String s = scan.nextLine();

      if(s.equals("0 0"))
        break ;

      String[] str = s.split(" ");  //salesYear bookId

      int year = Integer.parseInt(str[0]) ;
      String id = str[1] ;

      for(int i = 0 ; i <bookStore.books.size() ; i++)
      {
        // getting book, from ArrayList where id of sales data
        // is equal to book id stored in store object.
        if(bookStore.books.get(i).getid().equals(id)) {

          // passing book and year of sales to addRecord function
          bookStore.sDept.addRecord(bookStore.books.get(i), year) ;
          break ;
        } // END OF IF
      } // END OF FOR

    } while(true) ; // END OF WHILE LOOP 1


    // OUTPUT FUNCTION
    bookStore.sDept.printSales() ;

  } // END OF MAIN FUNCTION

} // END OF Test CLASS

// ALL OTHER CLASSES


// 1st
// class Store {
//
//   // CLASS STORE contains
//   //  Store
//   //  ( purchase )  ( Sales )  ( List of books )
//
//   String storeName ;
//
//   // constructor
//   Store(String name) {
//     this.storeName = name ;
//   }
//
//   // creating Departments and book list
//   Purchasing pDept = new Purchasing() ;
//   Sales sDept = new Sales() ;
//   ArrayList<Book> books = new ArrayList<Book>() ;
//
// } // END OF CLASS Store


// 2nd
// class Book {
//
//   // Book contains id, price and selling price
//   // the reason i kept selling price, as the factor of Purchasing can change
//
//   private String id ;
//   private double costPrice ;
//   private double sellPrice ;
//
//   // constructor
//   Book(String id, double costPrice) {
//
//     this.id = id;
//     this.costPrice = costPrice ;
//     this.sellPrice = costPrice * Purchasing.factor ;
//
//   }
//
//   String getid(){ return this.id ; }
//   double getcostPrice(){ return this.costPrice ; }
//   double getsellPrice(){ return this.sellPrice ; }
//
// } // END OF CLASS Book


// 3rd
// class Purchasing{
//
//   // Purchasing Department
//   // have method for adding books to store books List
//   // gives unique id to book, and makes a new book
//   // unique id is based on the fact that the input of years
//   // are in chronological order
//
//   static double factor = 1.5 ;
//   static int id = 0 ;
//   static int flag_year = 0 ;
//
//   void addBook(int year, double costPrice, ArrayList<Book> list){
//
//     if(flag_year < year){
//       flag_year = year ;
//       resetId() ; // else purchasing.id = 0 ;
//     }
//
//     incrementId() ; // else Purchasing.id++ ;
//
//     String string_id = Integer.toString(this.getidnumber());
//
//     int max_id_len = 6 ;
//     int string_id_len = string_id.length();
//     for(int i = 0; i<max_id_len - string_id_len; i++)
//     {
//       // adding the zeros in front of string
//       string_id = '0' + string_id ;
//     }
//
//     String bookId = Integer.toString(year) + '-' + string_id ;
//     Book b = new Book(bookId, costPrice) ;
//     list.add(b) ;
//
//   }
//
//   // if the factor of selling price has to be changed
//   void changeFactor(int f){
//     Purchasing.factor = f ;
//   }
//
//   int getidnumber(){ return Purchasing.id ; }
//   private void incrementId(){ Purchasing.id++ ;}
//   private void resetId(){ Purchasing.id = 0 ; }
//
// } // END of class Purchasing


// 4th
// class Sales{
//
//   // sales Department
//   // mantains records of sales data ( year of sale , book id)
//   // to maintain this, created new class called Record
//
//   // also have fuction to print data related to revenue
//   // has method printSales to print all the sales data
//
//   ArrayList<Record> records = new ArrayList<Record>();
//
//   void addRecord(Book book, int yearSold){
//     Record r =  new Record(book.getid(), yearSold, book.getsellPrice());
//     this.records.add(r) ;
//   }
//
//   void getRevenue(int year){
//     double r1 , r2, r3 ;
//     r1 = r2 = r3 = 0 ;
//
//     for(Record r: this.records){
//       if( r.getyearSold() == year )
//         {
//           String[] str = r.getid().split("-") ;
//           int y = Integer.parseInt(str[0]) ;
//           if(y == year)
//             r1 += r.getprice() ;
//           else if(y == year-1)
//             r2 += r.getprice() ;
//           else if(y == year-2)
//             r3 += r.getprice() ;
//         }
//     }
//
//     System.out.println(year + " " + r1 + " " + r2 + " " + r3) ;
//   }
//
//   void printSales(){
//     // printing all the getRevenue in ascending order of year
//     int min = this.getMinYear() ;
//     int max = this.getMaxYear() ;
//
//     for(int i = min ; i <= max ; i++){
//       this.getRevenue(i) ;
//     }
//   }
//
//   int getMaxYear(){
//     // return max year in int of sales record
//     int maxYear = 0 ;
//     for(Record r: this.records){
//       if( r.getyearSold() > maxYear )
//           maxYear = r.getyearSold() ;
//     }
//
//     return maxYear ;
//   }
//
//   int getMinYear(){
//     // return max year in int of sales record
//     int minYear = 2050 ;
//     for(Record r: this.records){
//       if( r.getyearSold() < minYear )
//           minYear = r.getyearSold() ;
//     }
//     return minYear ;
//   }
//
// } // END OF CLASS Sales


// 5th
// class Record{
//
//   // Record class, used to matain sales records
//   // store id, yearSold, and selling Price of books
//
//   private String id;
//   private int yearSold;
//   private double price;
//
//   Record( String id, int yearSold, double price){
//     this.id = id ;
//     this.yearSold = yearSold ;
//     this.price = price ;
//   }
//
//   String getid(){ return this.id ;}
//   int getyearSold(){ return this.yearSold ;}
//   double getprice(){ return this.price ;}
//
// }


// how to use array list
// import java.util.ArrayList;
// ArrayList<Integer> myList = new ArrayList<Integer>();
// myList.add(0);
// myList.remove(0);//Remove at index 0
// myList.size();
// myList.get(0);//Return element at index 0


// Assignment de-construction
//  Store
//  ( purchase )  ( Sales )  ( List of books )
//
//  book --> id, cost price, selling price = 1.5 * cp ( set by purchasing )
//
//  purchasing -- add books(year, price)  :
//
//  sales - record( id, year of sold)
//        - revenue( year, id ) --> revenue of the year, year-1, year-2
//        - printSales --> invoke revenue on all years
//
//  main -> adding records, adding sales, printing sales,
