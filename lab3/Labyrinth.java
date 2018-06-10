package ua.lviv.iot.lab3;

public  class Labyrinth extends Attraction {

    private int length;


    public Labyrinth(int length1, int i, int length, String Attraction, int price, String duration, int avaibleFromAge) {
        super(Attraction,price,duration,avaibleFromAge);
        this.length = length;
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Labyrinth [length = " + length + " price = " + price + "]";
    }

    public int length() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
