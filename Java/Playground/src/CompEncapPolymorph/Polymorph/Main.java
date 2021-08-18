package CompEncapPolymorph.Polymorph;

public class Main {
    public static void main(String[] args) {
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4wD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
    }
}
