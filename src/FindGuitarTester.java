public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar searchTest = new Guitar("", "fender", "Stratocastor", "electric", "Alder",
                                        "Alder",0);
        Guitar guitar = inventory.search(searchTest);
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
        inventory.addGuittar("V95693","Fender","Stratocastor","electric","Alder","Alder",
        1499.95);
    }
}
