package ua.lviv.iot.lab3;

import java.util.List;

public class Main {

    public static void printList(List<Attraction> List) {
        List.forEach((Attraction x) -> {
            System.out.println(x.toString());

        });

    }


    public static void main(String[] args){
        Manager DisneyLand = new Manager();

        DisneyLand.addAttraction(new Catapult(5, 6,7,"a", 6,"10", 4));
        DisneyLand.addAttraction(new Slide(5, 6,7,"a", 6,"10", 4));
        DisneyLand.addAttraction(new ChildrenTrain(5, 6,"Bob","a", 6,"10", 4));
        DisneyLand.addAttraction(new ElectricCarAutodrome(5, 6,7,"a", 6,"10", 4));
        DisneyLand.addAttraction(new FerrisWheel(5, 6,7,"a", 6,"10", 4));
        DisneyLand.addAttraction(new Labyrinth(5, 6,7,"a", 6,"10", 4));
        DisneyLand.addAttraction(new LaughRoom(5, 6,7,"a", 6,"10", 4));
        DisneyLand.addAttraction(new RollerCoaster(5, 6,7,"a", 6,"10", 4));




        System.out.println("\nAvailable attractions \n");
        printList(DisneyLand.getAtractionList());
    }
}
