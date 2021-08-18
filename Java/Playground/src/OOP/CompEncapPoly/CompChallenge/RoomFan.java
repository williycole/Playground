package OOP.CompEncapPoly.CompChallenge;

public class RoomFan {
    private boolean isOn;
    private int fanSpeed;

    public RoomFan(boolean isOn, int fanSpeed) {
        this.isOn = isOn;
        this.fanSpeed = fanSpeed;
    }

    public void fanOn(boolean fanOnOff){
        if(fanOnOff == isOn){
            System.out.println("Your fan is on, it feels great in here!");
        } else {
            System.out.println("Your fan is off, it feels hot in here, turn it on!");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }
}
