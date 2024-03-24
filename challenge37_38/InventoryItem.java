package challenge37_38;

public class InventoryItem {

    //Fields
    private double weight;
    private double volume;
    private String stringValue;

    // Constructor
    public InventoryItem (double weight, double volume, String stringValue) {

        setWeight(weight);
        setVolume(volume);
        setStringValue(stringValue);

    }

    //Getters and Setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }


}
