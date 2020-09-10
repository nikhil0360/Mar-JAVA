import p1.* ;
import p2.* ;
import java.util.Scanner;
import java.util.ArrayList;
// developed using the package one and two

// Main class
public class Test{

  // main class --> code to be run
  public static void main(String args[]){

    // all the required ArrayList
    ArrayList<Location> locations = new ArrayList<Location>() ;
    ArrayList<Road> roads = new ArrayList<Road>() ;
    ArrayList<Route> routes = new ArrayList<Route>() ;


    Scanner scan = new Scanner(System.in);
    // input set 1 : locations

    String n = scan.nextLine();
    int m = Integer.parseInt(n) ;

    for(int i = 0; i < m ; i++ )
    {
      String s = scan.nextLine();
      String[] str = s.split(" ") ;

      double x,y ;
      x = Double.parseDouble(str[0]);
      y = Double.parseDouble(str[1]);
      Location loc = new Location( str[2], x , y) ;
      locations.add(loc) ;
    }

    // for (Location l : locations){
    //   System.out.println(l.getName()) ;
    // }
    // driver function

    // input set 2 : Roads

    n = scan.nextLine();
    m = Integer.parseInt(n) ;

    for(int i = 0; i < m ; i++ )
    {
      String s = scan.nextLine() ;
      String[] str = s.split(" ") ;

      Road road = new Road(
      locations.get(Integer.parseInt(str[0])),
      locations.get(Integer.parseInt(str[1])),
      str[2],
      Double.parseDouble(str[3])
      ) ;

      roads.add(road) ;
    }


    // for (Road r : roads){
    //   System.out.println(r.getName()) ;
    // }
    // Driver function to test till here


    // input set 3, routes

    n = scan.nextLine();
    m = Integer.parseInt(n) ;

    for(int i = 0; i < m ; i++ )
    {
      String s = scan.nextLine() ;
      String[] str = s.split(" ") ;
      int num = Integer.parseInt(str[0]) ;
      ArrayList<Road> path = new ArrayList<Road>() ;
      for(int j = 1 ; j <= num ; j ++ ) {
          path.add(roads.get(Integer.parseInt(str[j]))) ;
      }

      Route route = new Route(path) ;
      routes.add(route) ;
    } // end of for loop : 3

    // driver function to test till here
    // for(Route r : routes){
    //   if(Route.isConnected(r.roads)){
    //     System.out.printf("%.2f \n",r.getRouteLength());
    //   }
    // }

    // output setup

    // prints the desire output by calling appropriate functions calls on
    // object created during the inputs.
    int i = 1 ;
    for(Route route: routes){

      if(Route.isConnected(route.getRoads())){
        System.out.printf("Route %d: Length %.2f, max width %.2f: %s\n",i
        , route.getRouteLength(), route.getMaxWidth(), route.getNavigation() ) ;
      }

      else {
        System.out.printf("Route %d: Invalid route\n",i) ;
      }

      i++ ;

    }


  } // end of main function
} // end of Main class
