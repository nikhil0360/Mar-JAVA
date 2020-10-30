package demo19060;

import base.* ;

// helps to abstract the creation of different objects
// also reduces hardwring things, as now we can call Factory.create for any object
// as and when required

public class FactoryDemo extends Factory {
  public Network createNetwork(){
    return new MyNetwork() ;
  }

	public Highway createHighway(){
    return new MyHighway() ;
  }
	public Hub createHub(Location location){
    return new MyHub(location) ;
  }

	public Truck createTruck(){
    return new MyTruck() ;
  }
}
