public class Apartment {

	Owner owner ;
	int rent ;
	Apartment(Owner owner, int rent) { // constructor
		this.owner = owner ;
		this.rent = rent ;
		counter++ ;
	 }

	int getRent() {  // methods
		return rent;
	}
	Owner getOwner() {
		return owner;
	}

	int getCount(){
		return counter ;
	}




	public static void main(String[] args) {

		Owner owner1 = new Owner("Jeff", 40);
		Owner owner2 = new Owner("Mukesh", 50);
		Owner owner3 = new Owner("Bill", 60);

		Apartment a1 = new Apartment(owner1, 4000);
		Apartment a2 = new Apartment(owner2, 6000);
		Apartment a3 = new Apartment(owner1, 1000);
		Apartment a4 = new Apartment(owner3, 9000);

		// create an array of Apartments and initialize to the above 4

		Apartment arr[] = new Apartment[]{a1,a2,a3,a4} ; // intialising

		// find the apt with the hightest rent
		int max = 0 ;
		Owner max_name = new Owner("",0);
		for(int i = 0; i<4; i++)
		{
			if(arr[i].getRent() > max)
				{
					max = arr[i].getRent() ;
					max_name = arr[i].getOwner() ;
				}
		}

		// print the name of its owner (to System.out)

		System.out.println(max);
		System.out.println(max_name.getName());


	}

}

public static class Owner {

	int age;
	String name;

	Owner(String name, int age) {      // constructor
		this.age = age;
		this.name = name;
	}

	int getAge() {  // methods
		return age;
	}

	String getName() { // methods
		return name;
	}



}
