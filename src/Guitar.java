import enums.Builder;
import enums.Type;
import enums.Wood;

public class Guitar {
    private String serialNumber; //no son tipo enum porque no son valores que se limitan a un numero fijo de opciones
    private double price;
    private GuitarSpec spec;

    public Guitar(String serialNumber, Builder builder, String model,Type type, Wood backWood, Wood topWood, double price){
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = new GuitarSpec(model,builder, type, backWood, topWood);//declarando el objeto spec
    }

    public double getPrice() {
        return price;
    }
    //el unico que tiene setter es el precio, debido a que es el unico que deberia poder cambiarse despues de haberse creado el objeto
    public void setPrice(double price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public GuitarSpec getSpec() {
        return spec;
    }
}
