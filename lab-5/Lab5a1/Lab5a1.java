public class Lab5a1 {
    // main method to run the input output
    Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
    int m = Integer.parseInt(n) ;

    for(int i = 0 ; i < m ; i++) {
      String[] data = scan.nextLine().split(" ") ;
      if(data[0].equals("1")){
        // create a diesel car
      }

      else if(data[0].equals("2")){
        // create a electric car
      }
    }

    // find range on all the cars 
}

// base class Car
class Car {
  abstract double findRange() ;
}


// derived classes using Car

// diesel car
class dieselCar extends Car {
  double range ;
  double efficency ;
  double fuelLeft ;

  double findRange(){
    range = fuelLeft * efficency ;
    return range ;
  }
}

// electric car
class electricCar extends Car {
  double range ;
  double efficency ;
  double batteryLeft ;

  double findRange(){
    range = batteryLeft * efficency ;
    return range ;
  }
}
