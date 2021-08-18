package OOP.CompEncapPoly.CompIntro;

public class Pc {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Pc(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();

    }

    private void drawLogo() {
        //Fancy Graphics
        monitor.drawPixelAt(1200, 50, "yellow");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("-_-_-_-_BOOTING UP_-_-_-_-_");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-");
    }


}
