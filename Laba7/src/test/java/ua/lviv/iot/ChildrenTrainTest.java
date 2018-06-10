package ua.lviv.iot.lab3;

public  class ChildrenTrain extends Attraction {

    private int wagonsCount;
    private int pasangersCount ;
    private String driverName;

    public ChildrenTrain(int wagonsCount, int pasangersCount, String driverName, String Attraction, int price, String duration, int avaibleFromAge) {
        super(Attraction,price,duration,avaibleFromAge);
        this.wagonsCount = wagonsCount;
        this.pasangersCount = pasangersCount;
        this.driverName = driverName;
        setPrice(price);
    }

    @Override
    public String toString() {
        return "ChildrenTrain [wagonsCount = " + wagonsCount + ", pasangersCount = " + pasangersCount + ", driverName = "
                + driverName + " price = " + price + "]";
    }

    public int getwagonsCount() {
        return wagonsCount;
    }

    public void setWagonsCount(int wagonsCount) {
        this.wagonsCount = wagonsCount;
    }

    public int getPasangersCount() {
        return pasangersCount;
    }

    public void setPasangersCount(int pasangersCount) {
        this.pasangersCount = pasangersCount;
    }
    public String getDriverName() {
        return driverName;
    }

    public void setdriverName(String driverName) {
        this.driverName = driverName;
    }

}
