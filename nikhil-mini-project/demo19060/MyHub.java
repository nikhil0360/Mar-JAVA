package demo19060;

import base.* ;
import java.util.* ;

public class MyHub extends Hub {

  // Queue or list for maintaing list of trucks present on Hub
  ArrayList<Truck> Q = new ArrayList<>();

  // rand will be used for selecting the Queue randomly
  // OR for random routing ( for testing purpose )
  Random rand = new Random();

  // constructor
  public MyHub(Location loc){
    super(loc) ;
  }

  // add, remove method
  // they are synchronized so that this becomes thread safe
  public synchronized boolean add(Truck truck){
  if(Q.size() < getCapacity()){
    Q.add(truck);
    return true;
  }

  else{
    return false ;
    }
  }

  public synchronized void remove(Truck truck){
    Q.remove(truck) ;
  }

  private int fIndex = 0 ;
  public Highway getNextHighway(Hub last, Hub dest){
    // does routing and gets the highway to which the truck should get in
    // this highway should not lead to the last Hub
    // in short does routing

    for (Highway i: this.getHighways()){
      if (i.getEnd() == dest){
        return i;
      }
    }

    Highway hwy = getHighways().get(rand.nextInt(getHighways().size()));
    return hwy;


    // Mininum distance routing

    // Highway hwy = getHighways().get(0) ;
    // int minDistance = 1000000 ;
    // for(Highway h: getHighways()){
    //   int sDist = getLoc().distSqrd(h.getEnd().getLoc()) ;
    //   if(sDist < minDistance){
    //     hwy = h ;
    //     minDistance = sDist ;
    //   }
    // }
    //
    //  return hwy ;

    // Random routing : cannot return to last Hub

    // while(true){
    //   Highway hwy = getHighways().get(rand.nextInt(getHighways().size())) ;
    //   if(hwy.getEnd() != last){
    //     return hwy ;
    //   }
    // }

    // Random routing : can return to last Hub
    // Highway hwy = getHighways().get(rand.nextInt(getHighways().size())) ;
    // return hwy ;

    // Iterate routing, works just like nextfactory in DemoDriver
    // iterate through highway one by one

    // int num = getHighways().size();
		// int newIndex = fIndex % num;
		// fIndex++;
		// return getHighways().get(newIndex);
  }

  // to be implemented in derived classes. Called at each time step
  protected synchronized void processQ(int deltaT){
    while(Q.size()>0){
      Truck t = Q.get(0) ;
      Highway h = getNextHighway(t.getLastHub(),Network.getNearestHub(t.getDest())) ;

      if(h.hasCapacity()){
        t.enter(h) ;
        remove(t) ;
      }

      // cluttering remover
      // Its not required now, it was happening as remove function was
      // not called in some places, which didn't release the capacity

      // else if(h.hasCapacity() == false && Q.size() == getCapacity()){
      //   System.out.println("removed cluttering");
      //   setCapacity(getCapacity() - 1) ;
      // }
      }
    }
}
