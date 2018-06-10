public class Main {

    public static void main(String[] args) {
        WashingPowder ariel = new WashingPowder (50, "USA", "Ariel", "floral smell", 600,970);
        WashingPowder persil = new WashingPowder(40, "Ukraine", "Persil", "coolness", 500,700);
        WashingPowder tide = new WashingPowder (43, "Poland", "Tide", "forest smell", 300,500);

        System.out.println(Ariel.toString());
        System.out.println(Persil.toString());
        System.out.println(Tide.toString());

        WashingPowder.printStaticSum();
        Ariel.printSum();
    }
}
