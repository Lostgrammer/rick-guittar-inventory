import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory(){
        guitars = new ArrayList<>();
    }
    //adding objects to the list
    public void addGuitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood,
                           double price){
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
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

    public List<Guitar> search(Guitar searchGuitar){
        List<Guitar> guitarResult = new ArrayList<>();
        for(Guitar guitar:guitars){
            //ignora serialnumber y price porque son unicos
            Builder builder = searchGuitar.getBuilder();
            String model = searchGuitar.getModel().toLowerCase();
            Type type = searchGuitar.getType();
            Wood backWood = searchGuitar.getBackWood();
            Wood topWood = searchGuitar.getTopWood();
            if (!guitar.getBuilder().equals(builder)){
                continue;
            }
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase()))){
                continue;
            }
            if (!guitar.getType().equals(type)){
                continue;
            }
            if (!guitar.getBackWood().equals(backWood)){
                continue;
            }
            if (!guitar.getTopWood().equals(topWood)){
                continue;
            }
            guitarResult.add(guitar);
        }
        return guitarResult;
    }
}
