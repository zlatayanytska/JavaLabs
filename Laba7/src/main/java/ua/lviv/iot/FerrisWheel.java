package ua.lviv.iot.lab3;

public  class FerrisWheel extends Attraction {

    private int cabsCount;
    private int height;
    private int speed;

    public FerrisWheel(int cabsCount, int height, int speed, String Attraction, int price, String duration, int avaibleFromAge) {
        super(Attraction,price,duration,avaibleFromAge);
        this.cabsCount = cabsCount;
        this.height = height;
        this.speed= speed;
        setPrice(price);
    }

    @Override
    public String toString() {
        return "FerrisWheel[ cabsCount= " +  cabsCount +", height = " + height +  ", speed = " + speed + " price = " + price + "]";    }

    public int cabsCount() {
        return cabsCount;
    }

    public void setCabsCount(int cabsCount) {
        this.cabsCount = cabsCount;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
