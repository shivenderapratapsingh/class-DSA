public class Question14 {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            // Make sure nums1 is the smaller array
            if (nums1.length > nums2.length) {
                return findMedianSortedArrays(nums2, nums1);
            }
    
            int m = nums1.length;
            int n = nums2.length;
            int l = 0, r = m;
    
            while (l <= r) {
                int Px = l + (r - l) / 2;
                int Py = (m + n + 1) / 2 - Px;
    
                // Left half values
                int x1 = (Px == 0) ? Integer.MIN_VALUE : nums1[Px - 1];
                int x2 = (Py == 0) ? Integer.MIN_VALUE : nums2[Py - 1];
    
                // Right half values
                int x3 = (Px == m) ? Integer.MAX_VALUE : nums1[Px];
                int x4 = (Py == n) ? Integer.MAX_VALUE : nums2[Py];
    
                if (x1 <= x4 && x2 <= x3) {
                    if ((m + n) % 2 == 1) {
                        return Math.max(x1, x2);
                    } else {
                        return (Math.max(x1, x2) + Math.min(x3, x4)) / 2.0;
                    }
                } else if (x1 > x4) {
                    r = Px - 1;
                } else {
                    l = Px + 1;
                }
            }
    
            return -1; // Should never reach here
        }
    
}
