import enums.Builder;
import enums.Type;
import enums.Wood;

public class GuitarSpec {
    private String model;
    private Builder builder; //Builder: tipo de dato / builder:nombre de la variable
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings; //nuevo atributo

    public GuitarSpec(String model, Builder builder,Type type, Wood backWood, Wood topWood, int numStrings){
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
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

    public int getNumStrings() {
        return numStrings;
    }

    //add matches method
    public boolean matches(GuitarSpec otherSpec){
        if (!otherSpec.builder.equals(builder)){
            return false;
        }
        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model))){
            return false;
        }
        if (!otherSpec.type.equals(type)){
            return false;
        }
        if (!otherSpec.backWood.equals(backWood)){
            return false;
        }
        if (!otherSpec.topWood.equals(topWood)){
            return false;
        }
        return true;
    }
}
