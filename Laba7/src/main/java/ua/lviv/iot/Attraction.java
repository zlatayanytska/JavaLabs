package ua.lviv.iot.lab3;

public  class Attraction {

    public String attractions;
    public int price;
    public String duration;
    public int avaibleFromAge;

    public Attraction() {

    }

    public Attraction(String Attraction, int price, String duration, int avaibleFromAge) {
        setAttractions(attractions);
        setPrice(price);
        setDuration(duration);
        setAvaibleFromAge(avaibleFromAge);
    }


    public String getAttractions() {
        return attractions;
    }

    public void setAttractions(String attractions) {
        this.attractions = attractions;
    }
    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int avaibleFromAge() {
        return avaibleFromAge;
    }

    public void setAvaibleFromAge(int avaibleFromAge) {
        this.avaibleFromAge = avaibleFromAge;
    }
}