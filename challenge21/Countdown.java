package challenge21;

public class Countdown {

    public static void main(String[] args) {

        int count = 10;

        sum(count);

    }
    public static void sum(int count) {
        if (count > 0) {
            System.out.println(count);
            sum(count-1);
        } else {
            System.out.println(0);
        }
    }





}
