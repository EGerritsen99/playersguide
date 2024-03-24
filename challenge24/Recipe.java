package challenge24;

public class Recipe {

    public enum Type {
        SOUP("Soup"),
        STEW("Stew"),
        GUMBO("Gumbo");

        final String stringValue;

        Type(String stringValue) {
            this.stringValue = stringValue;
        }

    }

    public enum Ingredient {
        MUSHROOM("Mushroom"),
        CHICKEN("Chicken"),
        CARROTS("Carrots"),
        POTATOES("Potatoes");

        final String stringValue;

        Ingredient(String stringValue) {
            this.stringValue = stringValue;
        }
    }

    public enum Seasoning {
        SPICY("Spicy"),
        SALTY("Salty"),
        SWEET("Sweet");

        final String stringValue;

        Seasoning(String stringValue) {
            this.stringValue = stringValue;
        }
    }

}


