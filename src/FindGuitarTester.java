import enums.Builder;
import enums.Type;
import enums.Wood;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar orden1 = new Guitar("", Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER,0);
        Guitar guitar = inventory.search(orden1);
        if(guitar!=null){
            System.out.println("Dear customer, you would like this " +
                    guitar.getBuilder() + "" + guitar.getModel() + "" +
                    guitar.getType() + " guitar:\n  " +
                    guitar.getBackWood() + " back and sides,\n  "+
                    guitar.getTopWood()+ " top.\nYou can have it for only $"+
                    guitar.getPrice()+"!");
        }else {
            System.out.println("Sorry dear customer, we don't have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory){
        inventory.addGuitar("V95693",Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER,
        1499.95);
    }
}
