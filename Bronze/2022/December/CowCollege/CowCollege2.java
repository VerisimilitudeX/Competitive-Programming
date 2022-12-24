import java.math.BigInteger;
import java.util.Scanner;

public class CowCollege2 {
    public static void main(String[] args) {
        // get input from user using Scanner
        Scanner scanner = new Scanner(System.in);
        int numCows = scanner.nextInt();

        BigInteger[] tuitionPerCow = new BigInteger[numCows];
        for (int i = 0; i < numCows; i++) {
            tuitionPerCow[i] = scanner.nextBigInteger();
        }

        BigInteger maxTotalAmount = BigInteger.ZERO;
        BigInteger leastOnePerCow = BigInteger.ZERO;
        for (int i = 0; i < numCows; i++) {
            BigInteger oneCowPay = tuitionPerCow[i];
            BigInteger totalAmount = BigInteger.ZERO;
            // how many cows can pay this particular tuition
            for (int j = 0; j < numCows; j++) {
                if (oneCowPay.compareTo(tuitionPerCow[j]) <= 0) {
                    totalAmount = totalAmount.add(oneCowPay);
                }
            }

            if (totalAmount.compareTo(maxTotalAmount) > 0) {
                maxTotalAmount = totalAmount;
                leastOnePerCow = oneCowPay;
            } else if (totalAmount.compareTo(maxTotalAmount) == 0) {
                if (oneCowPay.compareTo(leastOnePerCow) < 0) {
                    leastOnePerCow = oneCowPay;
                }
            }
        }

        System.out.println(maxTotalAmount + " " + leastOnePerCow);
    }
}
