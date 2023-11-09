public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println(convertNumber(15));
    }

    public static String convertNumber(int number) {
        return number > 0 ? (number % 7 < 4 ? "positive-m" : "positive-p") : (number == 0 ? "zero" : (number % 7 > -4 ? "negative-m" : "negative-p"));
    }
}


