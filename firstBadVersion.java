/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int first=0;
            int last=n;
            while(first<=last){
                int middle=first+(last-first)/2;
                if(isBadVersion(middle)==true && isBadVersion(middle-1)==false)
                    return middle;
                else if(isBadVersion(middle)==false)
                    first=middle+1;
                else last=middle;
            }
            return -1;
        }
    }