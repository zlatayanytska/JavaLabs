        package ua.lviv.iot;
        import org.junit.jupiter.api.AfterEach;
        import org.junit.jupiter.api.BeforeAll;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import java.util.LinkedList;
        import java.util.List;
        import static org.junit.jupiter.api.Assertions.assertEquals;




class ManagerTest {
    static Manager manager;
    private static Attraction attraction= new Attraction("Attractions") ;
    private List<Attraction> testList = new LinkedList<>();

    @BeforeAll
    static void addAttractionsForTest() {
        manager = new Manager();
        manager.addAttraction(attraction);
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addAttraction() {
        Manager testManager = new Manager();
        Attraction catapult = null;
        testManager.addAttraction(catapult);
        assertEquals(catapult, testManager.getAtractionList().get(0));

    }

    @Test
    void sortByPrice() {
        testList = manager.sortByPrice(manager.getAtractionList());
        assertEquals(4, testList.size());
        assertEquals(attraction.getAge(), testList.get(0).getAge());
    }
}



