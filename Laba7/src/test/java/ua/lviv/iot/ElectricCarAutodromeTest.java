package ua.lviv.iot.lab3;

public  class ElectricCarAutodrome extends Attraction {

    private int carCount;
    private int speed;

    public ElectricCarAutodrome(int count, int carCount, int speed, String Attraction, int price, String duration, int avaibleFromAge) {
        super(Attraction,price,duration,avaibleFromAge);
        this.carCount = carCount;
        this.speed= speed;
        setPrice(price);
    }

    @Override
    public String toString() {
        return "ElectricCarAutodrome [ carCount= " +  carCount + ", speed = " + speed + " price = " + price + "]";    }

    public int carCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
