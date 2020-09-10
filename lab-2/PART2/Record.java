import java.util.ArrayList;

public class Record{

  // Record class, used to matain sales records
  // store id, yearSold, and selling Price of books

  private String id;
  private int yearSold;
  private double price;

  Record( String id, int yearSold, double price){
    this.id = id ;
    this.yearSold = yearSold ;
    this.price = price ;
  }

  String getid(){ return this.id ;}
  int getyearSold(){ return this.yearSold ;}
  double getprice(){ return this.price ;}

}
