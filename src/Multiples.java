public class Multiples {
    public static void main(String[] args) {
        int amountMultiples = 0;

        for (int i = 1; i < 1000; i++) {

            boolean divisibleby3 = i % 3 == 0;
            boolean divisibleby5 = i % 5 == 0;

            if (divisibleby3 || divisibleby5) {
                System.out.println(i + " is a multiple of 3 or 5");
                amountMultiples++;
            }
        }
        System.out.println("There are " + amountMultiples + " multiples of 3 and 5 below 1000");
    }
}
