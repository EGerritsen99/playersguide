package challenge24;

import java.io.InputStream;
import java.util.Scanner;

public class Soup extends Recipe{

    ///////// Fields ///////////
    private Type type;
    private Ingredient ingredient;
    private Seasoning seasoning;

    //////// Constructor ///////////

    public Soup(){
        type = getType();
        ingredient = getIngredient();
        seasoning = getSeasoning();
    }


    ///////// Methods ///////////

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Seasoning getSeasoning() {
        return seasoning;
    }

    public void setSeasoning(Seasoning seasoning) {
        this.seasoning = seasoning;
    }

}
