package p2 ;
import p1.* ;
import java.util.ArrayList;
// part of package design by Developer B, and uses 1st package

// class Route
public class Route{

  // data members
  private ArrayList<Road> roads ;

  // constructor
  public Route(ArrayList<Road> roads){
    this.roads = roads ;
  }

  // static methods
  public static Boolean isConnected(ArrayList<Road> roads){

    for(int i = 0 ; i < roads.size() - 1 ; i++ ){
      Road r1 = roads.get(i) ;
      Road r2 = roads.get(i+1) ;

      if(r1.getLink().getP2() != r2.getLink().getP1()){
        return false ;
      }
    }
    return true ;
  }

  // getters
  public ArrayList<Road> getRoads(){ return this.roads ; }

  // other methods
  // 1) get total length of the root
  // 2) get max width of car which can travel on that route
  // 3) get navigation details, in string. Used for printing output 
  public double getRouteLength(){
    double routelength = 0 ;
    for(Road r : this.roads){
      Line l = r.getLink() ;
      routelength += l.length() ;
      // or we could have called the totalLength function in line,
      // but for that we need a line ArrayList, so this is a better solution.
    }

    return routelength ;
  }

  public double getMaxWidth(){
    double maxWidth = 100000 ;
    for (Road r : this.roads){
      if(maxWidth > r.getWidth()){
        maxWidth = r.getWidth() ;
      }
    }

    return maxWidth ;
  }

  public String getNavigation(){
    String nav = "Start at " + this.roads.get(0).getL1().getName() ;
    for(Road r : this.roads){
        String s = ". Follow " + r.getName() + " to " + r.getL2().getName() ;
        nav = nav + s ;
    }

    return nav ;

  }




}
