public class Problem4 extends VersionControl {
    Problem4(int n, int first) {
        super(n, first);
    }

    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static void main(String[] args) {
        int n = 1000;
        int first = 100;
        Problem4 problem4 = new Problem4(n, first);
        System.out.println(problem4.firstBadVersion(n));
        System.out.println(problem4.getCount() + " API calls to isBadVersion()");
    }
}

class VersionControl {
    private int n;
    private int firstBadVersion;
    private int count = 0;

    public VersionControl(int n, int firstBadVersion) {
        this.n = n;
        this.firstBadVersion = firstBadVersion;
    }

    public boolean isBadVersion(int version) {
        count++;
        return version >= firstBadVersion;
    }

    public int getCount() {
        return count;
    }
}