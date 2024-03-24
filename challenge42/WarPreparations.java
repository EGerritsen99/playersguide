package challenge42;

public class WarPreparations {

    public static void main(String[] args) {

        Sword basicSword = new Sword(Material.IRON, Gemstone.NONE);

        Sword newSword = basicSword.withMaterial(Material.BRONZE);
        Sword anotherSword = basicSword.withGemstone(Gemstone.EMERALD);

        System.out.println(basicSword);
        System.out.println(newSword);
        System.out.println(anotherSword);

    }

}
