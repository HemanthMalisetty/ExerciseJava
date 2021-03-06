public class Exercise25 {
    public int countFibonacciNumbers(int m, int n) {
        int a1 = 0, a2 = 1, a3 = 1;
        int count = 0;
        while (a1 <= n) {
            if (a1 >= m) {
                count++;
            }
            a1 = a2;
            a2 = a3;
            a3 = a1 + a2;
        }
        return count;
    }
}
