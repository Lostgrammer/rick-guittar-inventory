import enums.Builder;
import enums.Type;
import enums.Wood;

public class Guitar {
    private String serialNumber, model; //no son tipo enum porque no son valores que se limitan a un numero fijo de opciones
    private double price;
    private Builder builder; //Builder: tipo de dato / builder:nombre de la variable
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public Guitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood,
                  double price){
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.price = price;
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

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }
}
