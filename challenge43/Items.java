package challenge43;

public class Items{

	public static void main(String[] args) {
		
		Sword sword = new Sword();
		Bow bow = new Bow();
		Axe axe = new Axe();

		ColoredItem<Sword> blueSword = new ColoredItem<>(sword);
		ColoredItem<Bow> redBow = new ColoredItem<>(bow);
		ColoredItem<Axe> greenAxe = new ColoredItem<>(axe);

		blueSword.display();
		redBow.display();
		greenAxe.display();

	}
	
}