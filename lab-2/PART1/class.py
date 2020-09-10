class Apartment:
    def __init__(self,owner, rent): #constructor
        self.owner = owner
        self.rent = rent

    def getOwner(self):   # object methods
        return self.owner

    def getRent(self):   # object methods
        return self.rent

class Owner:

    id = 1
    name = "Owner"

    def __init__(self, name, age):
        self.name = name
        self.age = age
        self.id = Owner.id
        Owner.id += 1


    def getName(self):
        return self.name

    def getAge(self):
        return self.age


# main function

# creating owner and appartment

owner1 = Owner("Jeff", 40);
owner2 = Owner("Mukesh", 50);
owner3 = Owner("Bill", 60);

a1 = Apartment(owner1, 4000);
a2 = Apartment(owner2, 6000);
a3 = Apartment(owner1, 1000);
a4 = Apartment(owner3, 9000);
