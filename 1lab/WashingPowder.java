public class WashingPowder {

    private String price;
    private String country;
    private String brand;
    private String smell;
    private int weight;

    static int totalWeight;

    WashingPowder () {};

    public WashingPowder(String price, String country, String brand,String smell ) {
        this.price = price;
        this.country = country;
        this.brand = brand;
        this.smell = smell;
    }

    public WashingPowder(String price, String country, String brand,String smell , int weight, int totalWeight) {
        this.price = price;
        this.country = country;
        this.brand = brand;
        this.smell = smell;
        this.weight = weight;
        this.totalWeight = totalWeight;
    }

    public void setprice(String price) {
        this.price = price;
    }

    public void setcountry(String country) {
        this.country = country;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public void setsmell(String smell) {
        this.smell = smell;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String toString() {
        String objectInfo = "Instance of Washing Powder, fields: \n"
                + "price: " + price + "\n"
                + "country: " + country + "\n"
                + "brand: " + brand + "\n"
                + "smell: " + smell + "\n"
                + "weight: " + weight + "\n"
                + "totalWeight: " + totalWeight + "\n";
        return objectInfo;
    }

    public static void printStaticSum() {
        System.out.println("totalWeight: " + totalWeight + "\n");
    }

    public void printSum() {
        System.out.println("totalWeight: " + totalWeight + "\n");
    }

    public void resetValues(String price, String country, String brand,String smell , int weight, int totalWeight) {
        this.price = price;
        this.country = country;
        this.brand = brand;
        this.smell = smell;
        this.weight = weight;
        this.totalWeight = totalWeight;
    }
}