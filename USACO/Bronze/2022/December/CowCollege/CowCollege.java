import java.util.Scanner;

public class CowCollege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCows = Integer.parseInt(sc.nextLine());
        String stringMaxTuitionPerCow = sc.nextLine();
        sc.close();
        
        long[] tuitionPerCow = new long[numCows];
        String[] stringTuitionPerCow = stringMaxTuitionPerCow.split(" ");
        for (int i = 0; i < numCows; i++) {
            tuitionPerCow[i] = Integer.parseInt(stringTuitionPerCow[i]);
        }

        long leastOnePerCow = 0;
        long maxTotalAmount = 0;

        // for each cow, find out how many cows can pay this tuition
        for (int i = 0; i < numCows; i++) {
            long oneCowPay = tuitionPerCow[i];
            long totalAmount = 0;
            // how many cows can pay this particular tuition
            for (int j = 0; j < numCows; j++) {
                if (oneCowPay <= tuitionPerCow[j]) {
                    totalAmount += oneCowPay;
                }
            }

            if (totalAmount > maxTotalAmount) {
                maxTotalAmount = totalAmount;
                leastOnePerCow = oneCowPay;
            } else if (totalAmount == maxTotalAmount && oneCowPay < leastOnePerCow) {
                leastOnePerCow = oneCowPay;
            }
        }

        System.out.println(maxTotalAmount + " " + leastOnePerCow);
    }
}
