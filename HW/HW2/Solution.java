
public class Solution extends VersionControl {
    /*FIRST SOLUTION:
    Runtime 32 ms Beats 17.84% of users with Java
    Memory 39.96 MB Beats 85.55% of users with Java
    */
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)==false ) low = mid+1;
            else if (isBadVersion(mid-1)==false) return mid;
            else high= mid-1;
        }     
        return -1;
    }
}
