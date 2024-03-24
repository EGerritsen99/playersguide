package challenge36;

public class Player {

    //Fields
    private String name;
    private String xoChoice;

    // Constructors
    public Player(){
        getName();
        getXoChoice();
    }

    public Player(String name, String xoChoice) {
        setName(name);
        setXoChoice(xoChoice);
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXoChoice() {
        return xoChoice;
    }

    public void setXoChoice(String xoChoice) {
        this.xoChoice = xoChoice;
    }

}
