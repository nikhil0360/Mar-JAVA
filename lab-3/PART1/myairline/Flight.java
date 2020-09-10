package myairline ;
import java.util.ArrayList;

public class Flight{

  private String origin ;
  private String dest ;
  private int seatAvailable ;
  private int price ;

  public Flight(String origin, String dest, int seatAvailable, int price){
    this.origin = origin;
    this.dest = dest ;
    this.seatAvailable = seatAvailable ;
    this.price = price ;
  }

  String getOrigin() { return this.origin ;  }
  String getDest() { return this.dest ;  }
  int getSeatAvailable() { return this.seatAvailable ; }
  int getPrice() { return this.price ; }

  public static Flight minPrice( ArrayList<Flight> flights ){
    int minPrice = 1000000 ;
    for(Flight f : flights){
      if(f.getPrice() < minPrice)
        minPrice = f.getPrice() ;
    }

    Flight returnf = null ;
    for(Flight f : flights){
      if(f.getPrice() == minPrice)
        returnf = f ;
    }

  return returnf ;
  }

  public void decrementSeatAvailable(){
    this.seatAvailable-- ;
  }
}
