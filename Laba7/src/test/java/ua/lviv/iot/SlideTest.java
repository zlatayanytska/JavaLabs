package ua.lviv.iot.lab3;

public  class Slide extends Attraction {

    private int height;

    public Slide(int height1, int i, int height, String Attraction, int price, String duration, int avaibleFromAge) {
        super(Attraction,price,duration,avaibleFromAge);
        this.height = height;
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Labyrinth [height = " + height + " price = " + price + "]";
    }

    public int height() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
