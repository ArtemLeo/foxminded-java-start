package foxminded_07_Boolean;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        int j = 2;
        double answer = (double) i / j;
        boolean isMoreThanOne;
        if (answer > 1) {
            isMoreThanOne = true;
            System.out.println(isMoreThanOne);
        } else {
            isMoreThanOne = false;
            System.out.println(isMoreThanOne);
        }

        // Ternary operator;
        boolean tmp = (answer > 1) ? true : false;
        System.out.println(tmp);
    }
}
