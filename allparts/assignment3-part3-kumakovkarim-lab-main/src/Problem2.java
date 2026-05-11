public class Problem2 {
    public int insertPosition(int[] A, int key) {
        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (A[mid] == key) {
                return mid;
            } else if (A[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    static void main(String[] args) {
        // test your code here
        System.out.println(new Problem2().insertPosition(new int[] {1, 2, 3, 4, 5}, 6));
    }
}