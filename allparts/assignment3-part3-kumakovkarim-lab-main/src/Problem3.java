public class Problem3 {
    public int sqrt(int x) {
        if (x < 2) {
            return x;
        }

        int low = 1;
        int high = x;
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    static void main(String[] args) {
        // test your code here
        Problem3 p = new Problem3();
        System.out.println(p.sqrt(10));
    }
}