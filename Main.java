public class Main {
    public static void main(String[] args) {
        int nthTerm = 10;
        int numberOne = 0;
        int numberTwo = 1;

        for (int i = 0; i < nthTerm; i++) {
            System.out.println(numberOne);

            int temp = numberOne;
            numberOne += numberTwo;
            numberTwo = temp;
        }
    }
}