package challenge29;

public class TheColor extends Colors {

    public static void main(String[] args) {

        Colors color1 = new Colors(255, 255, 0);
        System.out.println(color1.displayColor());

        Colors color2 = new Colors(Colors.GREEN);
        System.out.println(color2.displayColor());

    }

}
