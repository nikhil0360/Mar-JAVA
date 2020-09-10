package myairline ;
import java.util.ArrayList;

public class PriorityQueueFlight{

  public ArrayList<Flight> PQFlights = new ArrayList<Flight>() ;

  public void addFlight(Flight f){
    this.PQFlights.add(f) ;
  }

  public Flight peek(){
    return Flight.minPrice(this.PQFlights) ;
  }

  public Flight pop(){
    Flight toberemoved = Flight.minPrice(this.PQFlights) ;
    this.PQFlights.remove(toberemoved) ;
    return toberemoved ;
  }
}
