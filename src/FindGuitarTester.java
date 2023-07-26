import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory); //inicializamos el inventario

        GuitarSpec order1 = new GuitarSpec("Stratocastor", Builder.FENDER,
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        List<Guitar> resultGuitars;//iniciamos una variable de una lista de objetos
        resultGuitars = inventory.search(order1); //esta variable almacena lista de objetos que es el resultado de aplicar el metodo search al inventario con un objeto como argumento

        if(!resultGuitars.isEmpty()){
            System.out.println("Dear customer, you would like these guitars: ");
            for (Guitar guitar:resultGuitars){
                GuitarSpec spec = guitar.getSpec(); //el objeto de GuitarSpec contiene sus atributos a traves de .getSpec
                System.out.println("We have a "+spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " guitar:\n  " +
                        spec.getBackWood() + " back and sides,\n  "+
                        spec.getTopWood()+ " top.\nYou can have it for only $"+
                        guitar.getPrice()+"!\n ----");
            }
        }else {
            System.out.println("Sorry dear customer, we don't have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory){
        inventory.addGuitar("V95693", Builder.FENDER, "Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER,
        1499.95);
        inventory.addGuitar("V9512", Builder.FENDER, "Stratocastor", Type.ELECTRIC,Wood.ALDER,Wood.ALDER,
                1499.95);
    }
}
