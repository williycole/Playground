package MiscPuzzles;

public class LargestPrime {
    public static void main(String[] args) {
        getLargestPrime(21);
        getLargestPrime(217);
    }

    public static int getLargestPrime(int number) {
        int maxPrime = -1;
        if (number <= 1) {
            return -1;
        } else {
            while (number % 2 == 0) {
                maxPrime = 2;
                number >>= 1;
            }

            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                while (number % i == 0) {
                    maxPrime = i;
                    number = number / i;
                }
            }

            if (number > 2) {
                maxPrime = number;
            }
        }
        number = maxPrime;
        System.out.println(number);
        return number;
    }
}
