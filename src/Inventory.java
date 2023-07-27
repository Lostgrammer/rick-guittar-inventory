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
            Builder builder = searchGuitar.getBuilder(); //compara todos los elementos(enumeradores y variables) de la lista guitarra con el objeto searchGuitar
            String model = searchGuitar.getModel().toLowerCase();
            Type type = searchGuitar.getType();
            Wood backWood = searchGuitar.getBackWood();
            Wood topWood = searchGuitar.getTopWood();
            if (!guitarSpec.getBuilder().equals(builder)){
                continue;
            }
            if ((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel().toLowerCase()))){
                continue;
            }
            if (!guitarSpec.getType().equals(type)){
                continue;
            }
            if (!guitarSpec.getBackWood().equals(backWood)){
                continue;
            }
            if (!guitarSpec.getTopWood().equals(topWood)){
                continue;
            }
            guitarResult.add(guitar);
        }
        return guitarResult;
    }
}
