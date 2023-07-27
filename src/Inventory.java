import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory(){
        guitars = new ArrayList<>(); //iniciamos una lista de objetos guitarra
    }
    //adding objects to the guitar list
    public void addGuitar(String serialNumber,
                          double price, GuitarSpec spec){
        Guitar guitar = new Guitar(serialNumber, price, spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Guitar guitar:guitars){
            if (guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchGuitar){
        List<Guitar> guitarResult = new ArrayList<>();
        for(Guitar guitar:guitars){//pasamos por todas las guitarras dentro de la lista guitar
            GuitarSpec guitarSpec = guitar.getSpec();
            if (guitarSpec.matches(searchGuitar)) {
                guitarResult.add(guitar);
            }
        }
        return guitarResult;
    }
}
