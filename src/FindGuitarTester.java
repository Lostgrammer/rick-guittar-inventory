import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec order1 = new GuitarSpec("Stratocastor", Builder.FENDER,
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);
        List<Guitar> resultGuitars;
        resultGuitars = inventory.search(order1);

        if(!resultGuitars.isEmpty()){
            System.out.println("Dear customer, you would like these guitars: ");
            for (Guitar guitar:resultGuitars){
                GuitarSpec spec = guitar.getSpec();
                System.out.println("We have a "+spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " guitar:\n  " +
                        spec.getBackWood() + " back and sides,\n  "+
                        spec.getTopWood()+ " top.\n  "+
                        spec.getNumStrings()+ " strings.\nYou can have it for only $"+
                        guitar.getPrice()+"!\n ----");
            }
        }else {
            System.out.println("Sorry dear customer, we don't have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory){
        //modificando argumentos del metodo addGuitar
        inventory.addGuitar("V95693",1499.95,
                new GuitarSpec("Stratocastor",Builder.FENDER,Type.ELECTRIC,Wood.ALDER,Wood.ALDER,12));
        inventory.addGuitar("V95693",1499.95,
                new GuitarSpec("Stratocastor",Builder.FENDER,Type.ELECTRIC,Wood.ALDER,Wood.ALDER,12));
    }
}
