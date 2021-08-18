package Math;


public class GreatestCommonDivisor {
    public static void main(String[] args) {
        getGreatestCommonDivisor(25, 15);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            System.out.println(-1);
            return -1;
        } else {
            int gcd = 1;
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
            }
            System.out.println(gcd);
            return gcd;
        }
    }
}
