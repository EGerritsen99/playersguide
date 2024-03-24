package challenge43;

public class ColoredItem <T> {
	
	// Fields
	private T coloredItem;
	
	// Constructor
	public ColoredItem(T coloredItem){
		this.coloredItem = coloredItem;
	}
	
	//Methods
	public void display() {

		if (coloredItem instanceof Sword) {
			String colourOfText = "\u001B[44m";
			System.out.println(colourOfText + ((Sword) coloredItem).getStringValue());
		}


		if (coloredItem instanceof Bow) {
			String colourOfText = "\u001B[41m";
			System.out.println(colourOfText + ((Bow) coloredItem).getStringValue());
		}

		if (coloredItem instanceof Axe) {
			String colourOfText = "\u001B[42m";
			System.out.println(colourOfText + ((Axe) coloredItem).getStringValue());
		}

	}
	
	// Getters and setters
	public T getColoredItem() {
		return coloredItem;
	}
	
	public void setColoredItem(T coloredItem) {
		this.coloredItem = coloredItem;
	}
	
	
}