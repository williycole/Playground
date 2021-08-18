package ConstrucClassesInherAbstrInnerClass.InnerClass.Playlist.InnerAndAbstractClasses;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for (int i = 0; i < maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if((number >0) && (number <= maxGears)){
            this.gears.add(new Gear(number, ratio));
        }
    }

    public double wheelSpeed(int revs){
        if (clutchIsIn){
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    public void changeGear(int newGear){
        if((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn){
            System.out.println("Changing gears from " + this.currentGear + " to " + newGear);
            this.currentGear = newGear;
        }else {
            System.out.println("Grinding gears, gear not changed. Make sure you press the clutch in...");
        }

        if(currentGear <= 3){
            System.out.println("Alright baby here we go!");
        }

        if(currentGear == 4){
            System.out.println("We are hauling now, eat my dust baby!!!");
        }
    }



    //-----Inner Class-----
        private class Gear{
            private int gearNumber;
            private double ratio;

            public Gear(int gearNumber, double ratio) {
                this.gearNumber = gearNumber;//referse to gearNumber in inner class not outter
                this.ratio = ratio;
            }

        public double getRatio() {
            return ratio;
        }

        public double  driveSpeed(int revs){
            return revs * (this.ratio);
            }
        }
}
