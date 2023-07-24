import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory(){
        guitars = new ArrayList<>();
    }
    //adding objects to the list
    public void addGuittar(String serialNumber,String builder, String model, String type, String backWood, String topWood,
                           double price){
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
        guitars.add(guitar);
    }

    public Guitar getGuittar(String serialNumber){
        for(Guitar guitar:guitars){
            if (guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar){
        for(Guitar guitar:guitars){
            //ignora serialnumber y price porque son unicos
            String builder = searchGuitar.getBuilder();
            String model = searchGuitar.getModel();
            String type = searchGuitar.getType();
            String backWood = searchGuitar.getBackWood();
            String topWood = searchGuitar.getTopWood();
            if (builder != null && !builder.equals("") && guitar.getBuilder().equals(builder)){
                continue;
            }
            if (model != null && !model.equals("") && guitar.getModel().equals(model)){
                continue;
            }
            if (type != null && !type.equals("") && guitar.getType().equals(type)){
                continue;
            }
            if (backWood != null && !backWood.equals("") && guitar.getBackWood().equals(backWood)){
                continue;
            }
            if (topWood != null && !topWood.equals("") && guitar.getTopWood().equals(topWood)){
                continue;
            }
        }
        return null;
    }
}
