public class Main {

    public static void main(String[] args) {
        WashingPowder Ariel = new WashingPowder (50, "USA", "Ariel", "floral smell", 600,970);
        WashingPowder Persil = new WashingPowder(40, "Ukraine", "Persil", "coolness", 500,700);
        WashingPowder Tide = new WashingPowder (43, "Poland", "Tide", "forest smell", 300,500);

        System.out.println(Ariel.toString());
        System.out.println(Persil.toString());
        System.out.println(Tide.toString());

        WashingPowder.printStaticSum();
        Ariel.printSum();
    }
}
