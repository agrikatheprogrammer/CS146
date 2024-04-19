
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        for (int i=0;i<n;i++) {
            if (isBadVersion(i))
                return i;
        }
    }
}
