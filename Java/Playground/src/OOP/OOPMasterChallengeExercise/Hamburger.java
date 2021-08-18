package OOP.OOPMasterChallengeExercise;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;


    //additions methods
    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.price = + addition1Price + price;

    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.price = + addition2Price + price;
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.price = + addition3Price + price;
        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.price = + addition4Price + price;
        System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
    }

    //total method
    public double itemizeHamburger(){
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
        return (price + addition1Price + addition2Price + addition3Price + addition4Price);
    }
}
