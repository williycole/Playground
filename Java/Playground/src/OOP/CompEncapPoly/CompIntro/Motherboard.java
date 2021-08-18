package OOP.CompEncapPoly.CompIntro;

public class Motherboard {
    private String model;
    private String manufacturer;
    private String bios;
    private int cardSlots;
    private int ramSlots;

    public Motherboard(String model, String manufacturer, String bios, int cardSlots, int ramSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.bios = bios;
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }
}
