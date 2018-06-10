package ua.lviv.iot.lab3;

import java.util.LinkedList;
import java.util.List;

public class Manager {
    public List<Attraction> atractionList = new LinkedList<>();

    public List<Attraction> sortByPrice(List<Attraction> result) {

       result.sort((Text1,Text2) -> Text1.getPrice() - Text2.getPrice());
        return result;
    }

    public void addAttraction(Attraction attractions) {
        this.atractionList.add(attractions);
    }

    public Manager() {

    }

    public List getAtractionList(){
        return atractionList;
    }

    public void setAtractionList(List<Attraction> atractionList) {
        this.atractionList = atractionList;
    }
}
