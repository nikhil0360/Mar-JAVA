package demo19060;

import base.* ;
import java.util.* ;
// for rounding and calculating distance
import java.math.*;

public class MyTruck extends Truck{

	// private datamembers made to help with processing and updating information
	private Highway currentHwy ;

	private Hub lastHub ;
	private Hub currentHub ;

	private boolean onHighway = false ;
	private boolean start = false ;
	private boolean end = false ;
	private boolean onHub = false ;

	// overriding to refect my roll no.
	public String getTruckName() {
		return "Truck19060 " + getDest() ;
	}
  // the Hub from which it last exited.
	public Hub getLastHub(){
		return lastHub ;
  }

	// enter is called, when we want to enter a highway from a truck
	public synchronized void enter(Highway hwy){
		this.currentHwy = hwy ;
		hwy.add(this) ;
		onHighway = true ;
		onHub = false ;
  }

	// is called in Update function, made just to make the update function modular
	private synchronized void updateLocation(int deltaT){
		// variables and values required
		int speed = currentHwy.getMaxSpeed() ;
		int x = getLoc().getX() ;
		int y = getLoc().getY() ;
		Location a = currentHub.getLoc() ;
		Location b = currentHwy.getEnd().getLoc() ;

		// angles to update x and y coordinates
		double cos = (b.getX() - x)/Math.sqrt(b.distSqrd(getLoc())) ;
		double sin = (b.getY() - y)/Math.sqrt(b.distSqrd(getLoc())) ;

		// if it is not near dest Hub
		if(speed*deltaT*0.003 < Math.sqrt(b.distSqrd(this.getLoc())) ){
			// we will update the x and y of truck
			// so that it moves on the animation
			x += Math.round(speed*deltaT*cos*0.001) ;
			y += Math.round(speed*deltaT*sin*0.001) ;
			// setting the updated location
			this.setLoc(new Location(x,y)) ;
		}

		// else when the truck has reached close enough it will get to the Hub
		else{
			this.setLoc(b) ;
			// check if the hub is not destination hub, if it is we do the following
			// remove it from highway and make end boolean true
			if(this.getLoc().getX() == Network.getNearestHub(getDest()).getLoc().getX() && this.getLoc().getY() == 									   Network.getNearestHub(getDest()).getLoc().getY()){
				// System.out.println("end");
				currentHwy.remove(this);
				end = true ;
				onHighway = false ;
				onHub = false ;
			}

			// else if the hub has capacity add the truck
			else if(currentHwy.getEnd().add(this)){
				// removing the truck from highway
				currentHwy.remove(this) ;
				onHub = true ;
				onHighway = false ;
				lastHub = currentHub ;
				currentHub = currentHwy.getEnd() ;
			}
		}
	}

  // called every deltaT time to update its status/position
	// If less than startTime, does nothing
	// If at a hub, tries to move on to next highway in its route
	// If on a road/highway, moves towards next Hub
	// If at dest Hub, moves towards dest
	protected synchronized void update(int deltaT){
		// startTime condition
		if(getStartTime() <= deltaT){

			// start moving, when we have reached to the starting hub
			if(start == true){
				// on Highway update location
				if(onHighway){
					// update location
					updateLocation(deltaT) ;
				}

				// if reached end hub, update the location to destination hub
				else if(end){
					this.setLoc(this.getDest()) ;
				}
			}

			else{
				currentHub = Network.getNearestHub(this.getLoc()) ;
				lastHub = currentHub ;

				if(currentHub.add(this)){
					// System.out.println("Started");
					this.setLoc(currentHub.getLoc()) ;
					onHub = true ;
					start = true ;
					onHighway = false ;
				}

				else{
					onHub = false ;
					start = false ;
					onHighway = false ;
				}
			}
		}

		// updating startTime after deltaT is passed
		else{
			setStartTime(getStartTime() - deltaT) ;
		}
  }
}
