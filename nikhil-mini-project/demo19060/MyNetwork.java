package demo19060;

import base.* ;
import java.util.* ;

public class MyNetwork extends Network{
  // Data members for maintaing Hubs, Highways and Trucks
  private static ArrayList<Hub> hubs = new ArrayList<>();
  private static ArrayList<Highway> highways = new ArrayList<>();
  private static ArrayList<Truck> trucks = new ArrayList<>();

  // constructor
  public MyNetwork(){
    super() ;
  }

  // add methods
  public void add(Hub hub){
    hubs.add(hub) ;
  }

  public void add(Highway hwy){
    highways.add(hwy) ;
  }

  public void add(Truck truck){
    trucks.add(truck) ;
  }

  // derived class calls start on each of the Hubs and Trucks
  // this will start the threads for all the trucks and hubs
  public void start(){
    for(Truck t: trucks){
      t.start() ;
    }

    for(Hub h: hubs){
      h.start() ;
    }
  }

  // derived class calls draw on each hub, highway, and truck
  // passing in display
  // this will display the objects for the appropriate Display class
  public void redisplay(Display disp){
    for(Hub h: hubs){
      h.draw(disp) ;
    }

    for(Highway hw: highways){
      hw.draw(disp) ;
    }

    for(Truck t: trucks){
      t.draw(disp) ;
    }
  }

  // finds the nearest Hub to a given location
  // will be used to find Start Hub and Destination Hub
  // This can be called from other classes as Networt.getNearestHub()
  // which is possible as it has a static data member
  protected Hub findNearestHubForLoc(Location loc){
    Hub nearestHub = hubs.get(0) ;
    int minDistance = 1000000 ;
    for(Hub h: hubs){
      int sDist = h.getLoc().distSqrd(loc) ;
      if(sDist < minDistance){
        nearestHub = h ;
        minDistance = sDist ;
      }
    }
    return nearestHub ;
  }
}
