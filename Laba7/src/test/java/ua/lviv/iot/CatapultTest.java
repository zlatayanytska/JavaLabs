package ua.lviv.iot.lab3;

public  class Catapult extends Attraction {

    private int participantsCount;
    private int pushHeight;
    private int speed;

    public Catapult(int participantsCount, int pushHeight, int speed, String Attraction, int price, String duration, int avaibleFromAge) {
        super(Attraction,price,duration,avaibleFromAge);
        this.participantsCount = participantsCount;
        this.pushHeight = pushHeight;
        this.speed = speed;
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Catapult [ participantsCount = " +  participantsCount + ", pushHeight = " + pushHeight + ", speed = "
                + speed + " price = " + price + "]";
    }

    public int participantsCount() {
        return participantsCount;
    }

    public void setParticipantsCount(int participantsCount) {
        this.participantsCount = participantsCount;
    }

    public int pushHeight() {
        return pushHeight;
    }

    public void setPushHeight(int pushHeight) {
        this.pushHeight = pushHeight;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
