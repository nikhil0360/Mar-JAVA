package demo19060;

import base.* ;
import java.util.* ;

// As we can see, Highway doesn't do any processing
// it is the Hub and truck which takes decisions and
// Highway is just a medium 

public class MyHighway extends Highway{
  // Queue or list of trucks, moving on the highway
  ArrayList<Truck> trucks = new ArrayList<>();

  // add, remove and hasCapacity method
  public synchronized boolean add(Truck truck){
    if(trucks.size() < getCapacity()){
      trucks.add(truck);
      return true;
    }

    else{
      return false ;
    }
  }

  public synchronized void remove(Truck truck){
    trucks.remove(truck) ;
  }

  public synchronized boolean hasCapacity(){
    if(trucks.size() < getCapacity()){
      return true ;
    }

    else{
      return false ;
    }
  }
}
