package OOP.InheritanceChallengeVid88;

public class Vehicle {


    private String gearType;
    private String movingSpeed;
    private String name;
    private String leftOrRight;


    public Vehicle(String gearType, String name) {
        this.gearType = gearType;
        this.name = name;
    }


    public void steerSide(String leftRight){
        this.leftOrRight += leftRight;
        System.out.println("Vehicle.steerSide(): This Vehicle has a steering wheel on the " + leftRight + " side of the vehicle.");
    }

    public void howFast(String speed){
        this.movingSpeed = speed;
        System.out.println("howFast(): This Vehicle is " + speed);
    }


    public String getGearType() {
        return gearType;
    }

    public String getMovingSpeed() {
        return movingSpeed;
    }

    public String getName() {
        return name;
    }

    public String getLeftOrRight() {
        return leftOrRight;
    }
}
