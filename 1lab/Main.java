public class Main {
    public static void main(String [] args) {

        WashingPowder poroshok = new WashingPowder();

        poroshok.setprice("50");
        poroshok.setcountry("USA");
        poroshok.setbrand("Tide");
        poroshok.setsmell("floral smell");
        poroshok.setWeight(100);
        poroshok.totalWeight = 300;

        System.out.println(poroshok.toString());
        poroshok.printStaticSum();
        poroshok.printSum();

        WashingPowder poroshok1 = new WashingPowder("40", "Ukraine", "Ariel", "coolness");
        poroshok1.setWeight(100);
        poroshok1.totalWeight = 300;

        System.out.println(poroshok1.toString());
        poroshok1.printStaticSum();
        poroshok1.printSum();

        WashingPowder poroshok2 = new WashingPowder("45", "Poland", "Persil", "forest smell", 100, 300);

        System.out.println(poroshok2.toString());
        poroshok2.printStaticSum();
        poroshok2.printSum();
    }
}