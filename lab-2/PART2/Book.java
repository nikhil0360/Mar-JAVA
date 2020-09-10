import java.util.ArrayList;

public class Book {

  // Book contains id, price and selling price
  // the reason i kept selling price, as the factor of Purchasing can change

  private String id ;
  private double costPrice ;
  private double sellPrice ;

  // constructor
  Book(String id, double costPrice) {

    this.id = id;
    this.costPrice = costPrice ;
    this.sellPrice = costPrice * Purchasing.factor ;

  }

  String getid(){ return this.id ; }
  double getcostPrice(){ return this.costPrice ; }
  double getsellPrice(){ return this.sellPrice ; }

} // END OF CLASS Book
