public class Problem5 {
    public int search(int[] A, int key) {
        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (A[mid] == key) {
                return mid;
            }

            if (A[low] <= A[mid]) {
                if (key >= A[low] && key < A[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (key > A[mid] && key <= A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    static void main(String[] args) {
        // test your code here
        Problem5 p = new Problem5();
        System.out.println(p.search(new int[]{4,5,6,7,8,9,10,1,2,3}, 9)); // right answer: 5
    }
}