import java.util.ArrayList;

class Flight{

  private String origin ;
  private String dest ;
  private int seatAvailable ;
  private int price ;

  Flight(String origin, String dest, int seatAvailable, int price){
    this.origin = origin;
    this.dest = dest ;
    this.seatAvailable = seatAvailable ;
    this.price = price ;
  }

  String getOrigin() { return this.origin ;  }
  String getDest() { return this.dest ;  }
  int getSeatAvailable() { return this.seatAvailable ; }
  int getPrice() { return this.price ; }

  static Flight minPrice( ArrayList<Flight> flights ){
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

  void decrementSeatAvailable(){
    this.seatAvailable-- ;
  }
}


class PriorityQueueFlight{

  ArrayList<Flight> PQFlights = new ArrayList<Flight>() ;

  void addFlight(Flight f){
    this.PQFlights.add(f) ;
  }

  Flight peek(){
    return Flight.minPrice(this.PQFlights) ;
  }

  Flight pop(){
    Flight toberemoved = Flight.minPrice(this.PQFlights) ;
    this.PQFlights.remove(toberemoved) ;
    return toberemoved ;
  }
}

class Airline{

PriorityQueueFlight flightList = new PriorityQueueFlight() ;

void bookFlight(){
  Flight booked = this.flightList.peek() ;
  if(booked.getSeatAvailable() == 1){
    this.flightList.pop() ;
  }

  else{
    booked.decrementSeatAvailable() ;
  }
  System.out.println(booked.getOrigin() + " " + booked.getDest() + " " + booked.getSeatAvailable()
  + " " + booked.getPrice()) ;
}

}
