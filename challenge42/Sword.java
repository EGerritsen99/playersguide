package challenge42;

enum Gemstone {

    AMBER,
    EMERALD,
    DIAMOND,
    SAPPHIRE,
    BITSTONE,
    NONE

}

enum Material {

    WOOD,
    BRONZE,
    IRON,
    STEEL,
    BINARIUM


}

public record Sword (Material material, Gemstone gemstone, int length, int crossguardWidth) {

    public Sword (Material material, Gemstone gemstone) {
        this(material, gemstone, 60, 20);
    }


    public String toString() {
        String materialToString;
        String gemstoneToString;

        if (material == Material.IRON) {
            materialToString = "An iron";
        } else {
            materialToString = "A " + material.name().toLowerCase();
        }


        if (gemstone == Gemstone.NONE) {
            gemstoneToString = " without a gemstone";
        } else if (gemstone == Gemstone.AMBER || gemstone == Gemstone.EMERALD) {
            gemstoneToString = " with an " + gemstone.name().toLowerCase();
        } else {
            gemstoneToString = " with a " + gemstone.name().toLowerCase();
        }

        String message = materialToString + " sword" + gemstoneToString + " embedded. It has a " + crossguardWidth
                + " centimeter wide crossguard, and a " + length + " centimeter long blade.";

        return message;
    }

    public Sword withMaterial(Material material) {

        Sword newSword = new Sword(material, this.gemstone, this.length, this.crossguardWidth);
        return newSword;

    }

    public Sword withGemstone(Gemstone gemstone) {

        Sword newSword = new Sword(this.material, gemstone, this.length, this.crossguardWidth);
        return newSword;

    }

    public Sword withLength(int length) {

        Sword newSword = new Sword(this.material, this.gemstone, length, this.crossguardWidth);
        return newSword;

    }

    public Sword withCrossGuardWidth(int crossguardWidth) {

        Sword newSword = new Sword(this.material, this.gemstone, this.length, crossguardWidth);
        return newSword;

    }

}
