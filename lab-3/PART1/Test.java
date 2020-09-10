import java.util.ArrayList;
import myairline.* ;

public class Test{

  public static void main(String args[]){
    Airline myAirline = new Airline() ;
    myAirline.flightList.addFlight(new Flight("surat", "mumbai", 100, 2000)) ;
    myAirline.flightList.addFlight(new Flight("bangalore", "surat", 100, 3000)) ;
    myAirline.flightList.addFlight(new Flight("mumbai", "indore", 100, 4000)) ;
    myAirline.flightList.addFlight(new Flight("india", "china", 100, 10000)) ;
    myAirline.flightList.addFlight(new Flight("usa", "australia", 100, 20000)) ;

    // added flight

    myAirline.bookFlight() ;
  }
}
