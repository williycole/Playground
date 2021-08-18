package OOP.InheritanceChallengeVid88;

public class ChevyTrailBlazer extends Car{
    private boolean isMudTruck;

    public ChevyTrailBlazer(String gearType, String name, String color, String wheelType, int numDoors, boolean isMudTruck) {
        super(gearType, "Chevy Trail  Blazer", color, wheelType, numDoors);
        this.isMudTruck = isMudTruck;
    }

}
