package OOP.CompEncapPoly.PolyIntro;

public class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot(){
        return "Shark attacks";
    }
}
