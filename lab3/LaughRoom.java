package ua.lviv.iot.lab3;

public  class LaughRoom extends Attraction {

    private int clownsCount;

    public LaughRoom(int count, int i, int clownsCount, String Attraction, int price, String duration, int avaibleFromAge) {
        super(Attraction,price,duration,avaibleFromAge);
        this.clownsCount = clownsCount;
        setPrice(price);
    }

    @Override
    public String toString() {
        return "LaughRoom [clownsCount = " + clownsCount + " price = " + price + "]";
    }

    public int clownsCount() {
        return clownsCount;
    }

    public void setClownsCount(int clownsCount) {
        this.clownsCount = clownsCount;
    }

}
