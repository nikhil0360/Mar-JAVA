package myairline ;
import java.util.ArrayList;

public class Airline{

public PriorityQueueFlight flightList = new PriorityQueueFlight() ;

public void bookFlight(){
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
