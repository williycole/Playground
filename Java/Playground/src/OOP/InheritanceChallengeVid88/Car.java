package OOP.InheritanceChallengeVid88;

public class Car extends Vehicle{
    private String color;
    private String wheelType;
    private int numDoors;

    private String newColor;

    public Car(String gearType, String name, String color, String wheelType, int numDoors) {
        super(gearType, name);
        this.color = color;
        this.wheelType = wheelType;
        this.numDoors = numDoors;
    }


    public void newPaintJob(String color){
        this.newColor = color;
        System.out.println("newPaintJob(): This car just got a new paint job and is now the color "  + color);
    }


}
