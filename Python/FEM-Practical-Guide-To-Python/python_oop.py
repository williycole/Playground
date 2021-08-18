class Vehicle:
    runs = True

    #constructors in python are __init__
    def __init__(self, make, model, fuel):
        self.make = make
        self.model = model
        self.fuel = fuel
    # class method shares this method over all the instances of a class or subclass
    @classmethod
    def get_number_of_wheels(cls):
        return cls.number_of_wheels

    def start(self):
        # self is kind of like this, it refers to "this" instance
        if self.runs:
            print("Car is started. Vroom vroom!")
        else:
            print("Car is broken :(")

    # These are for debugging purposes only
    # Both functions return a string representation of an object. __str__()
    # should return readable end-user output, and __repr__() should return the Python code necessary to rebuild the object.
    # you should generally have a __str__ and a __repr__ in all of your classes as is convention
    def __str__(self):
        return f"<<Car object: {self.make} {self.model}>>"

    def __repr__(self):
        return f"Car('{self.make}', '{self.model}')"

# inheritance
# In the parentheses of car you put the class that it inherets from
# then you have to build the constructor with __init__ and the super below it
class Car(Vehicle):
    def __init__(self, make, model, fuel="gas"):
      super().__init__(make, model, fuel)


my_car = Car()
print(f"Cars have {Car.get_number_of_wheels()} wheels.")
# Of course, we can override this in our instance:
my_car.number_of_wheels = 6
# And when we access our new instance variable:
print(f"My car has {my_car.number_of_wheels} wheels.")
# But, when we call our class method on our instance:
print(f"My car has {my_car.get_number_of_wheels()} wheels.")
#checks to see what the instance is
isinstance(my_car, float)
isinstance(my_car, Car)