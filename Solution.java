import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> primes = new HashSet<>();

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                primes.add(i);
                int complement = n - i;
                if (primes.contains(complement)) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(complement);
                    pair.add(i);
                    result.add(pair);
                }
            }
        }

        return result;
    }

    private boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    if (n == 2) {
        return true;
    }
    if (n % 2 == 0) {
        return false;
    }
    int sqrt = (int) Math.sqrt(n);
    for (int i = 3; i <= sqrt; i += 2) {
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}
}