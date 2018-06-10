package ua.lviv.iot.lab3;

public  class RollerCoaster extends Attraction {

    private int wagonsCount;
    private int speed;
    private int height;

    public RollerCoaster(int wagonsCount, int speed, int height, String Attraction, int price, String duration, int avaibleFromAge) {
        super(Attraction,price,duration,avaibleFromAge);
        this.wagonsCount = wagonsCount;
        this.speed = speed;
        this.height = height;
        setPrice(price);
    }

    @Override
    public String toString() {
        return "RollerCoaster [wagonsCount = " + wagonsCount + ", speed = " + speed + ", height = "
                + height + " price = " + price + "]";
    }

    public int getwagonsCount() {
        return wagonsCount;
    }

    public void setWagonsCount(int wagonsCount) {
        this.wagonsCount = wagonsCount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
